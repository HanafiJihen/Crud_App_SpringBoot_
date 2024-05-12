package project.spring.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User implements Serializable {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	
	private long id;
	private String prenom;
	private String nom;
	private String adresse;
	private Integer age;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", adresse=" + adresse + ", age=" + age + "]";
	}
	
	public User(String prenom, String nom, String adresse, Integer age) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.age = age;
	}
	
	public User() {}
	
	

}
