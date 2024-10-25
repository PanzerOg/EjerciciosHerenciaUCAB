public class Mago extends Personaje{
    private int mana;

    public Mago(int mana) {
        this.mana = mana;
    }

    public Mago(String nombre, int vida, int ataque, int defensa, int mana) {
        super(nombre, vida, ataque, defensa);
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
        personaje.setVida(personaje.getVida() - damage);
        this.mana=this.mana-damage;
    }
}
