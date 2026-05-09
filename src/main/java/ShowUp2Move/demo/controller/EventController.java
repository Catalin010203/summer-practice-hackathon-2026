package ShowUp2Move.demo.controller;

import ShowUp2Move.demo.service.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/eventpage")
@Controller
public class EventController {

    public final EventService eventService;
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }
    @GetMapping
    public String showAllEvents() {
        eventService.getAllEvents();
        return "eventpage";
    }

}
