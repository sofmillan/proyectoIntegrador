public class Empleado extends Usuario {
    private int antiguedad;
    private String rh;
    private String tipoEmpleado;

    public Empleado(int cedula, String nombre, String apellidos, String celular, String correo, String direccion, String ciudad, int antiguedad, String rh, String tipoEmpleado) {
        super(cedula, nombre, apellidos, celular, correo, direccion, ciudad);
        this.antiguedad = antiguedad;
        this.rh = rh;
        this.tipoEmpleado = tipoEmpleado;
    }
}
