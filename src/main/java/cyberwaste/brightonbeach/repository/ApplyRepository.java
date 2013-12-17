package cyberwaste.brightonbeach.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import cyberwaste.brightonbeach.domain.Apply;

public interface ApplyRepository extends CrudRepository<Apply, Long>, JpaSpecificationExecutor<Apply> {
}
