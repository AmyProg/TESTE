package controle;

import modelo.Evento;

public class EventoControle {
	public void salvar(Evento evento) throws Exception {
		if (evento.getTipo().trim().isEmpty()) {
			throw new Exception("� obrigatorio informar um tipo!Obrigada");
		}
		if (evento.getAnota�ao().trim().isEmpty()) {
			throw new Exception("Colabore com uma anota��o!");
		}
		if (evento.getResponsavel().trim().isEmpty()) {
			throw new Exception("Informe um responsavel");
		}
		if (evento.getLocal().trim().isEmpty()) {
			throw new Exception("Informe o Local!");
		}
		if (evento.getDura�ao() > 5) {
			throw new Exception("Informe a sua dura��o!Obrigada!Ex numeros maiores que 5");/*Aqui eu alterei a o sinal <= e assim da errado*/

		}
	}
}
