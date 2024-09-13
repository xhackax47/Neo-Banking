package fr.xhackax47.Neo_Banking;

public class Account {
	
	// Attributs de la classe
	public int ID;
	public String Nom;
	public String Prénom;
	public String Email;
	public String Téléphone;
	
	// Constructeurs
	public Account(int iD) {
		super();
		ID = (int) Math.random();
	}
	
	public Account(int iD, String nom, String prénom, String email, String téléphone) {
		super();
		ID = (int) Math.random();
		Nom = nom;
		Prénom = prénom;
		Email = email;
		Téléphone = téléphone;
	}
	
	// Getters/Setters
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrénom() {
		return Prénom;
	}
	public void setPrénom(String prénom) {
		Prénom = prénom;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTéléphone() {
		return Téléphone;
	}
	public void setTéléphone(String téléphone) {
		Téléphone = téléphone;
	}
	
	
	
}
