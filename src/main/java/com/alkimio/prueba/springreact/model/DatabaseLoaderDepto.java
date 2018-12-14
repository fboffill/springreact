package com.alkimio.prueba.springreact.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoaderDepto implements CommandLineRunner {

    private final DeptoRepository repository;

    @Autowired
    public DatabaseLoaderDepto(DeptoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {

        this.repository.save(new Depto("Depto1", "juli@lamaslinda"));
    }
}