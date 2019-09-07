package br.com.dextra.dexfood.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dextra.dexfood.model.Ingrediente;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

//	@Autowired
//	private PedidoService pedidoService;
	
//	@Autowired
//	private Ingrediente ingrediente;
	
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

	// montar lanches cardapio + personalizado
//	@GetMapping("/lanches/{tipo}")
//	public ResponseEntity<Lanche> calcularLanche(@PathVariable("lanche") Lanche tipo) {
//		Lanche lanche = pedidoService.montarLanche(tipo);
//		return ResponseEntity.ok(lanche);
//	}
//
//	//Criar pedido dos lanches
//	@PutMapping("/fazer-pedido")
//	public ResponseEntity<Pedido> criar(@Valid @RequestBody Pedido pedido) {
//		Pedido newPedido = pedidoService.fazerPedido(pedido);
//		return ResponseEntity.ok(newPedido);
//	}
}
