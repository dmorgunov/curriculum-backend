package dm.dev.curriculum.repository;

import dm.dev.curriculum.model.Specialty;
import dm.dev.curriculum.repository.pageable.PageableCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityRepository extends PageableCrudRepository<Specialty, Long> {
}
