package br.com.dextra.dexfood.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.dextra.dexfood.model.Ingrediente;
import br.com.dextra.dexfood.model.Lanche;
import br.com.dextra.dexfood.model.Pedido;
import br.com.dextra.dexfood.repository.PedidoRepository;
import br.com.dextra.dexfood.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	// é apenas uma classe que simula um Repository
	@Autowired
	PedidoRepository pedidoRepository;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Pedido>> getPedidos() {
		List<Pedido> pedido = pedidoRepository.findAll();

		return ResponseEntity.ok(pedido);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Lanche> fazerPedido(@Valid @RequestBody Pedido pedido, HttpServletResponse response) {
		Lanche lancheMontado = pedidoService.fazerPedido(pedido);
		
		pedido.getAdicionais().removeAll(pedido.getAdicionais());
		pedidoRepository.save(pedido);
		
		return ResponseEntity.ok(lancheMontado);
	}
}
