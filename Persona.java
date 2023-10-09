public class Persona {
    private String nombre;
    private String correo;
    private String telefono;

    public Persona(String nombre, String correo, String telefono) {
        setNombre(nombre);
        setCorreo(correo);
        setTelefono(telefono);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
}
