package com.baozistore.baozi_api.repository;

import com.baozistore.baozi_api.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}