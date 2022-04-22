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
public class CapturaPoderes {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCapturaPod;
	private Integer numControlPod;
	private String fecExpPod;
	private String numInstruPod;
	private Integer numNotarioPod;
	private String notarioPod;
	private String rutapdfPod;
	private String representantePod;
	private Boolean statuscapturaPod;
	
	@ManyToOne
    @JoinColumn(name = "poderPod")
	private Poder poderPod;
	@ManyToOne
    @JoinColumn(name = "entityPod")
	private Entidad entidadPod;
	@ManyToOne
	@JoinColumn(name = "cargoPod")
	private Cargo cargoPod;
	@ManyToOne
	@JoinColumn(name = "caseFilePod")
	private CaseFile caseFilePod;
	
	public Integer getIdCapturaPod() {
		return idCapturaPod;
	}
	
	public void setIdCapturaPod(Integer idCapturaPod) {
		this.idCapturaPod = idCapturaPod;
	}
	
	public Integer getNumControlPod() {
		return numControlPod;
	}
	
	public void setNumControlPod(Integer numControlPod) {
		this.numControlPod = numControlPod;
	}
	
	public String getFecExpPod() {
		return fecExpPod;
	}
	
	public void setFecExpPod(String fecExpPod) {
		this.fecExpPod = fecExpPod;
	}
	
	public String getNumInstruPod() {
		return numInstruPod;
	}
	
	public void setNumInstruPod(String numInstruPod) {
		this.numInstruPod = numInstruPod;
	}
	
	public Integer getNumNotarioPod() {
		return numNotarioPod;
	}
	
	public void setNumNotarioPod(Integer numNotarioPod) {
		this.numNotarioPod = numNotarioPod;
	}
	
	public String getNotarioPod() {
		return notarioPod;
	}
	
	public void setNotarioPod(String notarioPod) {
		this.notarioPod = notarioPod;
	}
	
	public String getRutapdfPod() {
		return rutapdfPod;
	}
	
	public void setRutapdfPod(String rutapdfPod) {
		this.rutapdfPod = rutapdfPod;
	}
	
	public String getRepresentantePod() {
		return representantePod;
	}
	
	public void setRepresentantePod(String representantePod) {
		this.representantePod = representantePod;
	}
	
	public Poder getPoderPod() {
		return poderPod;
	}
	
	public void setPoderPod(Poder poderPod) {
		this.poderPod = poderPod;
	}
	
	public Entidad getEntidadPod() {
		return entidadPod;
	}
	
	public void setEntidadPod(Entidad entidadPod) {
		this.entidadPod = entidadPod;
	}
	
	public Cargo getCargoPod() {
		return cargoPod;
	}
	
	public void setCargoPod(Cargo cargoPod) {
		this.cargoPod = cargoPod;
	}
	
	public CaseFile getCaseFilePod() {
		return caseFilePod;
	}
	
	public void setCaseFilePod(CaseFile caseFilePod) {
		this.caseFilePod = caseFilePod;
	}

	public boolean isStatuscapturaPod() {
		return statuscapturaPod;
	}

	public void setStatuscapturaPod(boolean statuscapturaPro) {
		this.statuscapturaPod = statuscapturaPro;
	}

	@Override
	public String toString() {
		return "CapturaPoderes [idCapturaPod=" + idCapturaPod + ", numControlPod=" + numControlPod + ", fecExpPod="
				+ fecExpPod + ", numInstruPod=" + numInstruPod + ", numNotarioPod=" + numNotarioPod + ", notarioPod="
				+ notarioPod + ", rutapdfPod=" + rutapdfPod + ", representantePod=" + representantePod
				+ ", statuscapturaPod=" + statuscapturaPod + ", getPoder()=" + getPoderPod() + ", getEntidad()="
				+ getEntidadPod() + ", getCargo()=" + getCargoPod() + ", getCaseFile()=" + getCaseFilePod() + "]";
	}
}