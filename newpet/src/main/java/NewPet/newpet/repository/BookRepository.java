package NewPet.newpet.repository;

import NewPet.newpet.entitys.Books;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Books, Long> {
}
