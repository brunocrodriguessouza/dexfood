package br.com.dextra.dexfood.model;

import java.util.ArrayList;

public class XEgg extends Lanche {

	public XEgg() {
		ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(Ingrediente.OVO);
		ingredientes.add(Ingrediente.HAMBURGER_CARNE);
		ingredientes.add(Ingrediente.QUEIJO);
	}
}
