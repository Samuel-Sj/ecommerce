package com.ecommerce.ecommerce.repository;

import com.ecommerce.ecommerce.model.Manhwa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ManhwaRepository extends JpaRepository<Manhwa,Long> {

    Optional<Manhwa> findbyManhwaName (String name);
}
