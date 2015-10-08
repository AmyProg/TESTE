package controle;

import dao.DAOFactory;
import dao.VeiculoDao;
import modelo.Veiculo;

public class VeiculoControle {
	
	public void salvar(Veiculo veiculo) throws Exception{
		if(veiculo.getModelo().trim().isEmpty()){
			throw new Exception("É obrigatório selecionar um modelo!");
		}
		if(veiculo.getQuilometragem() < 0){
			throw new Exception("A quilometragem deve ser maior que 0!");
		}
		if(veiculo.getQuilometragem() >10000){
			throw new Exception ("Não pode cadastrar veiculos com mais de 10000 Km!");
		}
		if(veiculo.getPlaca().trim().length() != 8){
			throw new Exception("Placa Inválida! Ex. MMM-0000");
		}
		
		VeiculoDao veiculoDao = DAOFactory.getVeiculoDao();
		veiculoDao.salvar(veiculo);
	}
}
