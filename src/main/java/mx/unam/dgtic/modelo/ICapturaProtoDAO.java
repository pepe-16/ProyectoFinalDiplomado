package mx.unam.dgtic.modelo;

import java.util.Collection;

import mx.unam.diplomado.proyectofinal.vo.CapturaProtos;
import mx.unam.diplomado.proyectofinal.vo.Cargo;
import mx.unam.diplomado.proyectofinal.vo.CaseFile;
import mx.unam.diplomado.proyectofinal.vo.Entidad;

public interface ICapturaProtoDAO {

	CapturaProtos createCapturaProto(Integer captura_proto_numControlP, String captura_proto_fecExpP,
			String captura_proto_numInstruP, Integer captura_proto_numNotarioP, String captura_proto_notarioP,
			String captura_proto_ruta_pdfproto, String captura_proto_otorganteP, CaseFile captura_proto_caseFileP,
			Entidad captura_proto_entityP, Cargo captura_proto_cargoP);

	Collection<CapturaProtos> findAllCapturaProto();

	CapturaProtos findCapturaProto(Integer idCapturaPro);

	CapturaProtos updateCapturaProto(Integer idCapturaPro, Integer captura_proto_numControlP,
			String captura_proto_fecExpP, String captura_proto_numInstruP, Integer captura_proto_numNotarioP,
			String captura_proto_notarioP, String captura_proto_ruta_pdfproto, String captura_proto_otorganteP,
			CaseFile captura_proto_caseFileP, Entidad captura_proto_entityP, Cargo captura_proto_cargoP);

	void removeCapturaProto(Integer idCapturaPro);

}
