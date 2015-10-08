package dao;

public class DAOFactory {
	
	private static VeiculoDao veiculoDao;
	
	public static VeiculoDao getVeiculoDao(){
		if(veiculoDao == null){
			veiculoDao = new VeiculoDaoImp();
		}
		return veiculoDao;
	}
}
