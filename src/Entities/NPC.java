package Entities;

import Itens.Weapon;
import Itens.Potion;
import java.util.ArrayList;

public class NPC extends Entity {
    private Weapon weapon;
    ArrayList<Potion> pocoes;

    /**
     * constructor of th enemy character
     * @param n - name od the enemy character
     * @param v - health of the enemy character
     * @param f - strenght of the enemy character
     * @param gun - weapon of the enemy character
     * @param potion - potions of the enemy character
     */
    public NPC(String n, int v, int f, Weapon gun, ArrayList<Potion> potion){
        super(n, v, f);
        this.weapon =gun;
        this.pocoes=potion;
    }

    /**
     * display the details of the enemy character
     */
    @Override
    public void mostrarDetalhes() {
        System.out.println("Enemy Details");
        System.out.println(this.getClass().getSimpleName()+" CLASS");
        System.out.println("Name: "+this.getNome());
        System.out.println("Health: "+this.getHp());
        System.out.println("Strenght: "+this.getForca());
        System.out.println("Weapon: "+this.weapon.getNome());
        if (pocoes!=null){
            for (Potion p:pocoes) {
                p.getNome();
            }
        }
    }

    public Weapon getArma() {
        return weapon;
    }
    public ArrayList<Potion> getPocoes() {
        return pocoes;
    }
    public void setArma(Weapon weapon) {
        this.weapon = weapon;
    }
    public void setPocoes(ArrayList<Potion> pocoes) {
        this.pocoes = pocoes;
    }
}
