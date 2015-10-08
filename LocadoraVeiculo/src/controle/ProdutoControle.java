package controle;

import modelo.Produto;


public class ProdutoControle {
	
	public void salvar(Produto produto)throws Exception{
	
			if(produto.getNome().trim().isEmpty()){
				throw new Exception(" É obrigatório informar o seu nome");
				}
			if(produto.getCategoria().trim().isEmpty()){
				throw new Exception(" É obrigatório informar a categoria!");
				}
			if(produto.getValor() >=0){
				throw new Exception("Valor maior que zero!");
				}
			if(produto.getQuantidade() >=0){
				throw new Exception( " E obrigatorio informar a quantidade");
			
		}
	}
}
