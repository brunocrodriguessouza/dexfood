package br.com.dextra.dexfood.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.dextra.dexfood.model.Ingrediente;
import br.com.dextra.dexfood.model.Lanche;
import br.com.dextra.dexfood.model.Pedido;

@Service
public class PedidoService {

	public Lanche montarLanche(Lanche lanche, List<Ingrediente> adicionais) {
		if (adicionais != null) {
			for (Ingrediente ingrediente : adicionais) {
				lanche.getIngredientes().add(ingrediente);
			}
		}
		return lanche;
	}

	public Lanche fazerPedido(Pedido pedido) {
		if(pedido.getAdicionais() != null) {
			for (Ingrediente ingrediente : pedido.getAdicionais()) {
				pedido.getLanche().getIngredientes().add(ingrediente);
			}
		}
		return pedido.getLanche();
	}

}
