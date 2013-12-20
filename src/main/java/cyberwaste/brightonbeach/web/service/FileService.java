package cyberwaste.brightonbeach.web.service;

import java.util.List;

import org.primefaces.event.FileUploadEvent;

import cyberwaste.brightonbeach.domain.Card;
import cyberwaste.brightonbeach.domain.File;

public interface FileService {
    
    List<File> findForCard(Card card);
    
    void handleFileUpload(FileUploadEvent event);
}
