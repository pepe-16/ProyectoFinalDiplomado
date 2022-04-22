package mx.unam.diplomado.ejb;

import java.util.Collection;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.unam.dgtic.modelo.CapturaPoderService;
import mx.unam.dgtic.modelo.CapturaProtoService;
import mx.unam.dgtic.modelo.CargoService;
import mx.unam.dgtic.modelo.CaseFileService;
import mx.unam.dgtic.modelo.EntidadService;
import mx.unam.dgtic.modelo.ICapturaPoderDAO;
import mx.unam.dgtic.modelo.ICapturaProtoDAO;
import mx.unam.dgtic.modelo.ICargoDAO;
import mx.unam.dgtic.modelo.ICaseFileDAO;
import mx.unam.dgtic.modelo.IEntidadDAO;
import mx.unam.dgtic.modelo.IPoderDAO;
import mx.unam.dgtic.modelo.PoderService;
import mx.unam.diplomado.proyectofinal.vo.CapturaPoderes;
import mx.unam.diplomado.proyectofinal.vo.CapturaProtos;
import mx.unam.diplomado.proyectofinal.vo.Cargo;
import mx.unam.diplomado.proyectofinal.vo.CaseFile;
import mx.unam.diplomado.proyectofinal.vo.Entidad;
import mx.unam.diplomado.proyectofinal.vo.Poder;

/**
 * Session Bean implementation class AgendaEJB
 */
@Stateless
public class CapturaPoderEJB implements ICapturaPoderEJBLocal {

	private ICapturaPoderDAO daoCapturaPoder;

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("sicoponbase");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public Integer insertCapturaPoder(CapturaPoderes capturaPoderesModel) {
		daoCapturaPoder = CapturaPoderService.getInstance(em);
		return null;
	}
	@Override
	public Collection<CapturaPoderes> getCapturaPoderesStatus(Boolean status) {
		daoCapturaPoder = CapturaPoderService.getInstance(em);
		return daoCapturaPoder.findAllCapturaPoder(status);
	}
	@Override
	public void updateCapturaPoder(CapturaPoderes capturaPoderesModel) {
		daoCapturaPoder = CapturaPoderService.getInstance(em);
		
	}
	@Override
	public void deleteCapturaPoderes(Integer idCapturaPod) {
		daoCapturaPoder = CapturaPoderService.getInstance(em);
		daoCapturaPoder.removeCapturaPoder(idCapturaPod);;
	}


	/* Tabla CapturaPoderes */
//	@Override
//	public Collection<CapturaPoderes> cargaCapturaPoderes() {
//		daoCapturaPoder = CapturaPoderService.getInstance(em);
//		return daoCapturaPoder.findAllCapturaPoder();
//	}
	
	
	
	



}
