package Entities;

/**
 * Construct of the abstract class Entity
 */
public abstract class Entity {
    private String nome;
    private int hp;
    private int forca;

    public Entity(String n, int v, int f){
        this.nome=n;
        this.hp=v;
        this.forca=f;
    }
    public Entity(){
    }
    public String getNome() {
        return nome;
    }

    public int getHp() {
        return hp;
    }

    public int getForca() {
        return forca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
    abstract void mostrarDetalhes ();
}
