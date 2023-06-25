package com.example.service;

import com.example.model.Vet;
import java.util.Set;

public interface VetService {

    Set<Vet> findAll();

    Vet findById(Long id );

    Vet save( Vet vet );
}
