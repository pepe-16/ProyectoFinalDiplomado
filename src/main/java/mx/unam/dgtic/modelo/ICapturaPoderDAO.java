package mx.unam.dgtic.modelo;

import java.util.Collection;

import mx.unam.diplomado.proyectofinal.vo.CapturaPoderes;
import mx.unam.diplomado.proyectofinal.vo.Cargo;
import mx.unam.diplomado.proyectofinal.vo.CaseFile;
import mx.unam.diplomado.proyectofinal.vo.Entidad;
import mx.unam.diplomado.proyectofinal.vo.Poder;

public interface ICapturaPoderDAO {
	CapturaPoderes createCapturaPoder(Integer captura_poder_numControlP, String captura_poder_fecExpP,
			String captura_poder_numInstruP, Integer captura_poder_numNotarioP, String captura_poder_notarioP,
			String captura_poder_ruta_pdfproto, String captura_poder_representanteP, Poder captura_poder_poderP,
			CaseFile captura_proto_caseFileP, Entidad captura_proto_entityP, Cargo captura_proto_cargoP);

	Collection<CapturaPoderes> findAllCapturaPoder(Boolean status);

	CapturaPoderes findCapturaPoder(Integer idCapturaPod);

	CapturaPoderes updateCapturaPoder(Integer idCapturaPod, Integer captura_poder_numControlP,
			String captura_poder_fecExpP, String captura_poder_numInstruP, Integer captura_poder_numNotarioP,
			String captura_poder_notarioP, String captura_poder_ruta_pdfproto, String captura_poder_representanteP,
			Poder captura_poder_poderP, CaseFile captura_proto_caseFileP, Entidad captura_proto_entityP,
			Cargo captura_proto_cargoP);

	void removeCapturaPoder(Integer idCapturaPod);
}
