package dm.dev.curriculum.repository.pageable;

import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface PageableCrudRepository<TYPE, ID> extends CrudRepository<TYPE, ID> {

    List<TYPE> findAll(Pageable p);

}
