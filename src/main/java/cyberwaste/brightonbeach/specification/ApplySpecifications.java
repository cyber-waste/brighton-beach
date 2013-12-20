package cyberwaste.brightonbeach.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang.StringUtils;

import cyberwaste.brightonbeach.domain.Apply;
import cyberwaste.brightonbeach.domain.Apply_;
import cyberwaste.brightonbeach.domain.Card;
import cyberwaste.brightonbeach.domain.Card_;
import cyberwaste.brightonbeach.domain.User_;

public final class ApplySpecifications {
    
    private ApplySpecifications() { }
    
    public static SerializableSpecification<Apply> any() {
        return SpecificationUtils.any();
    }
    
    public static SerializableSpecification<Apply> ofCardAndUser(final Card card, final String username) {
        return new SerializableSpecification<Apply>() {
            private static final long serialVersionUID = 1L;

            @Override
            public Predicate toPredicate(Root<Apply> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.and(
                    criteriaBuilder.equal(root.get(Apply_.card), card),
                    criteriaBuilder.equal(root.get(Apply_.user).get(User_.name), username)
                );
            }
        };
    }
    
    public static SerializableSpecification<Apply> where(final Card exactCard, final String cardNameLike) {
        return new SerializableSpecification<Apply>() {
            
            private static final long serialVersionUID = 1L;
            
            @Override
            public Predicate toPredicate(Root<Apply> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                Predicate resultPredicate = criteriaBuilder.isTrue(criteriaBuilder.literal(Boolean.TRUE));
                
                if (exactCard != null) {
                    root.join(Apply_.card);
                    resultPredicate = criteriaBuilder.and(resultPredicate, criteriaBuilder.equal(root.get(Apply_.card), exactCard));
                } else if (StringUtils.isNotBlank(cardNameLike)) {
                    root.join(Apply_.card);
                    resultPredicate = criteriaBuilder.and(resultPredicate,
                        criteriaBuilder.like(criteriaBuilder.upper(root.get(Apply_.card).get(Card_.name)), SpecificationUtils.prepareSqlContainsPattern(cardNameLike))
                    );
                }
                
                return resultPredicate;
            }
        };
    }
}
