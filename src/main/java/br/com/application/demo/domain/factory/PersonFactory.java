package br.com.application.demo.domain.factory;
import br.com.application.demo.domain.entities.Person;

public interface PersonFactory {
    Person create(String name, String cpf, String rg, int age);
}
