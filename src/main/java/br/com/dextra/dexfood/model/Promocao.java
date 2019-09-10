package br.com.dextra.dexfood.model;

import java.util.List;

/**
 * 
 * @author bruno
 *
 */
public interface Promocao {
	double aplicarRegra(List<Ingrediente> ingredientes, double valor);
}
