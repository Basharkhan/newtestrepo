package bd.ac.seu.simpleapp;

import bd.ac.seu.simpleapp.Controller.HelloController;
import bd.ac.seu.simpleapp.Repository.EventRepository;
import bd.ac.seu.simpleapp.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimpleAppApplication {

    @Autowired
    EventRepository eventRepository;
    @Autowired
    EventService eventService;

    HelloController helloController;
	public static void main(String[] args) {
		SpringApplication.run(SimpleAppApplication.class, args);

	}
    @Bean
    CommandLineRunner runner() {
        return args-> {
//            List<String> list = helloController.getHostingEvent();
//            for(String s : list) {
//                Event event = new Event(1, s);
//                eventRepository.save(event);
        };
    }
}