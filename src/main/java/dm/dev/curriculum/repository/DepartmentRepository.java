package dm.dev.curriculum.repository;

import dm.dev.curriculum.model.Department;
import dm.dev.curriculum.repository.pageable.PageableCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends PageableCrudRepository<Department, Long> {

}
