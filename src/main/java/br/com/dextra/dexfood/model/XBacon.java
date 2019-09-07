package br.com.dextra.dexfood.model;

import java.util.ArrayList;

public class XBacon extends Lanche {

	public XBacon() {
		ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(Ingrediente.BACON);
		ingredientes.add(Ingrediente.HAMBURGER_CARNE);
		ingredientes.add(Ingrediente.OVO);
	}

}
