package modelo;

public class Veiculo {
	private long idVeiculo;
	private String montadora;
	private String modelo;
	private int ano;
	private double quilometragem;
	private String placa;
	private double valor;
	
	public Veiculo() {
		
	}

	public Veiculo(long idVeiculo, String montadora, String modelo, int ano,
			double quilometragem, String placa, double valor) {
		super();
		this.idVeiculo = idVeiculo;
		this.montadora = montadora;
		this.modelo = modelo;
		this.ano = ano;
		this.quilometragem = quilometragem;
		this.placa = placa;
		this.valor = valor;
	}
	
	public long getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(long idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}


	
}
