public class EmpleadoMedioTiempo extends Empleado{
    private int diaTrabajados;

    public EmpleadoMedioTiempo(int diaTrabajados) {
        this.diaTrabajados = diaTrabajados;
    }

    public EmpleadoMedioTiempo(String nombre, int edad, float salario, int diaTrabajados) {
        super(nombre, edad, salario);
        this.diaTrabajados = diaTrabajados;
    }

    public int getDiaTrabajados() {
        return diaTrabajados;
    }

    public void setDiaTrabajados(int diaTrabajados) {
        this.diaTrabajados = diaTrabajados;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Dias Trabajados:"+getDiaTrabajados());
    }
}
