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
public class CaseFile {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcaseFile;
	private String caseFile;
	private Boolean statuscaseFile;
	
	@OneToMany(mappedBy = "caseFilePro")
//	@JoinColumn(name = "entityPro")
	private Collection<CapturaProtos> capturaProtos;
	
	@OneToMany(mappedBy = "caseFilePod")
//	@JoinColumn(name = "entityPro")
	private Collection<CapturaPoderes> capturaPoderes;

	public Integer getIdcaseFile() {
		return idcaseFile;
	}

	public void setIdcaseFile(Integer idcaseFile) {
		this.idcaseFile = idcaseFile;
	}

	public String getCaseFile() {
		return caseFile;
	}

	public void setCaseFile(String caseFile) {
		this.caseFile = caseFile;
	}

	public boolean isStatuscaseFile() {
		return statuscaseFile;
	}

	public void setStatuscaseFile(boolean statuscaseFile) {
		this.statuscaseFile = statuscaseFile;
	}

	@Override
	public String toString() {
		return "CaseFile [idcaseFile=" + idcaseFile + ", caseFile=" + caseFile + ", statuscaseFile=" + statuscaseFile
				+ "]";
	}
}