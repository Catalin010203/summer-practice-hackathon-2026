package ShowUp2Move.demo.controller;


import ShowUp2Move.demo.entity.Person;
import ShowUp2Move.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Authentification {

    @Autowired
    private PersonService personService;


    @GetMapping("/authentification")
    public String authentification(Model theModel){
        Person person = new Person();
        theModel.addAttribute("person",person);

        return "authentification";
    }

    @PostMapping("/authentificationSucces")
    public String authentificationSucces(Person person) {

        personService.createPerson(person);
        return "authentificationSucces";
    }
}
