package cyberwaste.brightonbeach.web.service.impl;

import org.springframework.stereotype.Service;

import cyberwaste.brightonbeach.domain.Apply;
import cyberwaste.brightonbeach.specification.SerializableSpecification;
import cyberwaste.brightonbeach.web.model.AppliesLazyModel;
import cyberwaste.brightonbeach.web.service.ApplyService;

@Service("applyService")
public class ApplyServiceImpl implements ApplyService {

    @Override
    public AppliesLazyModel lazyModel(SerializableSpecification<Apply> specification) {
        return new AppliesLazyModel(specification);
    }
}
