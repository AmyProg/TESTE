package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import conexao.ConnectionManager;
import modelo.Veiculo;

//ADD IMPLEMENT METHODOS ELE CRIA OS METODOS PELO VEICULODAOIMP
public class VeiculoDaoImp implements VeiculoDao{

	private Connection connection;
	private final String INSERT = "INSERT INTO veiculo (montadora,modelo,ano,quilometragem,placa,valor) VALUES (?,?,?,?,?,?)";
	
	@Override
	public void salvar(Veiculo veiculo) {
		try{
			PreparedStatement ps =null;
			openConnection();
			
			ps = connection.prepareStatement(INSERT);
			
			ps.setString(1, veiculo.getMontadora());
			ps.setString(2,veiculo.getModelo());
			ps.setInt(3,veiculo.getAno());
			ps.setDouble(4,veiculo.getQuilometragem());
			ps.setString(5,veiculo.getPlaca());
			ps.setDouble(6, veiculo.getValor());
			
			ps.executeUpdate();
		}catch (SQLException ex){
			System.out.println("Erro ao executar o insert"+ ex);
		}finally{
			closeConnection();
		}
		
	}

	@Override
	public void alterar(Veiculo t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Veiculo t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Veiculo> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void openConnection() {
		connection = ConnectionManager.getInstance().getConnection();
		
	}

	@Override
	public void closeConnection() {
		if(!isConnectionClosed()){
			ConnectionManager.getInstance().closeConnection(connection);
		}
		
	}

	@Override
	public boolean isConnectionClosed() {
		try{
			if(connection.isClosed()){
				return true;
			}
		}catch (SQLException ex){
			System.out.println("Conexão com problema!");
		}
		return false;
	}

	@Override
	public Veiculo buscarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

}
