package cyberwaste.brightonbeach.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import cyberwaste.brightonbeach.domain.Apply;
import cyberwaste.brightonbeach.domain.Apply_;
import cyberwaste.brightonbeach.domain.Card;

public final class ApplySpecifications {
    
    private ApplySpecifications() { }
    
    public static SerializableSpecification<Apply> ofCard(final Card card) {
        return new SerializableSpecification<Apply>() {
            private static final long serialVersionUID = 1L;

            @Override
            public Predicate toPredicate(Root<Apply> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.equal(root.get(Apply_.card), card);
            }
        };
    }
}
