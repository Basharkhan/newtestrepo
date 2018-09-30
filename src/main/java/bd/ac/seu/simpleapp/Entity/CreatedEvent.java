package bd.ac.seu.simpleapp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CreatedEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String createdEvent;

    public CreatedEvent() {
    }

    public CreatedEvent(String createdEvent) {
        this.createdEvent = createdEvent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreatedEvent() {
        return createdEvent;
    }

    public void setCreatedEvent(String createdEvent) {
        this.createdEvent = createdEvent;
    }

    @Override
    public String toString() {
        return "CreatedEvent{" +
                "id=" + id +
                ", createdEvent='" + createdEvent + '\'' +
                '}';
    }
}
