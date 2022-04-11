package model.dao;

import java.util.List;

import model.session.Aula;

public class AulaService extends AbstractService<AulaDAO, Aula> {

	@Override
	public AulaDAO createDAO() {
		return new AulaDAO();
	}

	private static AulaService oDoc = new AulaService();
	
	public void elencoAula() {
		List<Aula> elenco = new AulaService().findAll();
		for (int i = 0; i < elenco.size(); i++) {
			System.out.println(elenco.get(i).getid() + " " + elenco.get(i).getnumeroposti());
		}
	}
	
	public void nuovoAula() {
		Aula oAula = new Aula();
		oAula.setnumeroposti("Serafini");
		oAula.setnumeroposti("Claudio");
		new AulaService().persist(oAula);
		List<Aula> elenco = new AulaService().findAll();
		for (int i = 0; i < elenco.size(); i++) {
			System.out.println(elenco.get(i).getnome() + " " + elenco.get(i).getnumeroposti());
		}
	}

	public void modificaAula() {
		Aula oAula = new AulaService().findById(2);
		oAula.setnumeroposti("Prezioso");
		oAula.setnumeroposti("Alex");
		new AulaService().update(oAula);
		List<Aula> elenco = new AulaService().findAll();
		for (int i = 0; i < elenco.size(); i++) {
			System.out.println(elenco.get(i).getnome() + " " + elenco.get(i).getnumeroposti());
		}
	}

	public void eliminaAula() {
		Aula oAula = new AulaService().findById(2);
		if (oAula.getid() != 0)
			oDoc.delete(oAula.getid());
	}

}
