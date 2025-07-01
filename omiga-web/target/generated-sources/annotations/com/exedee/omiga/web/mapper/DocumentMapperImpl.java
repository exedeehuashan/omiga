package com.exedee.omiga.web.mapper;

import com.exedee.omiga.core.model.Document;
import com.exedee.omiga.core.model.Document.DocumentBuilder;
import com.exedee.omiga.web.dto.DocumentDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-01T17:03:12+1200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class DocumentMapperImpl implements DocumentMapper {

    @Override
    public DocumentDTO toDocumentDTO(Document document) {
        if ( document == null ) {
            return null;
        }

        DocumentDTO documentDTO = new DocumentDTO();

        documentDTO.setName( document.getName() );
        documentDTO.setDescription( document.getDescription() );

        return documentDTO;
    }

    @Override
    public Document toDocument(DocumentDTO documentDTO) {
        if ( documentDTO == null ) {
            return null;
        }

        DocumentBuilder<?, ?> document = Document.builder();

        document.name( documentDTO.getName() );
        document.description( documentDTO.getDescription() );

        return document.build();
    }
}
