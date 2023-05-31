package Entities;

import Itens.Potion;
import Itens.Weapon;

import java.util.ArrayList;

public class Knight extends Hero {
    /**
     * Construct of the Knight Hero
     * @param n - name of the Knight Hero object
     * @param v - health of the Knight Hero
     * @param f - strenght of the Knight Hero
     * @param level - level of the Knight Hero
     * @param gold - coints belonging to the Knight Hero
     */
    public Knight(String n, int v, int f, int level, int gold) {
        super(n, v, f, level, gold);
    }
    public Knight(){}

    /**
     *
     * @param - method describing a battle between a Knight Hero and an Enemy passed as argument, both subclasses of the Entity class
     * @return - the winner Entity of the current battle
     */
    @Override
    public Entity atacar(NPC enemy) {
        int vidaHeroi = this.getHp();
        int vidaInimigo = enemy.getHp();
        int round = 1;
        do {
            vidaHeroi -= enemy.getForca() * 0.2;
            System.out.println("Round " + round + "\nHero HP: " + vidaHeroi);

            if (vidaHeroi > 0) {
                vidaInimigo -= this.getForca() + this.getArma().getDano();
                System.out.println("Enbemy HP: " + vidaInimigo);
            } else {
                break;
            }
            round += 1;
        } while (vidaInimigo > 0);

        if (vidaHeroi <= 0) {
            System.out.println("GAME OVER\n The Hero " + this.getNome() + " doesn't have HP left !");
            return enemy;
        } else {
            System.out.println("\n Congratulations\n --- ENEMY DOWN! ---");
            System.out.println("Hero level: " + this.getNivel());
            this.setNivel(this.getNivel() + 1);
            System.out.println("New Hero level: " + this.getNivel());
            System.out.println("Hero life: " + this.getHp());
            this.setHp(this.getHp() + 10);
            System.out.println("New Hero HP: " + this.getHp());
            System.out.println("Hero strenght: " + this.getForca());
            this.setForca(this.getForca() + 1);
            System.out.println("New Hero strenght: " + this.getForca());
            System.out.println("Hero gold: " + this.getOuro());
            this.setOuro(this.getOuro() + 10);
            System.out.println("New Hero gold: " + this.getOuro());
            return this;
        }
    }
}