package cyberwaste.brightonbeach.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import cyberwaste.brightonbeach.domain.User;

public interface UserRepository extends CrudRepository<User, Long>, JpaSpecificationExecutor<User> {

    User findByName(String name);
}
