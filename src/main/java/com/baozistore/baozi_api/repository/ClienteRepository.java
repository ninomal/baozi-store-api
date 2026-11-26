package com.baozistore.baozi_api.repository;

import com.baozistore.baozi_api.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}