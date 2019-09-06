package br.com.dextra.dexfood.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private BigDecimal desconto;
	private BigDecimal semDesconto;
	private BigDecimal valor;
	
	@OneToMany
	private List<Lanche> itens = new ArrayList<Lanche>();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public BigDecimal getValor(){
		return valor;
	}
	
	public BigDecimal getDesconto(){
		return desconto;
	}
	
	public BigDecimal semDesconto(){
		return semDesconto;
	}
	
	public void setItens(List<Lanche> itens) {
		this.itens = itens;
	}
	
	public List<Lanche> getItens() {
		return itens;
	}
}
