package bd.ac.seu.simpleapp.Repository;

import bd.ac.seu.simpleapp.Entity.AttendingEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendingEventRepository extends JpaRepository<AttendingEvent, Integer> {
}
