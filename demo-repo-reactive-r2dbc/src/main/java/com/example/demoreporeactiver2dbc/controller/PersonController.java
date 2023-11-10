package com.example.demoreporeactiver2dbc.controller;


import com.example.demoreporeactiver2dbc.data.Person;
import com.example.demoreporeactiver2dbc.repository.r2dbc.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class PersonController {
    private final PersonRepository personRepository;

    @GetMapping("/v1/helloWorld")
    public String helloWorld(){
        return "Hello World";
    }
    @GetMapping("/v1/helloWorldMono")
    public Mono<String> helloWorldMono(){
        return Mono.just("Hello World, but in Reactive!!!");
    }

    @GetMapping("/v1/persona/find/{id}")
    public Mono<Person> find(@PathVariable("id") Long id){

        return personRepository.findById(id);
    }

}
