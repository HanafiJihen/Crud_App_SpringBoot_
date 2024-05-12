package project.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import project.spring.entities.User;

@Repository
public interface UserRepository extends CrudRepository <User,Long> {

}
