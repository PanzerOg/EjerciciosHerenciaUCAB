import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static List<Vehiculo> listaVehiculos;
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        listaVehiculos=new ArrayList<>();
        String opcion=null;
        do {
            System.out.println("Que desea registrar: (M)oto o (A)utomovil?");

            try {
                opcion = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (opcion.equals("A")) {
                listaVehiculos.add(datosAutomovil());
            }
            if(opcion.equals("M")){
                listaVehiculos.add(datosMotocicleta());
            }
        } while(opcion.equals("M")||opcion.equals(("A")));

        for(Vehiculo vehiculo: listaVehiculos){
            if(vehiculo instanceof Automovil){
                ((Automovil) vehiculo).mostraDetalles();
            }
            if(vehiculo instanceof Motocicleta){
                ((Motocicleta)vehiculo).mostraDetalles();
            }
        }
    }

    public static Automovil datosAutomovil(){
        System.out.println("Indoduzca los datos del Automovil");
        Automovil automovil=null;
        String marca=null;
        String modelo=null;
        int anodefabricacion=0;
        int cantidadDePuertas=0;
        try {
            System.out.print("Marca = ");
            marca = reader.readLine();
            System.out.print("Modelo = ");
            modelo = reader.readLine();
            System.out.print("A#o = ");
            anodefabricacion = Integer.parseInt(reader.readLine());
            System.out.print("Nro Puertas = ");
            cantidadDePuertas=Integer.parseInt(reader.readLine());
            return new Automovil(marca, modelo, anodefabricacion,cantidadDePuertas);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Motocicleta datosMotocicleta(){
        System.out.println("Indoduzca los datos de la Motocicleta");
        Motocicleta motocicleta=null;
        String marca=null;
        String modelo=null;
        int anodefabricacion=0;
        String tipo=null;
        TipoMoto tipoMoto;
        try {
            System.out.print("Marca = ");
            marca = reader.readLine();
            System.out.print("Modelo = ");
            modelo = reader.readLine();
            System.out.print("A#o = ");
            anodefabricacion = Integer.parseInt(reader.readLine());
            System.out.print("Tipo (Deportivo/Crucero) = ");
            tipo=reader.readLine();
            if(tipo.equals("Deportivo")){
                tipoMoto=TipoMoto.DEPORTIVO;
            }
            else {
                tipoMoto=TipoMoto.CRUCERO;
            }
            return new Motocicleta(marca, modelo, anodefabricacion,tipoMoto);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}