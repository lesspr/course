package com.egartech.course.service;

import com.egartech.course.model.Document;
import com.egartech.course.model.PersonDocType;
import com.egartech.course.repository.DocumentRepository;
import com.egartech.course.repository.PersonDocTypeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class DocumentService {
    private final DocumentRepository documentRepository;
    private final PersonDocTypeRepository personDocTypeRepository;

    public List<Document> listDocuments() {
        return documentRepository.findAll();
    }

    public List<PersonDocType> listDocType() {
        return personDocTypeRepository.getDocType();
        //       return documentRepository.allDocuments();
    }

    public List<Document> listSearchDocuments(String title) {
        if (title != null){
            title = "%" + title.toLowerCase() + "%";
        }
        return documentRepository.findByTitleDocument(title);
    }

    public List<Document> listSearchDocuments2(String title, String numeral) {
        if (title != null && numeral !=null) {
            title = "%" + title.toLowerCase() + "%";
            numeral = "%" + numeral.toLowerCase() + "%";
        }
        return documentRepository.findByTitleDocument2(title, numeral);
    }

    public void saveDocument(Document document) {
        log.info("Saving new {}", document);
        documentRepository.save(document);
    }

    public void deleteDocument(Long id) {
        documentRepository.deleteById(id);
    }

    public Document getDocumentById(Long id) {
        return documentRepository.findById(id).orElse(null);
    }
}
