package ShowUp2Move.demo.service;

import ShowUp2Move.demo.entity.Person;
import ShowUp2Move.demo.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void createPerson(Person person) {
        personRepository.save(person);
    }

    public List<Person> findAllPerson() {
        return personRepository.findAll();
    }

    public boolean existsByEmail(String email) {
        return personRepository.findByEmail(email).isPresent();
    }


    public boolean validateCredentials(String email, String password) {
        Optional<Person> optionalPerson = personRepository.findByEmail(email);

        if (optionalPerson.isEmpty()) {
            return false;
        }

        Person person = optionalPerson.get();
        return person.getPassword().equals(password);
    }
}