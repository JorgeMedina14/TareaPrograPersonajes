public class EnemigoNormal implements Enemigo{

    private String nombre;
    private int salud;

    public EnemigoNormal(String nombre, int salud) {
        this.nombre= nombre;
        this.salud = salud;
    }

    @Override
    public void atacar() {
        System.out.println(nombre+ " Ataca al jugador");
    }

    @Override
    public void recibirdano(int cantidad) {
        salud -= cantidad;
        System.out.println(nombre+ " recibe" + cantidad + " de dano");
    }
}
