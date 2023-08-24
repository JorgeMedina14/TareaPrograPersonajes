public class Jugador implements Personaje{
    private String nombre;
    private int salud;

    public Jugador(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " Ataca a un enemigo");
    }

    @Override
    public void recibirdano(int cantidad) {
        salud -= cantidad;
        System.out.println(nombre + " Recibe" + cantidad + " de dano.");
    }

}
