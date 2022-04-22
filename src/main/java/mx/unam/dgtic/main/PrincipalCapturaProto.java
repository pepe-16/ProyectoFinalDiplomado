package mx.unam.dgtic.main;

import java.util.Collection;



import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.unam.dgtic.modelo.CapturaPoderService;
import mx.unam.dgtic.modelo.CapturaProtoService;
import mx.unam.dgtic.modelo.CargoService;
import mx.unam.dgtic.modelo.CaseFileService;
import mx.unam.dgtic.modelo.EntidadService;
import mx.unam.dgtic.modelo.ICapturaProtoDAO;
import mx.unam.dgtic.modelo.ICapturaPoderDAO;
import mx.unam.dgtic.modelo.ICargoDAO;
import mx.unam.dgtic.modelo.ICaseFileDAO;
import mx.unam.dgtic.modelo.IEntidadDAO;
import mx.unam.dgtic.modelo.IPoderDAO;
import mx.unam.dgtic.modelo.PoderService;

public class PrincipalCapturaProto {
	private static ICargoDAO daoCargo;
	private static ICaseFileDAO daoCaseFile;
	private static IEntidadDAO daoEntidad;
	private static ICapturaProtoDAO daoCapturaProto;
	private static ICapturaPoderDAO daoCapturaPoder;
	private static IPoderDAO daoPoder;
	

	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sicoponbase");
		EntityManager em = emf.createEntityManager();
		System.out.println("YEDRA PADILLA JOSE LUIS");

		daoCargo = CargoService.getInstance(em);
		daoCaseFile = CaseFileService.getInstance(em);
		daoEntidad = EntidadService.getInstance(em);
		daoPoder = PoderService.getInstance(em);
		daoCapturaProto = CapturaProtoService.getInstance(em);
		daoCapturaPoder = CapturaPoderService.getInstance(em);

		

//		System.out.println("Estado inicial de la base de datos....");
//		System.out.println("No hay captura de protocolaciones notariales....");
//		System.out.println("");
//		System.out.println("CARGOS....");
//		printCollection(daoCargo.findAllCargo());
//		System.out.println("");
//		System.out.println("CASE FILE....");
//		printCollection(daoCaseFile.findAllCaseFile());
//		System.out.println("");
//		System.out.println("ENTIDADES FEDERATIVAS....");
//		printCollection(daoEntidad.findAllEntidad());
//		System.out.println("");
//		System.out.println("PODERES....");
//		printCollection(daoPoder.findAllPoder());
//		System.out.println("");
//		System.out.println("PROTOCOLIZACIONES NOTARIALES....");
//		printCollection(daoCapturaProto.findAllCapturaProto());
//		System.out.println("");
//		System.out.println("PODERES NOTARIALES....");
//		printCollection(daoCapturaPoder.findAllCapturaPoder());
		
		//SET DE CARGO 
//		System.out.println("SET DE CARGO.......");
//		System.out.println("FIND (1)");
//		System.out.println(daoCargo.findCargo(1));
//		System.out.println("CREATE CARGO");
//		System.out.println(daoCargo.createCargo("ABOGADO AUXILIAR NIVEL 1"));
//		System.out.println("CARGOS....");
//		printCollection(daoCargo.findAllCargo());
//		System.out.println("DELETE CARGO");
//		daoCargo.removeCargo(7);
//		System.out.println("CARGOS....");
//		printCollection(daoCargo.findAllCargo());
//		System.out.println("UPDATE CARGO (2)");
//		System.out.println(daoCargo.updateCargo(2, "ABOGADO GENERAL OAG 2"));
		
//		System.out.println(daoCapturaPoder.findAllCapturaPoder());
		
		daoCapturaPoder.removeCapturaPoder(1);
		
//		System.out.println(daoCapturaPoder.findCapturaPoder(1));
		
//		System.out.println(daoCapturaPoder.findAllCapturaPoder());
		
		
		
		
		
	
		
	}

	private static void printCollection(Collection<?> c) {
		for (Object o : c) {
			System.out.println(o);
		}
	}

}
