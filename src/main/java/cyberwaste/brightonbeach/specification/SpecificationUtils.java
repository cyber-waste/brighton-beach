package cyberwaste.brightonbeach.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.SingularAttribute;

public final class SpecificationUtils {
    
    private SpecificationUtils() {}
    
    public static String prepareSqlContainsPattern(String substring) {
        if (substring == null) {
            return "%";
        }
        return "%" + substring.toUpperCase() + "%";
    }
    
    public static String prepareSqlStartsWithPattern(String prefix) {
        if (prefix == null) {
            return "%";
        }
        return prefix.toUpperCase() + "%";
    }
    
    public static <T> SerializableSpecification<T> any() {
        return new SerializableSpecification<T>() {
            
            private static final long serialVersionUID = 5685641594452441163L;
            
            @Override
            public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.isTrue(cb.literal(Boolean.TRUE));
            }
        };
    }
    
    public static <T> SerializableSpecification<T> withStringFieldLike(
            final SingularAttribute<T, String> stringField, final String pattern) {
        return new SerializableSpecification<T>() {
            
            private static final long serialVersionUID = 2245926977906898355L;
            
            @Override
            public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.like(cb.upper(root.get(stringField)), prepareSqlContainsPattern(pattern));
            }
        };
    }
    
    public static <T> SerializableSpecification<T> withStringFieldStartsWith(
            final SingularAttribute<T, String> stringField, final String prefix) {
        return new SerializableSpecification<T>() {
            
            private static final long serialVersionUID = 2245926977906898355L;
            
            @Override
            public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.like(cb.upper(root.get(stringField)), prepareSqlStartsWithPattern(prefix));
            }
        };
    }
}