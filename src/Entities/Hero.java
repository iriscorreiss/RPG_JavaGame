package Entities;

import Itens.HeroType;
import Itens.Weapon;
import Itens.Potion;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Hero object builder
 */
public abstract class Hero extends Entity {
    Scanner input = new Scanner(System.in);
    private int nivel;
    private int ouro;
    private Weapon weapon;
    ArrayList<Potion> pocoes;

    /**
     * Construct of the Hero class that extends the Entity class
     * @param n - name of the Hero
     * @param v - health of the Hero
     * @param f - strenght of the Hero
     * @param level - Level of the Hero
     * @param gold - coins of the Hero
     */
    public Hero(String n, int v, int f, int level, int gold){
        super( n, v, f);
        this.nivel=level;
        this.ouro=gold;
        ArrayList<HeroType> defaultWeapon= new ArrayList<>();
        ((ArrayList<HeroType>) defaultWeapon).add(HeroType.ARCHER);
        ((ArrayList<HeroType>) defaultWeapon).add(HeroType.KNIGHT);
        ((ArrayList<HeroType>) defaultWeapon).add(HeroType.WIZARD);
        this.weapon= new Weapon("default",0,defaultWeapon, 0);
        ArrayList<Potion> defaultPotion = new ArrayList<>();
        Potion defaultP = new Potion("default",0,defaultWeapon,0);
        defaultPotion.add(defaultP);
        this.pocoes= defaultPotion;
    }
    public Hero(){
    }

    /**
     * method that prints Hero details
     */
    @Override
    public void mostrarDetalhes() {
        System.out.println("-- Your Charater --");
        System.out.println("Hero Class: "+this.getClass().getSimpleName());
        System.out.println("Name: "+this.getNome());
        System.out.println("Life HP: "+this.getHp());
        System.out.println("Strenght: "+this.getForca());
        System.out.println("Hero Level: "+this.nivel);
        System.out.println("Gold: "+this.ouro);
        System.out.println("Weapon: "+this.weapon.getNome());
        System.out.print("Potions: ");
        for (Potion p:pocoes) {
            System.out.print(" "+p.getNome());
        }
    }

    /**
     * method that prints every Hero's Potion allowing to add life to the hero taking into account the healing of the selected potion
     */
    public void usarPocao(){
        if (this.pocoes==null){
            System.out.println("There are no potions in your bag!");
        }else {

            for (Potion p:this.pocoes) {
                System.out.println(this.pocoes.indexOf(p)+" - ");
                p.mostrarDetalhes();
            }
            if (this.pocoes.size()>1){
                System.out.println("Qual a Poção deseja utilizar?");
                int op = input.nextInt();
                for (Potion p:this.pocoes) {
                    if(op == this.pocoes.indexOf(p)){
                        int vida = this.getHp();
                        vida += p.getVidaCurar();
                        this.setHp(vida);
                        System.out.println("Your hero health is now: "+this.getHp());
                    }
                }
            }else {
                System.out.println("You don't have any potion that can heal you yet!");
            }
        }
    }

    /**
     *
     * @param - method describing a battle between a Hero and an Enemy passed as argument, both subclasses of the Entity class
     * @return - the winner of the current battle
     */
    public abstract Entity atacar (NPC enemy);

    public int getNivel() {
        return nivel;
    }

    public int getOuro() {
        return ouro;
    }

    public Weapon getArma() {
        return weapon;
    }

    public ArrayList<Potion> getPocoes() {
        return pocoes;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public void setArma(Weapon weapon) {
        this.weapon = weapon;
    }

    /**
     * method that allows to add a Potion object to an array of Potions
     * @param p
     */
    public void addPocao(Potion p){
        if (this.pocoes!=null){
            this.pocoes.add(p);
        }else {
            ArrayList<Potion> tempArray = new ArrayList<>();
            tempArray.add(p);
            this.pocoes = tempArray;
        }
    }
}
