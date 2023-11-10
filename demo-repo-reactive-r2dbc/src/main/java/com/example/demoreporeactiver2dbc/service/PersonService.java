package com.example.demoreporeactiver2dbc.service;

import com.example.demoreporeactiver2dbc.data.Person;
import com.example.demoreporeactiver2dbc.repository.r2dbc.PersonTemplateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.data.relational.core.query.Criteria;
import org.springframework.data.relational.core.query.Query;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import static org.springframework.data.relational.core.query.Criteria.where;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonTemplateRepository personTemplateRepository;
    public Flux<Person> findByName(String name){
        Criteria criteria = getCriterias(name);

        return personTemplateRepository.findAll(criteria);

    }

    private Criteria getCriterias(String name) {
        //Criteria Mock
        return where("name").is(name);
    }
}
