//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Personaje personaje01=new Personaje("Default",1000,150);
        Personaje personaje02= new Guerrero("Guerro",1200,120,80);
        Personaje personaje03=new Mago("Mago",800,70,300);

        System.out.println(personaje01);
        System.out.println(personaje02);

        while(personaje01.getPuntosDeVida()>0 && personaje02.getPuntosDeVida()>0){
            if(personaje01.getPuntosDeVida()>0){
                personaje01.atacar(personaje02);
                System.out.println(personaje02);

            }
            if(personaje02.getPuntosDeVida()>0){
                personaje02.atacar(personaje01);
                System.out.println(personaje01);

            }
        }
    }
}