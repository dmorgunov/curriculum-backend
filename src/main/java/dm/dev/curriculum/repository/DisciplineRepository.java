package dm.dev.curriculum.repository;

import dm.dev.curriculum.model.Discipline;
import dm.dev.curriculum.repository.pageable.PageableCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplineRepository extends PageableCrudRepository<Discipline, Long> {
}
