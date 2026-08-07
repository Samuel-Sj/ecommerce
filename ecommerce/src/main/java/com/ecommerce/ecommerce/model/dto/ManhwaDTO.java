package com.ecommerce.ecommerce.model.dto;

import com.ecommerce.ecommerce.model.Manhwa;

public record ManhwaDTO(String name) {
    public Manhwa retrieveManhwa(){
        return new Manhwa(name);
    }
}
