package dao;

import modelo.Veiculo;

public interface VeiculoDao extends DAO<Veiculo> {
	
	public Veiculo buscarPorPlaca(String placa);
}
