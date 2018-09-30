package bd.ac.seu.simpleapp.Service;

import bd.ac.seu.simpleapp.Entity.AttendingEvent;
import bd.ac.seu.simpleapp.Repository.AttendingEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendingEventService {
    @Autowired
    AttendingEventRepository attendingEventRepository;
    public List<AttendingEvent> getAllAttendingEvent() {
        return attendingEventRepository.findAll();
    }
}
