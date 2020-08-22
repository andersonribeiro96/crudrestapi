package br.com.spring.restspringboot.services;

import br.com.spring.restspringboot.models.PersonModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();


    public PersonModel create(PersonModel personModel){
        return personModel;
    }

    public PersonModel update(PersonModel personModel){

        return personModel;
    }

    public void delete(String id){

    }

    public PersonModel findById(String id) {
        PersonModel person = new PersonModel();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Leandro");
        person.setLastName("Alves");
        person.setAdress("Rua do Papel");
        person.setGender("Masculino");
        return person;
    }

    public List<PersonModel> findAll() {
        List<PersonModel> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++){
          PersonModel personModel = mockPerson(i);
          persons.add(personModel);
        }
        return persons;
    }

    private PersonModel mockPerson(int i) {
        PersonModel person = new PersonModel();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person name " + i);
        person.setLastName("Last name " + i);
        person.setAdress("Some address in Brasil");
        person.setGender("Person gender");
        return person;
    }
}
