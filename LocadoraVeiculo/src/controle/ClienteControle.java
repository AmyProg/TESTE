package controle;

import modelo.Cliente;

public class ClienteControle {

	public void salvar(Cliente cliente)throws Exception{
		if(cliente.getNome().trim().isEmpty()){
			throw new Exception(" É obrigatório informar o seu nome");
			}
		if(cliente.getCpf().trim().length()!=14){
			throw new Exception(" Cpf inválida .Ex 111.222.333-44!");
			}
		if(cliente.getRg().trim().isEmpty()){
			throw new Exception(" O RG e obrigatorio!");
			}
		if(cliente.getEndereco().trim().isEmpty()){
			throw new Exception( " E obrigatorio informar um endereco");
			
		}
	}
}
