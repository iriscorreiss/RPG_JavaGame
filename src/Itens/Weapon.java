package Itens;

import java.util.ArrayList;

/**
 *  Construct of the object weapon, subclass of the ItenHero class
 */
public class Weapon extends ItenHero {
    private int dano;

    public Weapon(String name, int price, ArrayList<HeroType> tipos, int damage) {
        super(name, price, tipos);
        this.dano=damage;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    /**
     * Method that show the details of the Weapon object
     */
    @Override
    public void mostrarDetalhes() {

        System.out.println("Weapon Details");
        System.out.println("Name: "+getNome());
        System.out.println("Price: "+getPreco());
        for (HeroType t : getTipoHeroi()) {
            System.out.println("All "+t+"s Heroes can use this iten.");
        }
        System.out.println("Damage: "+this.dano);
    }


}
