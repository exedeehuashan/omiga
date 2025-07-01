package com.exedee.omiga.core.service;

import com.exedee.omiga.core.exception.ResourceNotFoundException;
import com.exedee.omiga.core.model.Document;
import com.exedee.omiga.core.repository.DocumentRepository;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {

    private DocumentRepository documentRepository;

    public List<Document> getAllDocuments() {
        return documentRepository.findAll();
    }

    @Transactional
    public Document getDocumentById(UUID id) throws ResourceNotFoundException {
        Optional<Document> document = documentRepository.findById(id);
        return document.orElseThrow(() -> new ResourceNotFoundException("Document not found for id:"+id));
    }

}
