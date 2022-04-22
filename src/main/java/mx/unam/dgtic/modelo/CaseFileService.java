package mx.unam.dgtic.modelo;

import java.util.Collection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import mx.unam.diplomado.proyectofinal.vo.CaseFile;

public class CaseFileService implements ICaseFileDAO {

	protected EntityManager em;
	private static CaseFileService instance;

	public static CaseFileService getInstance(EntityManager em) {
		if (instance == null) {
			instance = new CaseFileService(em);
		}
		return instance;
	}

	public CaseFileService(EntityManager em) {
		this.em = em;
	}

	public CaseFile createCaseFile(String caseFile_caseFile) {

		CaseFile emp = new CaseFile();

		emp.setCaseFile(caseFile_caseFile);
		emp.setStatuscaseFile(true);

		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();

		return emp;
	}

	public Collection<CaseFile> findAllCaseFile() {
		Query query = em.createQuery("Select c FROM CaseFile c WHERE c.statuscaseFile = 1");
		return (Collection<CaseFile>) query.getResultList();
	}

	@Override
	public CaseFile findCaseFile(Integer idcaseFile) {
		return em.find(CaseFile.class, idcaseFile);
	}

	@Override
	public CaseFile updateCaseFile(Integer idcaseFile, String caseFile) {
		CaseFile updatecaseFile = this.findCaseFile(idcaseFile);
		if (updatecaseFile != null) {
			em.getTransaction().begin();
			updatecaseFile.setCaseFile(caseFile);
			em.getTransaction().commit();
		}
		return updatecaseFile;
	}

	@Override
	public void removeCaseFile(Integer idcaseFile) {
		TypedQuery<CaseFile> query = em
				.createQuery("UPDATE CaseFile c SET  c.statuscaseFile = 0 WHERE c.idcaseFile = ?1", CaseFile.class);
		em.getTransaction().begin();
		query.setParameter(1, idcaseFile).executeUpdate();
		em.getTransaction().commit();
	}

}
