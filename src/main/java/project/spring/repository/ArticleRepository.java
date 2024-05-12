package project.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import project.spring.entities.Article;


@Repository
public interface ArticleRepository extends CrudRepository <Article,Integer> {

}
