package br.com.dextra.dexfood.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dextra.dexfood.model.Ingrediente;
import br.com.dextra.dexfood.model.Lanche;
import br.com.dextra.dexfood.model.Lanches;
import br.com.dextra.dexfood.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;

	// @Autowired
	// private Ingrediente ingrediente;

	@GetMapping("/ingredientes")
	public List<Ingrediente> getIngredientes() {
		List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(Ingrediente.ALFACE);
		ingredientes.add(Ingrediente.BACON);
		ingredientes.add(Ingrediente.HAMBURGER_CARNE);
		ingredientes.add(Ingrediente.OVO);
		ingredientes.add(Ingrediente.QUEIJO);

		return ingredientes;
	}

	@GetMapping("/lanches")
	public List<Lanche> getLanches() {
		List<Lanche> lanches = new ArrayList<Lanche>();
		lanches.add(Lanches.X_BACON.getLanche());
		lanches.add(Lanches.X_BURGUER.getLanche());
		lanches.add(Lanches.X_EGG.getLanche());
		lanches.add(Lanches.X_EGGBACON.getLanche());

		return lanches;
	}

//	Falta Implementar o calcular lanche
	//	@GetMapping("/lanches/{tipo}")
	//	public ResponseEntity<Lanche> calcularLanche(@PathVariable(value = "tipo") Lanche tipo) {
	//		Lanche lanche = pedidoService.montarLanche(tipo, null);
	//		return ResponseEntity.ok(lanche);
	//	}
	//
//	Falta implementar o Criar pedido dos lanches
	// @PutMapping("/pedido")
	// public ResponseEntity<Pedido> criar(@Valid @RequestBody Pedido pedido) {
	// Pedido newPedido = pedidoService.fazerPedido(pedido);
	// return ResponseEntity.ok(newPedido);
	// }
	

}
