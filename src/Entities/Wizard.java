package Entities;

public class Wizard extends Hero{
    /**
     * Construct of the Wizard Hero
     * @param nome - name of the Wizard Hero
     * @param vida - health of the Wizard Hero
     * @param forca - strenght of the Wizard Hero
     * @param level - level of the Wizard Hero
     * @param gold - coins of the Wizard Hero
     */
    public Wizard(String nome, int vida, int forca, int level, int gold) {
        super(nome, vida, forca, level, gold);
    }
    public Wizard(){}

    /**
     *
     * @param - method describing a battle between a Wizard Hero and an Enemy passed as argument, both subclasses of the Entity class
     * @return - the winner of the current battle
     */
    @Override
    public Entity atacar(NPC enemy) {
        int vidaHeroi = this.getHp();
        int vidaInimigo = enemy.getHp();
        int round = 1;
        do {
            vidaInimigo -= this.getForca() + this.getArma().getDano();
            System.out.println("Enbemy HP: " + vidaInimigo);

            if (vidaInimigo > 0) {
                vidaHeroi -= enemy.getForca() * 0.2;
                System.out.println("Round " + round + "\nHero HP: " + vidaHeroi);
            } else {
                break;
            }
            round += 1;
        } while (vidaHeroi > 0);

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
