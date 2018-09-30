package bd.ac.seu.simpleapp.Service;

import bd.ac.seu.simpleapp.Entity.CreatedEvent;

import bd.ac.seu.simpleapp.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    EventRepository eventRepository;

    public List<CreatedEvent> getAllEvent () {
        return eventRepository.findAll();
    }
}
