package eric.acosta.demo.model;
import org.springframework.data.annotation.Id;

public class Persona {
	@Id
	private int id;
	private String nombre;
	private String apellido;
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Persona() {}
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
