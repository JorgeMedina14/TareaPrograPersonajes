public class FabricaEnemigoNormal extends FabricaEnemigos{

    @Override
    public Enemigo crearEnemigo(String nombre, int salud) {
        return new EnemigoNormal(nombre, salud);
    }
}
