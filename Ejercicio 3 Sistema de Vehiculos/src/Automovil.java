public class Automovil extends Vehiculo{
    private int cantidadDePuertas;

    public Automovil(String marca, String modelo, int anodefabricacion, int cantidadDePuertas) {
        super(marca, modelo, anodefabricacion);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    public int getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    public void setCantidadDePuertas(int cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }

    @Override
    public void mostraDetalles() {
        super.mostraDetalles();
        System.out.println("La cantida de puertas es:"+getCantidadDePuertas());
    }
}
