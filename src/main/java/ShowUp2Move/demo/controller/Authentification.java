package ShowUp2Move.demo.controller;

import ShowUp2Move.demo.entity.Person;
import ShowUp2Move.demo.service.PersonService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Authentification {

    private final PersonService personService;

    public Authentification(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/authentification")
    public String authentification(Model model) {
        model.addAttribute("person", new Person());
        return "authentification";
    }

    @PostMapping("/authentification")
    public String savePerson(
            @Valid @ModelAttribute("person") Person person,
            BindingResult bindingResult,
            Model model) {

        if (bindingResult.hasErrors()) {
            return "authentification";
        }

        // Verificare dacă email-ul există deja în baza de date
        if (personService.existsByEmail(person.getEmail())) {
            model.addAttribute("errorMessage", "Un cont cu acest email există deja.");
            return "authentification";
        }

        personService.createPerson(person);
        return "redirect:/login";
    }
}