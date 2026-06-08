package NewPet.newpet.repository;

import NewPet.newpet.services.People;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PeopleRepository extends CrudRepository<People, UUID> {
}
