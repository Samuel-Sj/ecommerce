package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.model.User;
import com.ecommerce.ecommerce.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User findByName(String name) {
        return repository.findByName(name)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
    }

    public User findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Id de usuário não encontrado!"));
    }

    public User saveUser(User user) {
        if (repository.existsById(user.getId())) {
            throw new RuntimeException("Id de usuário já existe!");
        }

        return repository.save(user);
    }

}