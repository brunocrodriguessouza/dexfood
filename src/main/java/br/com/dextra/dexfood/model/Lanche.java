package br.com.dextra.dexfood.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author bruno
 *
 */
public class Lanche {
	  private List<Ingrediente> ingredientes;
	  private String nomeLanche;
	  
	  public String getNomeLanche() {
		  return nomeLanche;
	  }
	  
	  public Lanche() {
		  
	  }

	  public Lanche(String nomeLanche, Ingrediente... ingredientes) {
	    for (Ingrediente ingrediente : ingredientes) {
	      adicionaIngrediente(ingrediente);
	    }
	    this.nomeLanche = nomeLanche;
	  }

	  public double getPreco() {
	    double valor =
	        ingredientes.stream().map(ingrediente -> ingrediente.getPreco()).reduce(0.0, Double::sum);
	    for (Promocoes promocao : Promocoes.values()) {
	      if (promocao.isAtiva()) {
	        valor = promocao.aplicarRegra(ingredientes, valor);
	      }
	    }
	    return valor;
	  }

	  public boolean adicionaIngrediente(Ingrediente ingrediente) {
	    if (ingredientes == null) {
	      ingredientes = new ArrayList<>();
	    }
	    return ingredientes.add(ingrediente);
	  }

	  public void removeIngrediente(Ingrediente ingrediente) {
	    if (ingredientes != null && !ingredientes.isEmpty()) {
	      ingredientes.remove(ingrediente);
	    }
	  }

	  public List<Ingrediente> getIngredientes() {
	    return ingredientes;
	  }
	}