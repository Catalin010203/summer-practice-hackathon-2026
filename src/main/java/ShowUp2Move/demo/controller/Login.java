package ShowUp2Move.demo.controller;

import ShowUp2Move.demo.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Login {

    private final PersonService personService;

    public Login(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            Model model) {

        boolean credentialeValide = personService.validateCredentials(email, password);

        if (!credentialeValide) {
            model.addAttribute("errorMessage", "Email sau parolă incorectă.");
            return "login";
        }

        return "redirect:/homepage";
    }
}