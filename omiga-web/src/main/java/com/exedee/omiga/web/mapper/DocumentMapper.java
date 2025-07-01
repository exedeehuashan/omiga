package com.exedee.omiga.web.mapper;

import com.exedee.omiga.core.model.Document;
import com.exedee.omiga.web.dto.DocumentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DocumentMapper {

    public final static DocumentMapper INSTANCE = Mappers.getMapper(DocumentMapper.class);

    DocumentDTO toDocumentDTO(Document document);

    Document toDocument(DocumentDTO documentDTO);

}
