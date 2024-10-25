public class Motocicleta extends Vehiculo{
    private TipoMoto tipo;

    public Motocicleta(String marca, String modelo, int anodefabricacion, TipoMoto tipo) {
        super(marca, modelo, anodefabricacion);
        this.tipo = tipo;
    }

    public TipoMoto getTipo() {
        return tipo;
    }

    public void setTipo(TipoMoto tipo) {
        this.tipo = tipo;
    }

    @Override
    public void mostraDetalles() {
        super.mostraDetalles();
        System.out.println("El tipo de motocicleta es:"+getTipo());
    }
}
