package cyberwaste.brightonbeach.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import cyberwaste.brightonbeach.domain.Card;

public interface CardRepository extends CrudRepository<Card, Long>, JpaSpecificationExecutor<Card> {
}
