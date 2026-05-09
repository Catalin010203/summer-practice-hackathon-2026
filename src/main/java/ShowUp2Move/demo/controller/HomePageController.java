package ShowUp2Move.demo.controller;


import ShowUp2Move.demo.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping("/homepage")
    public String FindEvent(){
        return "homepage";
    }
}
