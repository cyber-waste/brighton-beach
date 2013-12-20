package cyberwaste.brightonbeach.web.service.impl;

import java.util.List;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.webflow.execution.RequestContextHolder;

import cyberwaste.brightonbeach.domain.Card;
import cyberwaste.brightonbeach.domain.File;
import cyberwaste.brightonbeach.repository.FileRepository;
import cyberwaste.brightonbeach.web.service.FileService;

@Service("fileService")
public class FileServiceImpl implements FileService {
    
    @Autowired
    private FileRepository fileRepository;
    
    @Override
    public List<File> findForCard(Card card) {
        return fileRepository.findByCard(card);
    }
    
    @Override
    public void handleFileUpload(FileUploadEvent event) {
        UploadedFile uploadedFile = event.getFile();
        
        Card card = (Card) RequestContextHolder.getRequestContext().getFlowScope().get("selectedObject", Card.class);
        
        File file = new File();
        file.setName(uploadedFile.getFileName());
        file.setCard(card);
        file.setContent(uploadedFile.getContents());
        
        fileRepository.save(file);
    }
}
