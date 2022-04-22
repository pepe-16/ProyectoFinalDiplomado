package mx.unam.diplomado.proyectofinal.vo;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Poder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idpoder;
	private String poder;
	private Boolean statuspoder;

	@OneToMany(mappedBy = "poderPod")
//	@JoinColumn(name = "poderPod")
	private Collection<CapturaPoderes> capturaPoderes;

	public Integer getIdpoder() {
		return idpoder;
	}

	public void setIdpoder(Integer idpoder) {
		this.idpoder = idpoder;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	public boolean isStatuspoder() {
		return statuspoder;
	}

	public void setStatuspoder(boolean statuspoder) {
		this.statuspoder = statuspoder;
	}

	@Override
	public String toString() {
		return "Poder [idpoder=" + idpoder + ", poder=" + poder + ", statuspoder=" + statuspoder + "]";
	}
}
