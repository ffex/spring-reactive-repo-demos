package com.example.demoreporeactiver2dbc.repository.r2dbc.extensions;

import com.example.demoreporeactiver2dbc.data.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.data.relational.core.query.Criteria;
import org.springframework.data.relational.core.query.Query;
import reactor.core.publisher.Flux;

import static org.springframework.data.relational.core.query.Criteria.where;

@RequiredArgsConstructor
public class BaseRepository<T> {
    protected final R2dbcEntityTemplate template;
    private final Class<T> type;
    public Flux<T> findAll(){
        return this.template.select(type).all();
    }
    public Flux<T> findAll(Criteria criteria){
        Criteria criteriaComplete = criteria.and(where("surname").is("bassini")); //TODO try to get from context
        return this.template.select(
                Query.query(criteriaComplete),
                type
        );
    }

}
