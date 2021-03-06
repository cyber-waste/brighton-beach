package cyberwaste.brightonbeach.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import cyberwaste.brightonbeach.domain.Card;
import cyberwaste.brightonbeach.domain.Card_;

public final class CardSpecifications {
    
    private CardSpecifications() { }
    
    public static SerializableSpecification<Card> any() {
        return new SerializableSpecification<Card>() {
            
            private static final long serialVersionUID = 5685641594452441163L;
            
            @Override
            public Predicate toPredicate(Root<Card> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.isTrue(cb.literal(Boolean.TRUE));
            }
        };
    }
    
    public static SerializableSpecification<Card> withNameContains(final String filteringCardName) {
        return new SerializableSpecification<Card>() {
            
            private static final long serialVersionUID = 2245926977906898355L;
            
            @Override
            public Predicate toPredicate(Root<Card> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.like(cb.upper(root.get(Card_.name)), prepareSqlContainsPattern(filteringCardName));
            }
        };
    }
    
    private static String prepareSqlContainsPattern(String substring) {
        if (substring == null) {
            return "%";
        }
        return "%" + substring.toUpperCase() + "%";
    }
}
