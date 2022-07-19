package com.egartech.course.repository;

import com.egartech.course.model.PersonDocType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonDocTypeRepository extends JpaRepository<PersonDocType, Integer> {
    @Query("select pdt from PersonDocType pdt")
    List<PersonDocType> getDocType();
}
