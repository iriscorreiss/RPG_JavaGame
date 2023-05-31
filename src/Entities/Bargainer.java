package Entities;

import Itens.HeroType;
import Itens.ItenHero;
import Itens.Potion;
import Itens.Weapon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * builder of a comerciant
 */
public class Bargainer {
    Scanner input = new Scanner(System.in);
    private ArrayList<ItenHero> itens;

    public Bargainer(ArrayList<ItenHero> iHeroi){
        this.itens=iHeroi;
    }

    /**
     * method that prints the inventory of a given merchantm
     */
    public void imprimirIventario(){
        System.out.println("Bargainer's Inventory");
        for (ItenHero i : this.itens) {
            System.out.println((this.itens.indexOf(i)+1)+" - Name: "+i.getNome()+" | Price: "+i.getPreco());
            System.out.print("Hero Type: ");
            for (HeroType hType : i.getTipoHeroi()){
                System.out.print(hType+" / ");
            }
            System.out.println("\n-------------------");
        }
    }

    /**
     *
     * @param h - given a Hero this method allows to buy an iten from the inventory of the current merchant by transferring the same from the seller's purse to the hero's purse in exchange fron some gikd
     */
    public void vender(Hero h){
        String type = h.getClass().getSimpleName().toUpperCase();
        boolean sameType = false;
        int op = 0;
            imprimirIventario();
            System.out.println("Your hero have "+h.getOuro()+" coins to spend!");
            if (h.getOuro()==0){
                System.out.println("Your hero doesn't have money so you can't by any iten!");
            }else{
                System.out.println("0 - To leave\nEnter the option of the item you want to purchase?");
                op = input.nextInt();

                if (op>0 && op<this.itens.size()+1){
                    for (ItenHero i : this.itens) {

                        if((op-1) == this.itens.indexOf(i)){
                            for (HeroType tipo : i.getTipoHeroi()){
                                String t = String.valueOf(tipo);
                                if (type.equals(t)){
                                    if(i.getClass().getSimpleName().equals("Weapon")){
                                        if (h.getOuro()>=i.getPreco()){
                                            System.out.println("Weapon Purchuased! \nWeapon name: "+i.getNome()+" || Weapon price: "+i.getPreco());
                                            h.setArma((Weapon) i);
                                            int ouro = h.getOuro();
                                            ouro -= i.getPreco();
                                            h.setOuro(ouro);
                                        }else {
                                            System.out.println("NO MONEY! You cannot buy this weapon!");
                                        }
                                    }else {
                                        if (h.getOuro()>=i.getPreco()){
                                            System.out.println("Potion Purchuased!\n"+i.getNome()+" - "+i.getPreco());
                                            h.addPocao((Potion) i);
                                            int ouro = h.getOuro();
                                            ouro -= i.getPreco();
                                            h.setOuro(ouro);
                                        }else {
                                            System.out.println("NO MONEY! You cannot buy this potion!");
                                        }
                                    }
                                    sameType= true;
                                }
                            }
                        }
                    }
                    if (!sameType){
                        System.out.println("This iten doesn't belong to your hero type. You cannot buy this iten!");
                    }
                }else if (op == 0){

                }else {
                    System.out.println("Wrong option! There is no iten to sell for the tiped option");
                }
            }
    }
}