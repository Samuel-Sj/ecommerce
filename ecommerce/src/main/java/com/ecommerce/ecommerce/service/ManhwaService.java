package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.model.Manhwa;
import com.ecommerce.ecommerce.repository.ManhwaRepository;
import org.springframework.stereotype.Service;

@Service
public class ManhwaService {
    private final ManhwaRepository repository;

    public ManhwaService(ManhwaRepository repository){
        this.repository = repository;
    }

    public Manhwa findByName (String name) {
        return repository.findByName(name).orElseThrow(() -> new RuntimeException("Manhwa não encontrado !"));
    }
}
