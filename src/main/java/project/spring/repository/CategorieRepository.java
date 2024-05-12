package project.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import project.spring.entities.Categorie;


@Repository
public interface CategorieRepository extends CrudRepository <Categorie,Integer>  {

}

