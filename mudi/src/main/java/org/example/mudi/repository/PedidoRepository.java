package org.example.mudi.repository;

import java.util.List;

import org.example.mudi.model.Pedido;
import org.example.mudi.model.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

	List<Pedido> findByStatus(StatusPedido status);

}
