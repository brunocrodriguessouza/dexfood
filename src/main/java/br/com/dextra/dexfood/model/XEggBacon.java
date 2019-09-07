package br.com.dextra.dexfood.model;

import java.util.ArrayList;

public class XEggBacon extends Lanche {
	public XEggBacon() {
		ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(Ingrediente.OVO);
		ingredientes.add(Ingrediente.BACON);
		ingredientes.add(Ingrediente.HAMBURGER_CARNE);
		ingredientes.add(Ingrediente.QUEIJO);
	}
}
