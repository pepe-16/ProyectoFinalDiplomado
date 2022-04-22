package mx.unam.dgtic.modelo;

import java.util.Collection;


import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import mx.unam.diplomado.proyectofinal.vo.Entidad;

public class EntidadService implements IEntidadDAO{

	protected EntityManager em;
	private static EntidadService instance;

	public static EntidadService getInstance(EntityManager em) {
		if (instance == null) {
			instance = new EntidadService(em);
		}
		return instance;
	}

	public EntidadService(EntityManager em) {
		this.em = em;
	}

	public Entidad createEntidad(String entity_entity) {

		Entidad emp = new Entidad();

		emp.setEntity(entity_entity);
		emp.setStatusentity(true);

		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();

		return emp;
	}

	public Collection<Entidad> findAllEntidad() {
		Query query = em.createQuery("Select e FROM Entidad e WHERE e.statusentity = 1");
		return (Collection<Entidad>) query.getResultList();
	}

	@Override
	public Entidad findEntidad(Integer identity) {
		return em.find(Entidad.class, identity);
	}

	@Override
	public Entidad updateEntidad(Integer identity, String entity) {
		Entidad updateentidad = this.findEntidad(identity);
		if (updateentidad != null) {
			em.getTransaction().begin();
			updateentidad.setEntity(entity);
			em.getTransaction().commit();
		}
		return updateentidad;
	}

	@Override
	public void removeEntidad(Integer identity) {
		TypedQuery<Entidad> query = em
				.createQuery("UPDATE Entidad e SET  e.statusentity = 0 WHERE e.identity = ?1", Entidad.class);
		em.getTransaction().begin();
		query.setParameter(1, identity).executeUpdate();
		em.getTransaction().commit();
	}

}
