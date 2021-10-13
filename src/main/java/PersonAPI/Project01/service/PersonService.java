package PersonAPI.Project01.service;


import PersonAPI.Project01.dto.MessageResponseDTO;
import PersonAPI.Project01.entity.Person;
import PersonAPI.Project01.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person) {
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created with ID " + savedPerson.getId())
                .build();
    }
}
