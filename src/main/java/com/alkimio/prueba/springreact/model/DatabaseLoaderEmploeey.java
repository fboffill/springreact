package com.alkimio.prueba.springreact.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoaderEmploeey implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoaderEmploeey(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
        this.repository.save(new Employee("Fernando", "Boffill", "Hola Fernando"));
        this.repository.save(new Employee("Leti", "Mateo", "Hola Leti" ));

    }
}