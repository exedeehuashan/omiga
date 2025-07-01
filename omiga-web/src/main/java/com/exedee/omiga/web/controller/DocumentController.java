package com.exedee.omiga.web.controller;


import com.exedee.omiga.core.exception.ResourceNotFoundException;
import com.exedee.omiga.core.service.DocumentService;
import com.exedee.omiga.web.dto.DocumentDTO;
import com.exedee.omiga.web.mapper.DocumentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/document")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @GetMapping(value="all")
    public ResponseEntity<List<DocumentDTO>> getAllDocument() {
        return ResponseEntity.ok().body(documentService.getAllDocuments().stream()
                .map(DocumentMapper.INSTANCE::toDocumentDTO)
                .collect(Collectors.toList()));
    }

    @GetMapping(value = "/{unid}")
    public ResponseEntity<DocumentDTO> getDocument(@PathVariable("unid") UUID unid) throws ResourceNotFoundException {

        return ResponseEntity.ok().body(DocumentMapper.INSTANCE.toDocumentDTO(documentService.getDocumentById(unid)));

    }
}
