package eric.acosta.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import eric.acosta.demo.model.Persona;

@RestController
@RequestMapping("/personas")
public class PersonaController {
	
	
	@GetMapping
	//@RequestMapping(value = "/", method = RequestMethod.GET)
	public Persona saludar() {
		
		Persona per = new Persona();
		per.setId(1);
		per.setNombre("Eric");
		return per;
	}

}
