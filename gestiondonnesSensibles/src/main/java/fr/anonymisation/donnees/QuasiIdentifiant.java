package fr.anonymisation.donnees;

public class QuasiIdentifiant {
	
	  public QuasiIdentifiant(int cp, int age) {
		super();
		this.cp = cp;
		this.age = age;
	}
	private int cp;
	  private int age;
	  
  public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


}