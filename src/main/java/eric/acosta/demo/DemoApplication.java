package eric.acosta.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import eric.acosta.demo.model.Persona;
import eric.acosta.demo.query.PersonRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	@Autowired
	private PersonRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("comienza ejecucion");
		//repository.deleteAll();
		System.out.println("comienza ejecucion");

		// save a couple of customers
		//repository.save(new Persona("Eric", "Acosta"));
		//repository.save(new Persona("Mar", "Altamirano"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Persona persona : repository.findAll()) {
			System.out.println(persona);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Eulogio'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByNombre("Eulogio"));

		System.out.println("Customers found with findByLastName('Altamirano'):");
		System.out.println("--------------------------------");
		for (Persona persona : repository.findByLastName("Altamirano")) {
			System.out.println(persona);
		}
		
	}

}
