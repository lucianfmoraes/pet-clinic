package com.example.service;

import com.example.model.Pet;
import java.util.Set;

public interface PetService {

    Set<Pet> findAll();

    Pet findById(Long id );

    Pet save( Pet pet );

}
