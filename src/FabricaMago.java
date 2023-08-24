public class FabricaMago extends FabricaPersonajes{

    @Override
    public Personaje crearPersonaje(String nombre, int salud) {
        return new Jugador(nombre, salud);
    }
}
