package com.egartech.course.repository;

import com.egartech.course.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DocumentRepository extends JpaRepository<Document, Long> {

    @Query("select d from Document d where ?1 is null or d.title like ?1")
    List<Document> findByTitleDocument(String titleDocument);

    @Query("select d from Document d where ?1 is null or d.title like ?1 and " +
    "  (?2 is null or d.numeral like ?2) ")
    List<Document> findByTitleDocument2(String titleDocument, String numeral);
}
