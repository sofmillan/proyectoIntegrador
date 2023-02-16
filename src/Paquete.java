public class Paquete {
    private int identificacion;
    private String tipoPaquete;
    private double peso;
    private int valorDeclarado;

    public Paquete( String tipoPaquete, double peso, int valorDeclarado) {
        this.identificacion =(int)(Math.random()*1000000000);
        this.tipoPaquete = tipoPaquete;
        this.peso = peso;
        this.valorDeclarado = valorDeclarado;
    }

    public int getIdentificacion() {
        return identificacion;
    }
}
