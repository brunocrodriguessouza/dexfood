package br.com.dextra.dexfood.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dextra.dexfood.model.Lanche;
import br.com.dextra.dexfood.model.Lanches;

@RestController
@RequestMapping("/lanches")
public class LanchesController {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Lanche> getLanches() {
		List<Lanche> lanches = new ArrayList<Lanche>();
		lanches.add(Lanches.X_BACON.getLanche());
		lanches.add(Lanches.X_BURGUER.getLanche());
		lanches.add(Lanches.X_EGG.getLanche());
		lanches.add(Lanches.X_EGGBACON.getLanche());

		return lanches;
	}
}
