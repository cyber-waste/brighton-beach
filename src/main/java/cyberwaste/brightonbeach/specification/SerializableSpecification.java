package cyberwaste.brightonbeach.specification;

import java.io.Serializable;

import org.springframework.data.jpa.domain.Specification;

public interface SerializableSpecification<T> extends Specification<T>, Serializable {
}