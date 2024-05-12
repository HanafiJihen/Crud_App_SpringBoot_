package project.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.spring.repository.ArticleRepository;
import project.spring.repository.CategorieRepository;
import project.spring.entities.*;


@Service
public class CategorieServiceImpl implements CategorieService {
	
	
	@Autowired
	CategorieRepository catRep;
	
	@Autowired
	ArticleRepository articleRep;
	

	@Override
	public void affecterArticleACategorie(Integer idArticle, Integer idCategorie) {
		// TODO Auto-generated method stub
		
		
		Categorie categorieEntity = catRep.findById(idCategorie).get();
		
		Article articleEntity = articleRep.findById(idArticle).get();
		
		articleEntity.setCategorie(categorieEntity);
		
		articleRep.save(articleEntity);
		
	}

}
