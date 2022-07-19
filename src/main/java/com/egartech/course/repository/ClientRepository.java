package com.egartech.course.repository;

import com.egartech.course.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

    Client getClientById(Long id);
}
