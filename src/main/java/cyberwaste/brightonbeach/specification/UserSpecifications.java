package cyberwaste.brightonbeach.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import cyberwaste.brightonbeach.domain.User;
import cyberwaste.brightonbeach.domain.User_;

public final class UserSpecifications {
    
    private UserSpecifications() { }
    
    public static SerializableSpecification<User> any() {
        return new SerializableSpecification<User>() {
            
            private static final long serialVersionUID = 5685641594452441163L;
            
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.isTrue(cb.literal(Boolean.TRUE));
            }
        };
    }
    
    public static SerializableSpecification<User> withNameContains(final String filteringUserName) {
        return new SerializableSpecification<User>() {
            
            private static final long serialVersionUID = 2245926977906898355L;
            
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.like(cb.upper(root.get(User_.name)), prepareSqlContainsPattern(filteringUserName));
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
