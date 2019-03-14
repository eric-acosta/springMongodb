package eric.acosta.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import eric.acosta.demo.model.Persona;
import eric.acosta.demo.query.PersonRepository;

@RestController
//@RequestMapping("/personas") (RequestMapping valido en estos casos)
public class PersonaController {
	
	@Autowired
	private PersonRepository repository;
	
	
	@GetMapping
	//@RequestMapping(value = "/", method = RequestMethod.GET) esto sustituye a lo anterior(ya no se usa RequestMapping)
	public List<Persona> saludar() {
		
		List<Persona> listaPersonas= new ArrayList<>();
		Persona per1 = new Persona();
		Persona per2 = new Persona();
	//	listaPersonas.add(per1);
		//listaPersonas.add(per2);
		
		for (Persona persona : repository.findAll()) {
			listaPersonas.add(persona);
		}
		System.out.println();
		return listaPersonas;
	}

}
