package com.alkimio.prueba.springreact.model;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Depto {

    private @Id @GeneratedValue Long id;
    private String description;
    private String contacto;


    private Depto() {}

    public Depto(String description, String contacto) {

        this.description = description;
        this.contacto       = contacto;

    }
}
