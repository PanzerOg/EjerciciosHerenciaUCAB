public class Guerrero extends Personaje{
    private int defensa;

    public Guerrero(String nombre, int puntosDeVida, int fuerza,int defensa) {
        super(nombre, puntosDeVida, fuerza);
        this.defensa = defensa;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    @Override
    public void quitarVida(int damage){
        if(defensa<damage){
            this.setPuntosDeVida(this.getPuntosDeVida()-(damage-defensa));
        }
    }

}
