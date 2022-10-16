package bean;

import java.util.List;

public class BoletimBean {

	private String nomeAluno;
	private String nomeTurma;
	private List<NotaBean> notaList;

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getNomeTurma() {
		return nomeTurma;
	}

	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}

	public List<NotaBean> getNotaList() {
		return notaList;
	}

	public void setNotaList(List<NotaBean> notaList) {
		this.notaList = notaList;
	}

}
