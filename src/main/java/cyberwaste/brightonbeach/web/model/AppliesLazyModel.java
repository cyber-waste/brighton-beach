package cyberwaste.brightonbeach.web.model;

import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.webflow.execution.RequestContextHolder;

import cyberwaste.brightonbeach.domain.Apply;
import cyberwaste.brightonbeach.repository.ApplyRepository;
import cyberwaste.brightonbeach.specification.SerializableSpecification;

public class AppliesLazyModel extends LazyDataModel<Apply> {
    
    private static final long serialVersionUID = 1L;
    
    private static final Sort SORT_BY_ID = new Sort(Direction.ASC, "id");
    
    private final SerializableSpecification<Apply> specification;
    
    public AppliesLazyModel(SerializableSpecification<Apply> specification) {
        this.specification = specification;
    }
    
    @Override
    public List<Apply> load(final int first, final int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
        Page<Apply> runsPage = getApplyRepository().findAll(specification, new Pageable() {
            
            @Override
            public Sort getSort() {
                return SORT_BY_ID;
            }
            
            @Override
            public int getPageSize() {
                return pageSize;
            }
            
            @Override
            public int getPageNumber() {
                return 0;
            }
            
            @Override
            public int getOffset() {
                return first;
            }
        });
        setRowCount((int) runsPage.getTotalElements());
        setPageSize(runsPage.getSize());
        return runsPage.getContent();
    }
    
    private static ApplyRepository getApplyRepository() {
        return RequestContextHolder.getRequestContext().getActiveFlow().getApplicationContext().getBean(ApplyRepository.class);
    }
}