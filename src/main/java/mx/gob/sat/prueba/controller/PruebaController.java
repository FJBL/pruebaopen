package mx.gob.sat.prueba.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import mx.gob.sat.prueba.model.Contact;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("contact")
public class PruebaController {
	

		
	@GetMapping
	public Contact getById() {
		Contact contacto=new Contact();
		contacto.setId(1L);
		contacto.setFirstName("Joel");
		contacto.setLastName("Molina");
		contacto.setPhoneNumber("9541152233");
		contacto.setEmail("jhs_lo98q@gmail.com");
		return contacto;
    }

}
