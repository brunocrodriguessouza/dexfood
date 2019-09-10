package br.com.dextra.dexfood.repository;

import java.util.List;
import java.util.Vector;

import org.springframework.stereotype.Repository;

import br.com.dextra.dexfood.model.Pedido;

@Repository
public class PedidoRepository {
	
	public PedidoRepository() {
		
	}
	
	List<Pedido> pedidos = new Vector<Pedido>();

	public void save(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public List<Pedido> findAll() {
		return pedidos;
	}

}
