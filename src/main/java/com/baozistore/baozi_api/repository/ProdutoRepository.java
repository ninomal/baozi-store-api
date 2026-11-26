package com.baozistore.baozi_api.repository;

import com.baozistore.baozi_api.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}