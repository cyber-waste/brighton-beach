package cyberwaste.brightonbeach.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import cyberwaste.brightonbeach.domain.Card;
import cyberwaste.brightonbeach.domain.File;

public interface FileRepository extends CrudRepository<File, Long>, JpaSpecificationExecutor<File> {

    List<File> findByCard(Card card);
}
