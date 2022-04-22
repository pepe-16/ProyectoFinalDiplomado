package mx.unam.dgtic.modelo;

import java.util.Collection;

import mx.unam.diplomado.proyectofinal.vo.Cargo;

public interface ICargoDAO {
	
	Cargo createCargo(String cargo);
	Collection<Cargo> findAllCargo();
	Cargo findCargo(Integer idcargo);
	Cargo updateCargo(Integer idcargo, String cargo);
	void removeCargo(Integer idcargo);
}
