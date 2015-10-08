package modelo;

import java.util.Date;

public class Evento {
	private long idEvento;
	private Date data;
	private String tipo;
	private String anotaçao;
	private String responsavel;
	private String local;
	private int duraçao;

	public Evento() {

	}

	public Evento(long idEvento, Date data, String tipo, String anotaçao,
			String responsavel, String local, int duracaçao) {
		super();
		this.idEvento = idEvento;
		this.data = data;
		this.tipo = tipo;
		this.anotaçao = anotaçao;
		this.responsavel = responsavel;
		this.local = local;
		this.duraçao = duracaçao;
	}

	public long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(long idEvento) {
		this.idEvento = idEvento;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAnotaçao() {
		return anotaçao;
	}

	public void setAnotaçao(String anotaçao) {
		this.anotaçao = anotaçao;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getDuraçao() {
		return duraçao;
	}

	public void setDuraçao(int duraçao) {
		this.duraçao = duraçao;
	}
}