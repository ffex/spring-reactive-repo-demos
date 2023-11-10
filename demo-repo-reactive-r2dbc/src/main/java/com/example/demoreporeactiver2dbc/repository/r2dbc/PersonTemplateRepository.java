package com.example.demoreporeactiver2dbc.repository.r2dbc;


import com.example.demoreporeactiver2dbc.data.Person;
import com.example.demoreporeactiver2dbc.repository.r2dbc.extensions.BaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.data.relational.core.query.Criteria;
import org.springframework.data.relational.core.query.Query;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import static org.springframework.data.relational.core.query.Criteria.where;

@Component
public class PersonTemplateRepository  extends BaseRepository<Person>{


    public PersonTemplateRepository(R2dbcEntityTemplate template) {
        super(template, Person.class);
    }
}
