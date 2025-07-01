package com.exedee.omiga.core.repository;

import com.exedee.omiga.core.model.Document;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface DocumentRepository extends JpaRepository<Document, UUID> {

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Optional<Document> findByUnid(UUID unid);

}
