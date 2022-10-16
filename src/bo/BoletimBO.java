package bo;

import bean.BoletimBean;
import dao.BoletimDAO;

public class BoletimBO {

	private BoletimBean boletimBean = null;
	
	public void iniciar() {
		this.boletimBean = new BoletimBean();
	}

	public void carregar(Integer index) {
		this.boletimBean = BoletimDAO.getBoletimBeanByIndex(index);
	}

	public void definirDados(String nomeAluno, String turma) throws Exception {
		validarCarregarIniciar();
		
		this.boletimBean.setNomeAluno(nomeAluno);
		this.boletimBean.setNomeTurma(turma);
		
		BoletimDAO.add(this.boletimBean);
	}
	
	public BoletimBean getBoletim() {
		return this.boletimBean;
	}
	
	public void validarCarregarIniciar() throws Exception {
		try {
			if (this.boletimBean == null) throw new Exception("Boletim não iniciado/carregado.");
		} catch (Exception e) {
			throw new Exception(e.getMessage()); 
		}
	}
}
