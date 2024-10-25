public class Vehiculo {
    private String marca;
    private String modelo;
    private int anodefabricacion;

    public Vehiculo(String marca, String modelo, int anodefabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anodefabricacion = anodefabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnodefabricacion() {
        return anodefabricacion;
    }

    public void setAnodefabricacion(int anodefabricacion) {
        this.anodefabricacion = anodefabricacion;
    }

    public void mostraDetalles(){
        System.out.println("Marca:"+getMarca());
        System.out.println("Modelo:"+getModelo());
        System.out.println("Año de fabricacion:"+getAnodefabricacion());
    }
}
