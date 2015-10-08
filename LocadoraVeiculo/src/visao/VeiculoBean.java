package visao;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


import javax.faces.context.FacesContext;

import controle.VeiculoControle;
import modelo.Veiculo;

@ManagedBean(name="veiculoBean")
@SessionScoped
public class VeiculoBean {
	
	private Veiculo veiculo;
	private VeiculoControle controle;
	

	public VeiculoBean() {
		veiculo= new Veiculo();
		controle= new VeiculoControle();
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	
	
	public String salvar(){
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage message= null;
			
		try {
			controle.salvar(veiculo);
			message= new FacesMessage(FacesMessage.SEVERITY_INFO,"Veiculo cadastrado com sucesso!","");
			context.addMessage(null,message);
			return "mostrarVeiculo";
		} catch (Exception e) {
			e.printStackTrace();
			message = new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(),"");
			context.addMessage(null, message);
			return null;
		}
										
				
	}
	public String novo(){
		veiculo=new Veiculo();
		return "cadastroVeiculo";
	}
	
	
}
