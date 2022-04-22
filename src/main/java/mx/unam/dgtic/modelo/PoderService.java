package mx.unam.dgtic.modelo;

import java.util.Collection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import mx.unam.diplomado.proyectofinal.vo.CaseFile;
import mx.unam.diplomado.proyectofinal.vo.Poder;

public class PoderService implements IPoderDAO{
	
	protected EntityManager em;
	private static PoderService instance;
	
	public static PoderService getInstance(EntityManager em) {
		if (instance == null) {
			instance = new PoderService(em);
		}
		return instance;
	}

	public PoderService(EntityManager em) {
		this.em = em;
	}

	public Poder createPoder(String poder_poder) {

		Poder emp = new Poder();
		
		emp.setPoder(poder_poder);
		emp.setStatuspoder(true);
		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();

		return emp;
	}

	public Collection<Poder> findAllPoder() {
		Query query = em.createQuery("Select p FROM Poder p WHERE p.statuspoder = 1");
		return (Collection<Poder>) query.getResultList();
	}

	@Override
	public Poder findPoder(Integer idpoder) {
		return em.find(Poder.class, idpoder);
	}

	@Override
	public Poder updatePoder(Integer idpoder, String poder) {
		Poder updatepoder = this.findPoder(idpoder);
		if (updatepoder != null) {
			em.getTransaction().begin();
			updatepoder.setPoder(poder);
			em.getTransaction().commit();
		}
		return updatepoder;
	}

	@Override
	public void removePoder(Integer idpoder) {
		TypedQuery<Poder> query = em
				.createQuery("UPDATE Poder p SET  p.statuspoder = 0 WHERE p.idpoder = ?1", Poder.class);
		em.getTransaction().begin();
		query.setParameter(1, idpoder).executeUpdate();
		em.getTransaction().commit();
		
	}

}
