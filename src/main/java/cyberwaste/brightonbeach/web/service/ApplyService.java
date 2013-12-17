package cyberwaste.brightonbeach.web.service;

import cyberwaste.brightonbeach.domain.Apply;
import cyberwaste.brightonbeach.specification.SerializableSpecification;
import cyberwaste.brightonbeach.web.model.AppliesLazyModel;

public interface ApplyService {
    
    AppliesLazyModel lazyModel(SerializableSpecification<Apply> specification);
}
