package com.exedee.omiga.web.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class DocumentDTO {

    private UUID uuid;
    private String name;
    private String description;
    private String minioDocument;

}
