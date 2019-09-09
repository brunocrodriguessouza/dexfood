package br.com.dextra.dexfood.model;

import java.util.List;

public interface Promocao {
	double aplicarRegra(List<Ingrediente> ingredientes, double valor);
}
