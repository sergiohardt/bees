package br.com.application.demo.domain.factory.impl;

import br.com.application.demo.domain.entities.impl.CommonPerson;
import br.com.application.demo.domain.entities.Person;
import br.com.application.demo.domain.factory.PersonFactory;

//this class will be offered by a interface with no implementations (SOLID)
public class CommonPersonFactory implements PersonFactory {

    @Override
    public Person create(String name, String cpf, String rg, int age) {
        return new CommonPerson(name, cpf, rg, age);
    }

}
