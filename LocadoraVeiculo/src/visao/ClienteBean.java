package visao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
//import javax.faces.view.facelets.FaceletContext;



import controle.ClienteControle;
import modelo.Cliente;

@ManagedBean(name = "clienteBean")
@SessionScoped
public class ClienteBean {

	private Cliente cliente;
	private String data; // criar um atributo para formatar data da classe Cliente;
	private ClienteControle controle;

	public ClienteBean() {
		super();
		this.cliente = new Cliente();
		this.controle =new ClienteControle();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
			cliente.setDataNascimento(dataFormatada);
			
		} catch (ParseException e) {    //criacao do FacesContext
			context.addMessage(null,message);
			message = new FacesMessage(FacesMessage.SEVERITY_INFO,"formato de data invalido!",""); // FacesMenssage severity
			
		} 
						
		
			try{
				controle.salvar(cliente);
				message = new FacesMessage(FacesMessage.SEVERITY_INFO,"Cliente cadastrado com sucesso!Obrigada!","");
				context.addMessage(null,message);
				return "mostrarCliente";
			}catch(Exception DataInvalida){
				message = new FacesMessage(FacesMessage.SEVERITY_ERROR,DataInvalida.getMessage(),"");
				context.addMessage(null,message);
				return null;
			}
		
	}

	public String novo() {
		cliente = new Cliente();
		data = "";
		return "cadastroCliente";
	}
}
