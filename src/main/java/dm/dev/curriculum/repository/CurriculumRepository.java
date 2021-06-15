package dm.dev.curriculum.repository;

import dm.dev.curriculum.model.Curriculum;
import dm.dev.curriculum.repository.pageable.PageableCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurriculumRepository extends PageableCrudRepository<Curriculum, Long> {
}
