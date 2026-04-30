package net.salesianoscuesta.Personajes;
import net.salesianoscuesta.Personaje.Personaje;

public class Guerrero extends Personaje {
   private int furia;
   private int armadura;

    public Guerrero(int vida, int ataque, int defensa, int velocidad, int furia, int armadura) {
        super(vida, ataque, defensa, velocidad);
        this.furia = furia;
        this.armadura = armadura;
    }

    public int getFuria() {
        return furia;
    }

    public int getArmadura() {
        return armadura;
    }
}
