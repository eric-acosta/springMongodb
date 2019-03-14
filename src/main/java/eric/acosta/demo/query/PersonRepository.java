package eric.acosta.demo.query;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import eric.acosta.demo.model.Persona;
public interface PersonRepository extends MongoRepository<Persona, String> {

    public Persona findByNombre(String nombre);
    public List<Persona> findByLastName(String apellido);

}
