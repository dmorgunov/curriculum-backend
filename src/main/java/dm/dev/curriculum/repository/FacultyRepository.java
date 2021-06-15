package dm.dev.curriculum.repository;

import dm.dev.curriculum.model.Faculty;
import dm.dev.curriculum.repository.pageable.PageableCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends PageableCrudRepository<Faculty, Long> {
}
