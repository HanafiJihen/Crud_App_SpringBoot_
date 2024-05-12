package project.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import project.spring.services.CategorieService;




@RestController
public class CategorieController {
	
	@Autowired
	CategorieService catService;
	
	@PutMapping("/AffecterArticleACategorie/{idArticle}/{idCategorie}")
	@ResponseBody
	
	public void AffecterArticleACategorie(@PathVariable ("idArticle") int idArticle, @PathVariable ("idCategorie") int idCategorie) {
		
		catService.affecterArticleACategorie(idArticle, idCategorie);
		
	}
	
	
	
	
	

}
