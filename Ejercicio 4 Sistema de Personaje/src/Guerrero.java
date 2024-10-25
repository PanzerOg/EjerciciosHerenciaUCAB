public class Guerrero extends Personaje{

    public Guerrero(String nombre, int vida, int ataque, int defensa) {
        super(nombre,vida, ataque, defensa);
    }

    @Override
    public void atacar(Personaje personaje){
        if(personaje.getDefensa()< this.getAtaque()){
            personaje.setVida((int) (personaje.getVida()-((1.2*this.getAtaque())-personaje.getDefensa())));
        }
    }
}
