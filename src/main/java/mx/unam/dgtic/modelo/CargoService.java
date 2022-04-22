package mx.unam.dgtic.modelo;

import java.util.Collection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import mx.unam.diplomado.proyectofinal.vo.Cargo;

public class CargoService implements ICargoDAO {
	
	protected EntityManager em;
	private static CargoService instance;
	
	public static CargoService getInstance(EntityManager em) {
		if (instance == null) {
			instance = new CargoService(em);
		}
		return instance;
	}

	public CargoService(EntityManager em) {
		this.em = em;
	}

	public Cargo createCargo(String cargo_cargo) {

		Cargo emp = new Cargo();
		
		emp.setcargo(cargo_cargo);
		emp.setStatuscargo(true);
		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();

		return emp;
	}

	public Collection<Cargo> findAllCargo() {
		Query query = em.createQuery("Select c FROM Cargo c WHERE c.statuscargo = 1");
		return (Collection<Cargo>) query.getResultList();
	}

	@Override
	public Cargo findCargo(Integer idcargo) {
		return em.find(Cargo.class, idcargo);
	}

	@Override
	public Cargo updateCargo(Integer idcargo, String cargo) {
		Cargo car = this.findCargo(idcargo);
		if (car != null) {
			em.getTransaction().begin();
			car.setcargo(cargo);
			em.getTransaction().commit();
		}
		return car;
	}

	@Override
	public void removeCargo(Integer idcargo) {
		TypedQuery<Cargo> query = em.createQuery("UPDATE Cargo c SET  c.statuscargo = 0 WHERE c.idcargo = ?1", Cargo.class);
		em.getTransaction().begin();
		query.setParameter(1, idcargo).executeUpdate();
		em.getTransaction().commit();
	}

}
