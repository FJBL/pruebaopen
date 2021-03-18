package mx.gob.sat.prueba.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import mx.gob.sat.prueba.model.About;



public interface AboutRepository extends CrudRepository<About, Long> {

	List<About> findAll();

	
}
