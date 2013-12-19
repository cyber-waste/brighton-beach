package cyberwaste.brightonbeach.web.service;

import java.util.List;

import cyberwaste.brightonbeach.domain.Card;
import cyberwaste.brightonbeach.domain.File;

public interface FileService {
    
    List<File> findForCard(Card card);
}
