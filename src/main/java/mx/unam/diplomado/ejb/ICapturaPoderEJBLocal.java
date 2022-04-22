package mx.unam.diplomado.ejb;

import java.util.Collection;
import java.util.List;

import jakarta.ejb.Local;
import mx.unam.diplomado.proyectofinal.vo.CapturaPoderes;
import mx.unam.diplomado.proyectofinal.vo.CapturaProtos;
import mx.unam.diplomado.proyectofinal.vo.Cargo;
import mx.unam.diplomado.proyectofinal.vo.CaseFile;
import mx.unam.diplomado.proyectofinal.vo.Entidad;
import mx.unam.diplomado.proyectofinal.vo.Poder;

@Local
public interface ICapturaPoderEJBLocal {
	/*Tabla Captura_Poderes*/
	Integer insertCapturaPoder(CapturaPoderes capturaPoderesModel);
	
	Collection<CapturaPoderes> getCapturaPoderesStatus( Boolean status);
	
	void updateCapturaPoder(CapturaPoderes capturaPoderesModel);
	
	void deleteCapturaPoderes(Integer idCapturaPod);

}
