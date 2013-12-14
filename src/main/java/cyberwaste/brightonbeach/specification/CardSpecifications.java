package cyberwaste.brightonbeach.specification;

import cyberwaste.brightonbeach.domain.Card;
import cyberwaste.brightonbeach.domain.Card_;

public final class CardSpecifications {
    
    private CardSpecifications() { }
    
    public static SerializableSpecification<Card> any() {
        return SpecificationUtils.any();
    }
    
    public static SerializableSpecification<Card> withNameContains(String filteringCardName) {
        return SpecificationUtils.withStringFieldLike(Card_.name, filteringCardName);
    }
}
