package mx.unam.diplomado.proyectofinal.vo;

import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Entidad {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer identity;
	private String entity;
	private Boolean statusentity;
	
	@OneToMany(mappedBy = "entidadPro")
//	@JoinColumn(name = "entityPro")
	private Collection<CapturaProtos> capturaProtos;
	
	@OneToMany(mappedBy = "entidadPod")
//	@JoinColumn(name = "entityPod")
	private Collection<CapturaPoderes> capturaPoderes;

	public Integer getIdentity() {
		return identity;
	}

	public void setIdentity(Integer identity) {
		this.identity = identity;
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public boolean isStatusentity() {
		return statusentity;
	}

	public void setStatusentity(boolean statusentity) {
		this.statusentity = statusentity;
	}

	@Override
	public String toString() {
		return "Entidad [identity=" + identity + ", entity=" + entity + ", statusentity=" + statusentity + "]";
	}
}