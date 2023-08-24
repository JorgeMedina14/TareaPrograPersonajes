public class Main {
    public static void main(String[] args) {
        FabricaGuerrero fabricaGuerrero = new FabricaGuerrero();
        Personaje jugadorGuerrero = fabricaGuerrero.crearPersonaje("Guardian", 1000);
        jugadorGuerrero.atacar();
        jugadorGuerrero.recibirdano(500);

        FabricaEnemigos fabricaEnemigoNormal = new FabricaEnemigoNormal();
        Enemigo enemigoNormal = fabricaEnemigoNormal.crearEnemigo("Duende", 50);
        enemigoNormal.atacar();
        enemigoNormal.recibirdano(400);
    }
}