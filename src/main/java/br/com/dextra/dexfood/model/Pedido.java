package br.com.dextra.dexfood.model;

import java.util.List;

public class Pedido {
	private Lanche lanche;
	private List<Ingrediente> adicionais;
	
	public Lanche getLanche() {
		return lanche;
	}
	public void setLanche(Lanche lanche) {
		this.lanche = lanche;
	}
	public List<Ingrediente> getAdicionais() {
		return adicionais;
	}
	public void setAdicionais(List<Ingrediente> adicionais) {
		this.adicionais = adicionais;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	private double valorTotal;
	
}

//public BigDecimal getValorTotal(){
//return getPreco().multiply(new BigDecimal(quantidade));
//}
