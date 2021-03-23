package fr.anonymisation.donnees;

public class DonneesSensible {
  private int ce;
  private String maladies;
  
public DonneesSensible(int ce, String maladies) {
	super();
	this.ce = ce;
	this.maladies = maladies;
}
public int getCe() {
	return ce;
}
public void setCe(int ce) {
	this.ce = ce;
}
public String getMaladies() {
	return maladies;
}
public void setMaladies(String maladies) {
	this.maladies = maladies;
}

  
}