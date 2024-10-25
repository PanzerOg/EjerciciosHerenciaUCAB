//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Personaje personaje01 = new Personaje("P1", 1000, 50, 20);
       Personaje personaje02 = new Personaje("P2", 500, 140, 10);
       Personaje personaje03 = new Personaje("P3", 100, 100, 200);
       Personaje personaje04 = new Guerrero("P4",500,200,130);
       Personaje personaje05 = new Mago("P5",150,50,70,200);

       System.out.println(personaje01);
       System.out.println(personaje02);
       System.out.println(personaje03);
       System.out.println(personaje04);
       System.out.println(personaje05);

       personaje01.atacar(personaje02);
       personaje01.atacar(personaje03);
       personaje01.atacar(personaje04);
       personaje01.atacar(personaje05);

       personaje02.atacar(personaje01);
       personaje02.atacar(personaje03);
       personaje02.atacar(personaje05);
       personaje02.atacar(personaje04);

       personaje03.atacar(personaje01);
       personaje03.atacar(personaje02);
       personaje03.atacar(personaje04);
       personaje03.atacar(personaje05);

       personaje04.atacar(personaje01);
       personaje04.atacar(personaje02);
       personaje04.atacar(personaje03);
       personaje04.atacar(personaje05);

       personaje05.atacar(personaje01);
       personaje05.atacar(personaje02);
       personaje05.atacar(personaje04);
       personaje05.atacar(personaje03);

       System.out.println(personaje01);
       System.out.println(personaje02);
       System.out.println(personaje03);
       System.out.println(personaje04);
       System.out.println(personaje05);
    }
}