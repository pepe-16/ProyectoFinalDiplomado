package mx.unam.diplomado.proyectofinal.vo;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;


@Access(AccessType.FIELD)
@Entity
public class CapturaProtos {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCapturaPro;
	private Integer numControlPro;
	private String fecExpPro;
	private String numInstruPro;
	private Integer numNotarioPro;
	private String notarioPro;
	private String rutapdfPro;
	private String otorgantePro;
	private Boolean statuscapturaPro;
	
	@ManyToOne
	@JoinColumn(name = "entityPro")
	private Entidad entidadPro;
	@ManyToOne
	@JoinColumn(name = "cargoPro")
	private Cargo cargoPro;
	@ManyToOne
	@JoinColumn(name = "caseFilePro")
	private CaseFile caseFilePro;
	
	public Integer getIdCapturaPro() {
		return idCapturaPro;
	}
	
	public void setIdCapturaPro(Integer idCapturaPro) {
		this.idCapturaPro = idCapturaPro;
	}
	
	public Integer getNumControlPro() {
		return numControlPro;
	}
	
	public void setNumControlPro(Integer numControlPro) {
		this.numControlPro = numControlPro;
	}
	
	public String getFecExpPro() {
		return fecExpPro;
	}
	
	public void setFecExpPro(String fecExpPro) {
		this.fecExpPro = fecExpPro;
	}
	
	public String getNumInstruPro() {
		return numInstruPro;
	}
	
	public void setNumInstruPro(String numInstruPro) {
		this.numInstruPro = numInstruPro;
	}
	
	public Integer getNumNotarioPro() {
		return numNotarioPro;
	}
	
	public void setNumNotarioPro(Integer numNotarioPro) {
		this.numNotarioPro = numNotarioPro;
	}
	
	public String getNotarioPro() {
		return notarioPro;
	}
	
	public void setNotarioPro(String notarioPro) {
		this.notarioPro = notarioPro;
	}
	
	public String getRutapdfPro() {
		return rutapdfPro;
	}
	
	public void setRutapdfPro(String rutapdfPro) {
		this.rutapdfPro = rutapdfPro;
	}
	
	public String getOtorgantePro() {
		return otorgantePro;
	}
	
	public void setOtorgantePro(String otorgantePro) {
		this.otorgantePro = otorgantePro;
	}
	
	
   
	public Boolean getStatuscapturaPro() {
		return statuscapturaPro;
	}

	public void setStatuscapturaPro(Boolean statuscapturaPro) {
		this.statuscapturaPro = statuscapturaPro;
	}

	public Entidad getEntidadPro() {
		return entidadPro;
	}

	public void setEntidadPro(Entidad entidadPro) {
		this.entidadPro = entidadPro;
	}

	public Cargo getCargoPro() {
		return cargoPro;
	}

	public void setCargoPro(Cargo cargoPro) {
		this.cargoPro = cargoPro;
	}

	public CaseFile getCaseFilePro() {
		return caseFilePro;
	}

	public void setCaseFilePro(CaseFile caseFilePro) {
		this.caseFilePro = caseFilePro;
	}

	public boolean isStatuscapturaPro() {
		return statuscapturaPro;
	}

	public void setStatuscapturaPro(boolean statuscapturaPro) {
		this.statuscapturaPro = statuscapturaPro;
	}

	@Override
	public String toString() {
		return "CapturaProtos [idCapturaPro=" + idCapturaPro + ", numControlPro=" + numControlPro + ", fecExpPro="
				+ fecExpPro + ", numInstruPro=" + numInstruPro + ", numNotarioPro=" + numNotarioPro + ", notarioPro="
				+ notarioPro + ", rutapdfPro=" + rutapdfPro + ", otorgantePro=" + otorgantePro + ", statuscapturaPro="
				+ statuscapturaPro + ", getCaseFile()=" + getCaseFilePro() + ", getEntidad()=" + getEntidadPro()
				+ ", getCargo()=" + getCargoPro() + "]";
	}
}