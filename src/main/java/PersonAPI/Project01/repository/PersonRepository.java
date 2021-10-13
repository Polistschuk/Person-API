package PersonAPI.Project01.repository;

import PersonAPI.Project01.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
