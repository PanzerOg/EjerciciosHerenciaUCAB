public class Personaje {
    private String nombre;
    private int puntosDeVida;
    private int fuerza;


    public Personaje(String nombre, int puntosDeVida, int fuerza) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void atacar(Personaje personaje){
        //personaje.setPuntosDeVida(personaje.getPuntosDeVida()-this.fuerza);
        personaje.quitarVida(this.fuerza);
    }

    public void quitarVida(int damage){
        setPuntosDeVida(this.getPuntosDeVida()-damage);
    }

    @Override
    public String toString(){
        return "Personaje:(Nombre:" + nombre + ", Puntos de Vida:" + puntosDeVida + "Puntos de Fuerza:" + fuerza + ")";
    }


}
