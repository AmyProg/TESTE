package visao;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


import javax.faces.context.FacesContext;

import controle.ProdutoControle;
import modelo.Produto;


@ManagedBean(name = "produtoBean")
@SessionScoped
public class ProdutoBean {
	private Produto produto;
	private String data;
	private ProdutoControle controle;
	
	public ProdutoBean(){
		super();
		this.produto =new Produto();
		this.controle =new ProdutoControle();
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public String salvar() { //Implementacao da formatacao da Date;
		FacesContext context = FacesContext.getCurrentInstance();
		SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
		FacesMessage message= null;
		
		//Date import java.util.Date
		try {
			Date dataFormatada = sdf.parse(data);    //Sorround with try/cath
			produto.setDataNascimento(dataFormatada);
			
		} catch (ParseException e) {    //criacao do FacesContext
			context.addMessage(null,message);
			message = new FacesMessage(FacesMessage.SEVERITY_INFO,"formato de data invalido!",""); // FacesMenssage severity
			
		} 
						
		
			try{
				controle.salvar(produto);
				message = new FacesMessage(FacesMessage.SEVERITY_INFO,"Produto cadastrado com sucesso!Obrigada!","");
				context.addMessage(null,message);
				return "mostrarProduto";
			}catch(Exception DataInvalida){
				message = new FacesMessage(FacesMessage.SEVERITY_ERROR,DataInvalida.getMessage(),"");
				context.addMessage(null,message);
				return null;
			}
		
	}

	public String novo() {
		produto = new Produto();
		data = "";
		return "cadastroProduto";
	}

}
