package com.ecommerce.ecommerce.model.dto;

import com.ecommerce.ecommerce.model.User;

public record UserDTO(Long id, String name) {
    public User retrieveUser(){
        return  new User(id, name);
    }

}
