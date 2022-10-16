package bean;

import java.math.BigDecimal;

public class ProdutoBean {
	
	private Integer id;
	private String descricao;
	private BigDecimal preco;

	public ProdutoBean() {
		super();
	}
	
	public ProdutoBean(Integer id, String descricao, BigDecimal preco) {
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

}
