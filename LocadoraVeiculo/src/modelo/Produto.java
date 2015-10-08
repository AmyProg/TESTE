package modelo;

import java.util.Date;

public class Produto {
	private long idProduto;
	private String nome;
	private String categoria;
	private Date dataNascimento;
	private double valor;
	private int quantidade;
	
	public Produto(){
		
	}
	
	public Produto(long idProduto,String nome,String categoria,Date dataNascimento,double valor,int quantidade){
		super();
		this.idProduto=idProduto;
		this.nome=nome;
		this.categoria=categoria;
		this.dataNascimento=dataNascimento;
	}
	
	public long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
