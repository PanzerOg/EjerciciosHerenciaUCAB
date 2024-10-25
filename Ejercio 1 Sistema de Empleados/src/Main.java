//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado empleado1=new Empleado("Carlos",18,180.45f);
        empleado1.mostrarInformacion();
        Empleado empleado2=new EmpleadoTiempoCompleto("Juan",24,80.47f,8);
        empleado2.mostrarInformacion();
        Empleado empleado3=new EmpleadoMedioTiempo("Diego",50,500.67f,5);
        empleado3.mostrarInformacion();
    }
}