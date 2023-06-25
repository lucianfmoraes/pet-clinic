package com.example.service;

import com.example.model.Owner;
import java.util.Set;

public interface OwnerService {

    Set<Owner> findAll();

    Owner findById(Long id );

    Owner save( Owner owner );

}
