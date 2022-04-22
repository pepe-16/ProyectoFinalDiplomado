package mx.unam.dgtic.modelo;

import java.util.Collection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import mx.unam.diplomado.proyectofinal.vo.CapturaPoderes;
import mx.unam.diplomado.proyectofinal.vo.CapturaProtos;
import mx.unam.diplomado.proyectofinal.vo.Cargo;
import mx.unam.diplomado.proyectofinal.vo.CaseFile;
import mx.unam.diplomado.proyectofinal.vo.Entidad;

public class CapturaProtoService implements ICapturaProtoDAO {
	protected EntityManager em;
	private static CapturaProtoService instance;

	public static CapturaProtoService getInstance(EntityManager em) {
		if (instance == null) {
			instance = new CapturaProtoService(em);
		}
		return instance;
	}

	public CapturaProtoService(EntityManager em) {
		this.em = em;
	}

	public CapturaProtos createCapturaProto(Integer captura_proto_numControlP, String captura_proto_fecExpP,
			String captura_proto_numInstruP, Integer captura_proto_numNotarioP, String captura_proto_notarioP,
			String captura_proto_ruta_pdfproto, String captura_proto_otorganteP, CaseFile captura_proto_caseFileP,
			Entidad captura_proto_entityP, Cargo captura_proto_cargoP) {

		CapturaProtos emp = new CapturaProtos();

		emp.setCargoPro(captura_proto_cargoP);
		emp.setCaseFilePro(captura_proto_caseFileP);
		emp.setEntidadPro(captura_proto_entityP);
		emp.setFecExpPro(captura_proto_fecExpP);
		emp.setNotarioPro(captura_proto_notarioP);
		emp.setNumControlPro(captura_proto_numControlP);
		emp.setNumInstruPro(captura_proto_numInstruP);
		emp.setNumNotarioPro(captura_proto_numNotarioP);
		emp.setOtorgantePro(captura_proto_otorganteP);
		emp.setRutapdfPro(captura_proto_ruta_pdfproto);
		emp.setStatuscapturaPro(true);

		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();

		return emp;
	}

	public Collection<CapturaProtos> findAllCapturaProto() {
		Query query = em.createQuery("Select c FROM CapturaProtos c WHERE c.statuscapturaPro = 1");
		return (Collection<CapturaProtos>) query.getResultList();
	}

	@Override
	public CapturaProtos findCapturaProto(Integer idCapturaPro) {
		return em.find(CapturaProtos.class, idCapturaPro);
	}

	@Override
	public CapturaProtos updateCapturaProto(Integer idCapturaPro, Integer captura_proto_numControlP,
			String captura_proto_fecExpP, String captura_proto_numInstruP, Integer captura_proto_numNotarioP,
			String captura_proto_notarioP, String captura_proto_ruta_pdfproto, String captura_proto_otorganteP,
			CaseFile captura_proto_caseFileP, Entidad captura_proto_entityP, Cargo captura_proto_cargoP) {
		CapturaProtos updatecaprot = this.findCapturaProto(idCapturaPro);
		if (updatecaprot != null) {
			em.getTransaction().begin();
			updatecaprot.setCargoPro(captura_proto_cargoP);
			updatecaprot.setCaseFilePro(captura_proto_caseFileP);
			updatecaprot.setEntidadPro(captura_proto_entityP);
			updatecaprot.setFecExpPro(captura_proto_fecExpP);
			updatecaprot.setNotarioPro(captura_proto_notarioP);
			updatecaprot.setNumControlPro(captura_proto_numControlP);
			updatecaprot.setNumInstruPro(captura_proto_numInstruP);
			updatecaprot.setNumNotarioPro(captura_proto_numNotarioP);
			updatecaprot.setOtorgantePro(captura_proto_otorganteP);
			updatecaprot.setRutapdfPro(captura_proto_ruta_pdfproto);
			em.getTransaction().commit();
		}
		return updatecaprot;
	}

	@Override
	public void removeCapturaProto(Integer idCapturaPro) {
		TypedQuery<CapturaProtos> query = em.createQuery(
				"UPDATE CapturaProtos c SET  c.statuscapturaPro = 0 WHERE c.idCapturaPro = ?1", CapturaProtos.class);
		em.getTransaction().begin();
		query.setParameter(1, idCapturaPro).executeUpdate();
		em.getTransaction().commit();
	}
}
