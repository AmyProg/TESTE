package visao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import controle.EventoControle;
import modelo.Evento;

@ManagedBean(name = "eventoBean")
@SessionScoped
public class EventoBean {
	private Evento evento;
	private String data;
	private EventoControle controle;

	public EventoBean() {
		super();
		this.evento = new Evento();
		this.controle = new EventoControle();
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public EventoControle getControle() {
		return controle;
	}

	public void setControle(EventoControle controle) {
		this.controle = controle;
	}

	public String salvar() {
		FacesContext context = FacesContext.getCurrentInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		FacesMessage message = null;

		try {
			Date dataFormatada = sdf.parse(data);
			evento.setData(dataFormatada);
		} catch (ParseException e) {
			context.addMessage(null, message);
			message = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"formato de data invalido!", "");
		}

		try {
			controle.salvar(evento);
			message = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Evento cadastrado com sucesso!Obrigada!", "");
			context.addMessage(null, message);
			return "mostrarEvento";
		} catch (Exception DataInvalida) {
			message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
					DataInvalida.getMessage(), "");
			context.addMessage(null, message);
			return null;
		}
	}

	public String novo() {
		evento = new Evento();
		data = "";
		return "cadastroEvento";
	}
}
