public class Main {
    public static void main(String[] args) {
        Cliente clienteSofia = new Cliente(12345,"Sofía","Millán Millán",322221,"sofia@gmail.com","Cll 36 #59-10","Medellín");

        Paquete paqueteUno = new Paquete("LIVIANO",1.3,30000);

        Direccion direccion = new Direccion("Medellín","Bogotá","Cra 72 #20-10");

        Envio envio = new Envio("123WH",clienteSofia,paqueteUno,"Carmen",234234,"RECIBIDO","18:30",50000,direccion);

        Empleado empleadoRicky = new Empleado(12345,"Ricky","Torres Martínez",322441,"ricky@gmail.com","Cll 16 #25-12","Armenia",3,"A+","CONDUCTOR");
    }
}