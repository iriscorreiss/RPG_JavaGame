package Itens;

import java.util.ArrayList;

/**
 * Construct of the abstract class Iten Hero
 */
public abstract class ItenHero {
    private String nome;
    private int preco;
    private ArrayList<HeroType> HeroType;

    public ItenHero(String name, int price, ArrayList<HeroType> tipos){
        this.nome=name;
        this.preco=price;
        this.HeroType =tipos;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public ArrayList<HeroType> getTipoHeroi() {
        return HeroType;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void setTipoHeroi(ArrayList<HeroType> HeroType) {
        this.HeroType = HeroType;
    }

    abstract void mostrarDetalhes ();
}
