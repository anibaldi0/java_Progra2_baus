
package posnet;

public class Persona {
    
    private String nombre;
    private String apellido;
    private String DNI;
    private String telefono;
    private String email;
    
    public Persona(String nombre, String apellido, String DNI, String telefono, String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.telefono = telefono;
        this.email = email;
    }
    
    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }
    
}
