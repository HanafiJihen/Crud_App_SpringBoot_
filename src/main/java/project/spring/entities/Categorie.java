package project.spring.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Categorie {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private int id ;
	private String libelleCategorie;
	
	
	@OneToMany (mappedBy="categorie")
	private List <Article> articles;
	
	
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelleCategorie() {
		return libelleCategorie;
	}
	public void setLibelleCategorie(String libelleCategorie) {
		this.libelleCategorie = libelleCategorie;
	}
	
	
	

	@Override
	public String toString() {
		return "Categorie [id=" + id + ", libelleCategorie=" + libelleCategorie + ", articles=" + articles + "]";
	}
	
	
	public Categorie(int id, String libelleCategorie, List<Article> articles) {
		super();
		this.id = id;
		this.libelleCategorie = libelleCategorie;
		this.articles = articles;
	}
	public Categorie() {}
	
	
	

	
	
}
