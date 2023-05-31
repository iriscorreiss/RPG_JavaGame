package Itens;

import java.util.ArrayList;

/**
 * Construct of the object potion, subclass of the ItenHero class
 */
public class Potion extends ItenHero {
    private int heal;

    public Potion(String name, int price, ArrayList<HeroType> tipos, int heal) {
        super(name, price, tipos);
        this.heal=heal;
    }

    /**
     * Method that show the details of each Potion object
     */
    @Override
    public void mostrarDetalhes() {
        System.out.println("Potion Details");
        System.out.println("Name: "+getNome());
        System.out.println("Price: "+getPreco()+" hp");
        for (HeroType t : getTipoHeroi()) {
            System.out.println("All "+t.getClass().getSimpleName()+"s Heroes can use this iten.");
        }
        System.out.println("Can cure "+this.heal+" HP.");
    }

    public int getVidaCurar() {
        return heal;
    }

    public void setVidaCurar(int vidaCurar) {
        this.heal = vidaCurar;
    }
}
