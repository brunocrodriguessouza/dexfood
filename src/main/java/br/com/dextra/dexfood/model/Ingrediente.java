package br.com.dextra.dexfood.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author bruno
 *
 */

@Entity
@Table(name = "ingrediente")
public class Ingrediente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descricao;
	private Long quantidade;
	private BigDecimal preco;
	
	public Ingrediente() {
		
	}
		
	public Ingrediente(String descricao, Long quantidade, BigDecimal preco){
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Ingrediente(Long id, String descricao, Long quantidade, BigDecimal preco){
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public BigDecimal getValorTotal(){
		return getPreco().multiply(new BigDecimal(quantidade));
	}
	
	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	
}
