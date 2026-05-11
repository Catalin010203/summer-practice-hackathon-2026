package ShowUp2Move.demo.repository;

import ShowUp2Move.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByUsername(String username);
    Optional<Person> findByEmail(String email);
}
