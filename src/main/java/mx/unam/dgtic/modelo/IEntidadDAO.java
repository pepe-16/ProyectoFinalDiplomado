package mx.unam.dgtic.modelo;

import java.util.Collection;

import mx.unam.diplomado.proyectofinal.vo.Entidad;

public interface IEntidadDAO {
	
	Entidad createEntidad(String entity);
	Collection<Entidad> findAllEntidad();
	Entidad findEntidad(Integer identity);
	Entidad updateEntidad(Integer identity, String entity);
	void removeEntidad(Integer identity);
}
