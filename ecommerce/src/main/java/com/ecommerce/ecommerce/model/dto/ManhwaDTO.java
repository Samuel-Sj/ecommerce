package com.ecommerce.ecommerce.model.dto;

import com.ecommerce.ecommerce.model.Manhwa;

public record ManhwaDTO(Long id,String name) {
    public Manhwa retrieveManhwa(){
        return new Manhwa(id, name);
    }
}
