package controle;

import modelo.Evento;

public class EventoControle {
	public void salvar(Evento evento) throws Exception {
		if (evento.getTipo().trim().isEmpty()) {
			throw new Exception("É obrigatorio informar um tipo!Obrigada");
		}
		if (evento.getAnotaçao().trim().isEmpty()) {
			throw new Exception("Colabore com uma anotação!");
		}
		if (evento.getResponsavel().trim().isEmpty()) {
			throw new Exception("Informe um responsavel");
		}
		if (evento.getLocal().trim().isEmpty()) {
			throw new Exception("Informe o Local!");
		}
		if (evento.getDuraçao() > 5) {
			throw new Exception("Informe a sua duração!Obrigada!Ex numeros maiores que 5");/*Aqui eu alterei a o sinal <= e assim da errado*/

		}
	}
}
