package cyberwaste.brightonbeach.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
