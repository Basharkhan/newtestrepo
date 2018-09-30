package bd.ac.seu.simpleapp.Repository;

import bd.ac.seu.simpleapp.Entity.CreatedEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<CreatedEvent, Integer> {
}
