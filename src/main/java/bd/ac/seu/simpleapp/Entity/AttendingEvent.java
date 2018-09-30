package bd.ac.seu.simpleapp.Entity;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AttendingEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String attendingEvent;

    public AttendingEvent() {
    }

    public AttendingEvent(String attendingEvent) {
        this.attendingEvent = attendingEvent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAttendingEvent() {
        return attendingEvent;
    }

    public void setAttendingEvent(String attendingEvent) {
        this.attendingEvent = attendingEvent;
    }

    @Override
    public String toString() {
        return "AttendingEvent{" +
                "id=" + id +
                ", attendingEvent='" + attendingEvent + '\'' +
                '}';
    }
}
