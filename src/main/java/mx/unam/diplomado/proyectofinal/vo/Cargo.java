package mx.unam.diplomado.proyectofinal.vo;

import java.util.Collection;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Cargo{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcargo;
	private String cargo;
	private Boolean statuscargo;

	
	@OneToMany(mappedBy = "cargoPro")
//	@JoinColumn(name = "caseFilePro")
	private Collection<CapturaProtos> capturaProtos;
	
	@OneToMany(mappedBy = "cargoPod")
//	@JoinColumn(name = "caseFilePod")
	private Collection<CapturaPoderes> capturaPoderes;
	
	public Integer getidcargo() {
		return idcargo;
	}
	
	public void setidcargo(Integer idcargo) {
		this.idcargo = idcargo;
	}
	
	public String getcargo() {
		return cargo;
	}
	
	public void setcargo(String cargo) {
		this.cargo = cargo;
	}
	
	public boolean isStatuscargo() {
		return statuscargo;
	}

	public void setStatuscargo(boolean statuscargo) {
		this.statuscargo = statuscargo;
	}

	@Override
	public String toString() {
		return "Cargo [idcargo=" + idcargo + ", cargo=" + cargo + ", statuscargo=" + statuscargo + "]";
	}
}