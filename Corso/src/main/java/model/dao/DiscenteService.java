package model.dao;

import java.util.List;

import model.session.Discente;
import model.session.Docente;

public class DiscenteService extends AbstractService<DiscenteDAO, Discente> {

	@Override
	public DiscenteDAO createDAO() {
		return new DiscenteDAO();
	}

	private static DiscenteService oDoc = new DiscenteService();
	
	public void elencoDiscente() {
		List<Discente> elenco = new DiscenteService().findAll();
		for (int i = 0; i < elenco.size(); i++) {
			System.out.println(elenco.get(i).getNome() + " " + elenco.get(i).getCognome());
		}
	}
	
	public void nuovoDiscente() {
		Discente oDiscente = new Discente();
		oDiscente.setCognome("Serafini");
		oDiscente.setNome("Claudio");
		new DiscenteService().persist(oDiscente);
		List<Discente> elenco = new DiscenteService().findAll();
		for (int i = 0; i < elenco.size(); i++) {
			System.out.println(elenco.get(i).getNome() + " " + elenco.get(i).getCognome());
		}
	}

	public void modificaDiscente() {
		Discente oDiscente = new DiscenteService().findById(2);
		oDiscente.setCognome("Prezioso");
		oDiscente.setNome("Alex");
		new DiscenteService().update(oDiscente);
		List<Discente> elenco = new DiscenteService().findAll();
		for (int i = 0; i < elenco.size(); i++) {
			System.out.println(elenco.get(i).getNome() + " " + elenco.get(i).getCognome());
		}
	}

	public void eliminaDiscente() {
		Discente oDiscente = new DiscenteService().findById(2);
		if (oDiscente.getMatricola() != 0)
			oDoc.delete(oDiscente.getMatricola());
	}

}
