package mx.unam.dgtic.modelo;

import java.util.Collection;

import jakarta.enterprise.context.SessionScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import mx.unam.diplomado.proyectofinal.vo.CapturaPoderes;
import mx.unam.diplomado.proyectofinal.vo.Cargo;
import mx.unam.diplomado.proyectofinal.vo.CaseFile;
import mx.unam.diplomado.proyectofinal.vo.Entidad;
import mx.unam.diplomado.proyectofinal.vo.Poder;

@SessionScoped
public class CapturaPoderService implements ICapturaPoderDAO {
	protected EntityManager em;
	private static CapturaPoderService instance;

	public static CapturaPoderService getInstance(EntityManager em) {
		if (instance == null) {
			instance = new CapturaPoderService(em);
		}
		return instance;
	}

	public CapturaPoderService(EntityManager em) {
		this.em = em;
	}

	public CapturaPoderes createCapturaPoder(Integer captura_poder_numControlP, String captura_poder_fecExpP,
			String captura_poder_numInstruP, Integer captura_poder_numNotarioP, String captura_poder_notarioP,
			String captura_poder_ruta_pdfproto, String captura_poder_representanteP, Poder captura_poder_poderP,
			CaseFile captura_proto_caseFileP, Entidad captura_proto_entityP, Cargo captura_proto_cargoP) {

		CapturaPoderes emp = new CapturaPoderes();

		emp.setPoderPod(captura_poder_poderP);
		emp.setCargoPod(captura_proto_cargoP);
		emp.setCaseFilePod(captura_proto_caseFileP);
		emp.setEntidadPod(captura_proto_entityP);
		emp.setFecExpPod(captura_poder_fecExpP);
		emp.setNotarioPod(captura_poder_notarioP);
		emp.setNumControlPod(captura_poder_numControlP);
		emp.setNumInstruPod(captura_poder_numInstruP);
		emp.setNumNotarioPod(captura_poder_numNotarioP);
		emp.setRepresentantePod(captura_poder_representanteP);
		emp.setRutapdfPod(captura_poder_ruta_pdfproto);
		emp.setStatuscapturaPod(true);

		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();

		return emp;
	}

	public CapturaPoderes findCapturaPoder(Integer idCapturaPod) {
		return em.find(CapturaPoderes.class, idCapturaPod);
	}

	public Collection<CapturaPoderes> findAllCapturaPoder( Boolean status) {
		TypedQuery<CapturaPoderes> query = em.createQuery(
		"SELECT c FROM CapturaPoderes c WHERE c.statuscapturaPod  = :statuscapturaPod", CapturaPoderes.class);
		return query.setParameter("statuscapturaPod", status).getResultList();
	}

	public CapturaPoderes updateCapturaPoder(Integer idCapturaPod, Integer captura_poder_numControlP,
			String captura_poder_fecExpP, String captura_poder_numInstruP, Integer captura_poder_numNotarioP,
			String captura_poder_notarioP, String captura_poder_ruta_pdfproto, String captura_poder_representanteP,
			Poder captura_poder_poderP, CaseFile captura_proto_caseFileP, Entidad captura_proto_entityP,
			Cargo captura_proto_cargoP) {
		CapturaPoderes updatecapod = this.findCapturaPoder(idCapturaPod);
		if (updatecapod != null) {
			em.getTransaction().begin();
			updatecapod.setPoderPod(captura_poder_poderP);
			updatecapod.setCargoPod(captura_proto_cargoP);
			updatecapod.setCaseFilePod(captura_proto_caseFileP);
			updatecapod.setEntidadPod(captura_proto_entityP);
			updatecapod.setFecExpPod(captura_poder_fecExpP);
			updatecapod.setNotarioPod(captura_poder_notarioP);
			updatecapod.setNumControlPod(captura_poder_numControlP);
			updatecapod.setNumInstruPod(captura_poder_numInstruP);
			updatecapod.setNumNotarioPod(captura_poder_numNotarioP);
			updatecapod.setRepresentantePod(captura_poder_representanteP);
			updatecapod.setRutapdfPod(captura_poder_ruta_pdfproto);
			em.getTransaction().commit();
		}
		return updatecapod;
	}
	
	public void removeCapturaPoder(Integer idCapturaPod) {
		TypedQuery<CapturaPoderes> query = em.createQuery(
		"UPDATE CapturaPoderes c SET  c.statuscapturaPod = 0 WHERE c.idCapturaPod = :idcapturaPod", CapturaPoderes.class);
		em.getTransaction().begin();
		query.setParameter("idcapturaPod", idCapturaPod).executeUpdate();
		em.getTransaction().commit();
	}

}
