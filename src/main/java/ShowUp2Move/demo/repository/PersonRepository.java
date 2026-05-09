package ShowUp2Move.demo.repository;


import ShowUp2Move.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
