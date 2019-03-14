package eric.acosta.demo.model;
import org.springframework.data.annotation.Id;

public class Persona {
	@Id
	public String id;
	private String nombre;
	private String lastName;
	public Persona() {}
	public Persona(String nombre, String lastName) {
		this.nombre=nombre;
		this.lastName=lastName;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
    public String toString() {
        return String.format(
                "Persona[id=%s, nombre='%s', lastName='%s']",
                id, nombre, lastName);
    }

}
