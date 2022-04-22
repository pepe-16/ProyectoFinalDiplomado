package mx.unam.dgtic.modelo;

import java.util.Collection;

import mx.unam.diplomado.proyectofinal.vo.CaseFile;

public interface ICaseFileDAO {
	CaseFile createCaseFile(String caseFile);
	Collection<CaseFile> findAllCaseFile();
	CaseFile findCaseFile(Integer idcaseFile);
	CaseFile updateCaseFile(Integer idcaseFile, String caseFile);
	void removeCaseFile(Integer idcaseFile);
}
