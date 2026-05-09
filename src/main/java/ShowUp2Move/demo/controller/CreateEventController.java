package ShowUp2Move.demo.controller;


import ShowUp2Move.demo.entity.Event;
import ShowUp2Move.demo.repository.EventRepository;
import ShowUp2Move.demo.service.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CreateEventController {

    private EventService eventService;
    public CreateEventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/createevent")
    public String showForm() {
        return "createevent";
    }

    @PostMapping("/createevent")
    public String createEvent(Event event) {

        System.out.println("LOCATION: " + event.getLocation());
        System.out.println("SPORT: " + event.getSport());
        System.out.println("DATE: " + event.getDateTime());

        eventService.saveEvent(event);

        return "redirect:/homepage";
    }
}
