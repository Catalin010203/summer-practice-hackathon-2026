package ShowUp2Move.demo.controller;


import ShowUp2Move.demo.entity.Person;
import ShowUp2Move.demo.repository.PersonRepository;
import ShowUp2Move.demo.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PersonController {

    private final PersonService personService;
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/person")
    public List<Person> getPersons() {
        return personService.findAllPerson();
    }

}
