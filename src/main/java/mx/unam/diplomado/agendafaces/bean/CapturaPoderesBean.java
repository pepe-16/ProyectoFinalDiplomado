package mx.unam.diplomado.agendafaces.bean;

import java.util.ArrayList;
import java.util.Collection;

import javax.naming.InitialContext;

import jakarta.enterprise.inject.Model;
import jakarta.enterprise.inject.Produces;
import mx.unam.diplomado.ejb.ICapturaPoderEJBLocal;
import mx.unam.diplomado.proyectofinal.vo.CapturaPoderes;

@Model
public class CapturaPoderesBean {


	/* Tabla CapturaPoderes */
	@Produces
	@Model
	public Collection<CapturaPoderes> cargaCapturaPoderes() {
		Collection<CapturaPoderes> capturapoderes = null;
		ICapturaPoderEJBLocal service = null;
		try {
			InitialContext ctx = new InitialContext();
			service = (ICapturaPoderEJBLocal) ctx
					.lookup("java:global/ProyectoFinalDiplomado/CapturaPoderEJB!mx.unam.diplomado.ejb.ICapturaPoderEJBLocal");
			if (service != null) {
				capturapoderes = service.getCapturaPoderesStatus(true);

			} else {
				capturapoderes = new ArrayList();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return capturapoderes;
	}
	
//	public CapturaPoderes actualizaCapturaPoder(Integer idCapturaPod, Integer captura_poder_numControlP,
//			String captura_poder_fecExpP, String captura_poder_numInstruP, Integer captura_poder_numNotarioP,
//			String captura_poder_notarioP, String captura_poder_ruta_pdfproto, String captura_poder_representanteP,
//			Poder captura_poder_poderP, CaseFile captura_proto_caseFileP, Entidad captura_proto_entityP,
//			Cargo captura_proto_cargoP) {
//		CapturaPoderes capturapoder = null;
//		ISiciponEJBLocal service = null;
//		try {
//			InitialContext ctx = new InitialContext();
//			service = (ISiciponEJBLocal) ctx
//					.lookup("java:global/ProyectoFinalDiplomado/SicoponEJB!mx.unam.diplomado.ejb.ISiciponEJBLocal");
//			if (service != null) {
//				capturapoder = service.actualizaCapturaPoder(idCapturaPod, captura_poder_numControlP, captura_poder_fecExpP, captura_poder_numInstruP, captura_poder_numNotarioP, captura_poder_notarioP, captura_poder_ruta_pdfproto, captura_poder_representanteP, captura_poder_poderP, captura_proto_caseFileP, captura_proto_entityP, captura_proto_cargoP);
//
//			}
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//		return capturapoder;
//	}
//		
//	
	public void eliminaCapturaPoderes(Integer idCapturaPod) {
		
		System.out.println("ID: " + idCapturaPod);

		ICapturaPoderEJBLocal service = null;
		try {
			InitialContext ctx = new InitialContext();
			service = (ICapturaPoderEJBLocal) ctx
					.lookup("java:global/ProyectoFinalDiplomado/CapturaPoderEJB!mx.unam.diplomado.ejb.ICapturaPoderEJBLocal");
			if (service != null) {
				service.deleteCapturaPoderes(idCapturaPod);

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public String gotoCapturaPoderes() {
        return "consultaPoderes";
    }

}
