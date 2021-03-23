package fr.anonymisation.donnees;

import fr.anonymisation.donnees.Identifiant;
import fr.anonymisation.donnees.QuasiIdentifiant;
import fr.anonymisation.donnees.DonneesSensible;

public class Donnees {

	public Donnees(Identifiant identifiant, QuasiIdentifiant quasiIdentifiant, DonneesSensible donneesSensible) {
		super();
		this.identifiant = identifiant;
		this.quasiIdentifiant = quasiIdentifiant;
		this.donneesSensible = donneesSensible;
	}

	private int id;
	private Identifiant identifiant;

	private QuasiIdentifiant quasiIdentifiant;

	private DonneesSensible donneesSensible;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Identifiant getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(Identifiant identifiant) {
		this.identifiant = identifiant;
	}

	public QuasiIdentifiant getQuasiIdentifiant() {
		return quasiIdentifiant;
	}

	public void setQuasiIdentifiant(QuasiIdentifiant quasiIdentifiant) {
		this.quasiIdentifiant = quasiIdentifiant;
	}

	public DonneesSensible getDonneesSensible() {
		return donneesSensible;
	}

	public void setDonneesSensible(DonneesSensible donneesSensible) {
		this.donneesSensible = donneesSensible;
	}

}