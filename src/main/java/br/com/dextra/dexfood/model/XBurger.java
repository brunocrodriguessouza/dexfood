package br.com.dextra.dexfood.model;

import java.util.ArrayList;

public class XBurger extends Lanche {
	
	public XBurger() {
		ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(Ingrediente.HAMBURGER_CARNE);
		ingredientes.add(Ingrediente.QUEIJO);
	}
}
