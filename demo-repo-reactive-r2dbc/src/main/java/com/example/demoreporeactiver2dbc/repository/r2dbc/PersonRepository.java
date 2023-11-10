package com.example.demoreporeactiver2dbc.repository.r2dbc;


import com.example.demoreporeactiver2dbc.data.Person;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends R2dbcRepository<Person,Long> {
}