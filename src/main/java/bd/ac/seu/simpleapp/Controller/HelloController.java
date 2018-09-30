package bd.ac.seu.simpleapp.Controller;


import bd.ac.seu.simpleapp.Entity.AttendingEvent;
import bd.ac.seu.simpleapp.Entity.CreatedEvent;
import bd.ac.seu.simpleapp.Repository.AttendingEventRepository;
import bd.ac.seu.simpleapp.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class HelloController {
    @Autowired
    EventRepository eventRepository;
    @Autowired
    AttendingEventRepository attendingEventRepository;

    private Facebook facebook;
    private ConnectionRepository connectionRepository;

    public HelloController(Facebook facebook, ConnectionRepository connectionRepository) {
        this.facebook = facebook;
        this.connectionRepository = connectionRepository;
    }

    @GetMapping
    public String helloFacebook(Model model) {
        if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
            return "redirect:/connect/facebook";
        }

        model.addAttribute("facebookProfile", facebook.userOperations().getUserProfile());
        PagedList<Post> feed = facebook.feedOperations().getFeed();
        model.addAttribute("feed", feed);

        User user = facebook.userOperations().getUserProfile();
        System.out.println("ID: " + user.getId());
        System.out.println("Name: " + user.getName());
        System.out.println("Age range: " + user.getAgeRange());
        System.out.println("Home town: " + user.getHometown().getName());

        model.addAttribute("Hosting", facebook.eventOperations().getCreated());
        model.addAttribute("Attending", facebook.eventOperations().getAttending());

        //Created event
        PagedList<Invitation> hostingEvent = facebook.eventOperations().getCreated();
        for(Invitation invitation : hostingEvent) {
            CreatedEvent event = new CreatedEvent(invitation.getName());
            eventRepository.save(event);
        }

        //Attending event
        PagedList<Invitation> attendingEvent = facebook.eventOperations().getAttending();
        for(Invitation invitation : attendingEvent) {
            AttendingEvent event = new AttendingEvent(invitation.getName());
            attendingEventRepository.save(event);
        }

        return "hello";
    }

}