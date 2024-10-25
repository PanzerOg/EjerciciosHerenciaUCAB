public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int puntosDeVida, int fuerza, int mana) {
        super(nombre, puntosDeVida, fuerza);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void lanzarHechizo(Personaje personaje) {
        int damage = getMana() / 2;
        personaje.setPuntosDeVida(personaje.getPuntosDeVida() - damage);
        this.mana=this.mana-damage;
    }
}
