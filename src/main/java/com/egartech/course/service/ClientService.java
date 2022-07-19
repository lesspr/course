package com.egartech.course.service;

import com.egartech.course.model.Client;
import com.egartech.course.repository.ClientRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ClientService {
    private ClientRepository clientRepository;

    public List<Client> listClientRegistry() {
        return clientRepository.findAll();
    }

    public Client getClientById(Long id) {
        return clientRepository.getClientById(id);
    }

}
