package mx.gob.sat.prueba.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import mx.gob.sat.prueba.model.About;
import mx.gob.sat.prueba.model.Contact;
import mx.gob.sat.prueba.repository.AboutRepository;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("contact")
public class PruebaController {
	
	@Autowired
	@Qualifier("jdbcTemplate")
	public JdbcTemplate jdbcTemplate;
	
	@PersistenceContext
	private  EntityManager entityManager;
	
	@GetMapping
	public List<Contact> getById() {
		Contact contacto=new Contact();
		contacto.setId(1L);
		contacto.setFirstName("Joel");
		contacto.setLastName("Molina");
		contacto.setPhoneNumber("9541152233");
		contacto.setEmail("jhs_lo98q@gmail.com");
		Contact contacto1=new Contact();
		contacto1.setId(2L);
		contacto1.setFirstName("Manuel");
		contacto1.setLastName("Gallardo");
		contacto1.setPhoneNumber("7741152233");
		contacto1.setEmail("asdjhs_lo98q@gmail.com");
		
		List<Contact> listCon=new ArrayList<>();
		listCon.add(contacto);
		listCon.add(contacto1);
		return listCon;
    }
	@Autowired
	AboutRepository  aboutRepository;
	
	@GetMapping("about")
	public List<About> getAbout() {
		List<About> listCon=new ArrayList<>();
		listCon=aboutRepository.findAll();
		return listCon;
    }

}
