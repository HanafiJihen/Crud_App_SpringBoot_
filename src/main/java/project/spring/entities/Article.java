package project.spring.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Article implements Serializable {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private  int id;
	private String libelle;
	private float prix;
	private int quantite;
	
	
	@ManyToOne
	private Categorie categorie;
	
	
	
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	@Override
	public String toString() {
		return "Article [id=" + id + ", libelle=" + libelle + ", prix=" + prix + ", quantite=" + quantite
				+ ", categorie=" + categorie + "]";
	}
	
	
	public Article(int id, String libelle, float prix, int quantite, Categorie categorie) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.prix = prix;
		this.quantite = quantite;
		this.categorie = categorie;
	}
	public Article() {}
	

}
