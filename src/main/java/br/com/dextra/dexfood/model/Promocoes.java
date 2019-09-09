package br.com.dextra.dexfood.model;

import java.util.List;

public enum Promocoes implements Promocao {
	  LIGHT(true) {
	    @Override
	    public double aplicarRegra(List<Ingrediente> ingredientes, double valor) {
	      if (ingredientes.contains(Ingrediente.ALFACE) && !ingredientes.contains(Ingrediente.BACON)) {
	        valor = valor * 0.90;
	      }
	      return valor;
	    }
	  },
	  MUITA_CARNE(true) {
	    @Override
	    public double aplicarRegra(List<Ingrediente> ingredientes, double valor) {
	      long contadorDeCarne = ingredientes.stream()
	          .filter(ingrediente -> ingrediente.equals(Ingrediente.HAMBURGER_CARNE))
	          .count();
	      if (contadorDeCarne % 3 == 0) {
	        valor -= Ingrediente.HAMBURGER_CARNE.getPreco() * contadorDeCarne;
	        contadorDeCarne = (contadorDeCarne / 3) * 2;
	        valor += Ingrediente.HAMBURGER_CARNE.getPreco() * contadorDeCarne;
	      }
	      return valor;
	    }
	  },
	  MUITO_QUEIJO(true) {
		    @Override
		    public double aplicarRegra(List<Ingrediente> ingredientes, double valor) {
		      long contadorDeQueijo = ingredientes.stream()
		          .filter(ingrediente -> ingrediente.equals(Ingrediente.QUEIJO))
		          .count();
		      if (contadorDeQueijo % 3 == 0) {
		        valor -= Ingrediente.QUEIJO.getPreco() * contadorDeQueijo;
		        contadorDeQueijo = (contadorDeQueijo / 3) * 2;
		        valor += Ingrediente.QUEIJO.getPreco() * contadorDeQueijo;
		      }
		      return valor;
		    }
		  };
	

	  private boolean ativa;

	  Promocoes(boolean ativa) {
	    this.ativa = ativa;
	  }

	  public boolean isAtiva() {
	    return ativa;
	  }
	}
