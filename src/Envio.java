public class Envio {
    private String numeroGuia;
    private Cliente cliente;
    private Paquete paquete;
    private String nombreDestinatario;
    private int celularDestinatario;
    private String estadoEnvio;
    private String horaEntrega;
    private int valorEnvio;
    private Direccion direccion;

    public Envio(String numeroGuia, Cliente cliente, Paquete paquete, String nombreDestinatario, int celularDestinatario, String estadoEnvio, String horaEntrega, int valorEnvio, Direccion direccion) {
        this.numeroGuia = numeroGuia;
        this.cliente = cliente;
        this.paquete = paquete;
        this.nombreDestinatario = nombreDestinatario;
        this.celularDestinatario = celularDestinatario;
        this.estadoEnvio = estadoEnvio;
        this.horaEntrega = horaEntrega;
        this.valorEnvio = valorEnvio;
        this.direccion = direccion;
    }
}
