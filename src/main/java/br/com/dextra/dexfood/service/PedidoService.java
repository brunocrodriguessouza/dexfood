package br.com.dextra.dexfood.service;

import java.util.List;

import br.com.dextra.dexfood.model.Ingrediente;
import br.com.dextra.dexfood.model.Lanche;
import br.com.dextra.dexfood.model.Pedido;
import br.com.dextra.dexfood.model.Promocao;

public class PedidoService {
	
	public Lanche montarLanche(Lanche lanche, List<Ingrediente> adicionais) {
		for (Ingrediente ingrediente : adicionais) {
			lanche.getIngredientes().add(ingrediente);
		}
		return lanche;
	}
	
	public Lanche montarLanche(Lanche lanche) {
		return lanche;
	}
	
	public double aplicarPromocao(Lanche lanche, Promocao promocao) {
		return 0;
	}

	public Pedido fazerPedido(Pedido pedido) {
		// TODO Auto-generated method stub
		return null;
	}

}
