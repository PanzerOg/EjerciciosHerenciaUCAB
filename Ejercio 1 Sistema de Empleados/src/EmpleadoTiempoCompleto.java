public class EmpleadoTiempoCompleto extends Empleado{
    private int horasTrabajadas;

    public EmpleadoTiempoCompleto(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public EmpleadoTiempoCompleto(String nombre, int edad, float salario, int horasTrabajadas) {
        super(nombre, edad, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Horas Trabajadas:"+getHorasTrabajadas());
    }

}
