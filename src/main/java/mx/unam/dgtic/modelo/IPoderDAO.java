package mx.unam.dgtic.modelo;

import java.util.Collection;

import mx.unam.diplomado.proyectofinal.vo.Poder;

public interface IPoderDAO {
	
	Poder createPoder(String poder);
	Collection<Poder> findAllPoder();
	Poder findPoder(Integer idpoder);
	Poder updatePoder(Integer idpoder, String poder);
	void removePoder(Integer idpoder);
}
