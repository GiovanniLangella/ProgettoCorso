package model.dao;

import java.util.List;

import model.session.Aula;

public class CorsoService extends AbstractService<AulaDAO, Aula> {

	@Override
	public AulaDAO createDAO() {
		return new AulaDAO();
	}

	private static CorsoService oDoc = new CorsoService();
	
	public void elencoAula() {
		List<Aula> elenco = new CorsoService().findAll();
		for (int i = 0; i < elenco.size(); i++) {
			System.out.println(elenco.get(i).getid() + " " + elenco.get(i).getnumeroposti());
		}
	}
	
	public void nuovoAula() {
		Aula oAula = new Aula();
		oAula.setnumeroposti("Serafini");
		oAula.setnumeroposti("Claudio");
		new CorsoService().persist(oAula);
		List<Aula> elenco = new CorsoService().findAll();
		for (int i = 0; i < elenco.size(); i++) {
			System.out.println(elenco.get(i).getnome() + " " + elenco.get(i).getnumeroposti());
		}
	}

	public void modificaAula() {
		Aula oAula = new CorsoService().findById(2);
		oAula.setnumeroposti("Prezioso");
		oAula.setnumeroposti("Alex");
		new CorsoService().update(oAula);
		List<Aula> elenco = new CorsoService().findAll();
		for (int i = 0; i < elenco.size(); i++) {
			System.out.println(elenco.get(i).getnome() + " " + elenco.get(i).getnumeroposti());
		}
	}

	public void eliminaAula() {
		Aula oAula = new CorsoService().findById(2);
		if (oAula.getid() != 0)
			oDoc.delete(oAula.getid());
	}

}
