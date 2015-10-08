package modelo;

import java.util.Date;

public class Evento {
	private long idEvento;
	private Date data;
	private String tipo;
	private String anota�ao;
	private String responsavel;
	private String local;
	private int dura�ao;

	public Evento() {

	}

	public Evento(long idEvento, Date data, String tipo, String anota�ao,
			String responsavel, String local, int duraca�ao) {
		super();
		this.idEvento = idEvento;
		this.data = data;
		this.tipo = tipo;
		this.anota�ao = anota�ao;
		this.responsavel = responsavel;
		this.local = local;
		this.dura�ao = duraca�ao;
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

	public String getAnota�ao() {
		return anota�ao;
	}

	public void setAnota�ao(String anota�ao) {
		this.anota�ao = anota�ao;
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

	public int getDura�ao() {
		return dura�ao;
	}

	public void setDura�ao(int dura�ao) {
		this.dura�ao = dura�ao;
	}
}