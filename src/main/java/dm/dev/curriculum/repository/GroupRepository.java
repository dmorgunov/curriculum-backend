package dm.dev.curriculum.repository;

import dm.dev.curriculum.model.Group;
import dm.dev.curriculum.repository.pageable.PageableCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends PageableCrudRepository<Group, Long> {
}
