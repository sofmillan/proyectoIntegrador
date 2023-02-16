public class Usuario {

    private int cedula;
    private String nombre;
    private String apellidos;
    private int celular;
    private String correo;
    private String direccion;
    private String ciudad;

    public Usuario(int cedula, String nombre, String apellidos, int celular, String correo, String direccion, String ciudad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.celular = celular;
        this.correo = correo;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
}
