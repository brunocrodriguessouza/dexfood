package br.com.dextra.dexfood.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.dextra.dexfood.model.Ingrediente;
import br.com.dextra.dexfood.model.Lanche;
import br.com.dextra.dexfood.model.Lanches;
import br.com.dextra.dexfood.model.Pedido;
import br.com.dextra.dexfood.model.Promocao;

@Service
public class PedidoService {
	
	public Lanche montarLanche(Lanche tipo, List<Ingrediente> adicionais) {
		if(adicionais != null) {
			for (Ingrediente ingrediente : adicionais) {
				tipo.getIngredientes().add(ingrediente);
			}
		}

		return tipo;
	}
	
	public Lanches montarLanche(Lanches tipo) {
		return tipo;
	}
	
	public double aplicarPromocao(Lanche lanche, Promocao promocao) {
		return 0;
	}

	public Pedido fazerPedido(Pedido pedido) {
		// TODO Auto-generated method stub
		return null;
	}

}
