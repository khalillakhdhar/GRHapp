package com.sec.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String nom,prenom,email,mdp,adresse;
private int age;
private float salaire;
private String login;
private String description;

private String tel,recrutement,grade;



public String getDescription() {
	return description;
}



public void setDescription(String description) {
	this.description = description;
}



public Employee() {
	// TODO Auto-generated constructor stub
}



public String getLogin() {
	return login;
}



public void setLogin(String login) {
	this.login = login;
}



public Employee(long id, String nom, String prenom, String email, String mdp, String adresse, int age, String tel,
		String recrutement, String grade) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.mdp = mdp;
	this.adresse = adresse;
	this.age = age;
	this.tel = tel;
	this.recrutement = recrutement;
	this.grade = grade;
}



public long getId() {
	return id;
}



public void setId(long id) {
	this.id = id;
}



public String getNom() {
	return nom;
}



public void setNom(String nom) {
	this.nom = nom;
}



public String getPrenom() {
	return prenom;
}



public void setPrenom(String prenom) {
	this.prenom = prenom;
}



public float getSalaire() {
	return salaire;
}



public void setSalaire(float salaire) {
	this.salaire = salaire;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



public String getMdp() {
	return mdp;
}



public void setMdp(String mdp) {
	this.mdp = mdp;
}



public String getAdresse() {
	return adresse;
}



public void setAdresse(String adresse) {
	this.adresse = adresse;
}



public int getAge() {
	return age;
}



public void setAge(int age) {
	this.age = age;
}



public String getTel() {
	return tel;
}



public void setTel(String tel) {
	this.tel = tel;
}



public String getRecrutement() {
	return recrutement;
}



public void setRecrutement(String recrutement) {
	this.recrutement = recrutement;
}



public String getGrade() {
	return grade;
}



public void setGrade(String grade) {
	this.grade = grade;
}




}
