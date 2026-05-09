package ShowUp2Move.demo.repository;

import ShowUp2Move.demo.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer>
{

}
