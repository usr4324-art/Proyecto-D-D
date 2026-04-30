package net.salesianoscuesta.Personajes;
import net.salesianoscuesta.Personaje.Personaje;

public class Mago extends Personaje {
    private int mana;
    private int poderMagico;

    public Mago(int vida, int ataque, int defensa, int velocidad, int mana, int poderMagico) {
        super(vida, ataque, defensa, velocidad);
        this.mana = mana;
        this.poderMagico = poderMagico;
    }

    public int getMana() {
        return mana;
    }

    public int getPoderMagico() {
        return poderMagico;
    }
}
