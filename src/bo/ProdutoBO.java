package bo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import bean.ProdutoBean;

public class ProdutoBO {

	private List<ProdutoBean> prodList = null;
	
	public void iniciar() {
		prodList = new ArrayList<ProdutoBean>();
	}
	
	
	public void informarDados(String descricao, BigDecimal preco) {
	
		ProdutoBean prodBean = new ProdutoBean();
		
		prodBean.setDescricao(descricao);
		prodBean.setPreco(preco);
		
		
		prodList.add(prodBean);		
	}

	public List<ProdutoBean> getProdutoList() {
		return this.prodList;
	}
}
