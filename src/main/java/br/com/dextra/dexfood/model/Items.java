package br.com.dextra.dexfood.model;

public enum Items {
	
	ALFACE("Alface"), 
	BACON("Bacon"), 
	HAMBURGUER_DE_CARNE("Hambúrguer de carne"), 
	OVO("Ovo"), 
	QUEIJO("Queijo");
	
	private String descricao;
	
	private Items(String descricao) {
        this.descricao = descricao;
    }

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
