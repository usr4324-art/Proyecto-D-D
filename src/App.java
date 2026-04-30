import net.salesianoscuesta.Personaje.Personaje;
import net.salesianoscuesta.Personajes.*;

public class App {
    public static void main(String[] args) throws Exception {
        Personaje guerrero = new Guerrero(100, 20, 10, 5, 50, 30);
        Personaje mago = new Mago(80, 15, 5, 7, 100, 40);

<<<<<<< HEAD
        System.out.println("Hola, soy un guerrero con vida: " + ((Guerrero) guerrero).getVida() + " y furia: " + ((Guerrero) guerrero).getFuria());
        System.out.println("Hola, soy un mago con vida: " + ((Mago) mago).getMana() + " y poder mágico: " + ((Mago) mago).getPoderMagico());
=======
        System.out.println("Hola, soy un guerrero con armadura: " + ((Guerrero) guerrero).getArmadura() + " y furia: " + ((Guerrero) guerrero).getFuria());
        System.out.println("Hola, soy un mago con mana: " + ((Mago) mago).getMana() + " y poder mágico: " + ((Mago) mago).getPoderMagico());
>>>>>>> app
    }
}
