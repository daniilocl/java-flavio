public class Personagem {

    private String nome;
    protected int vida;
    private int ataque;

    public Personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void atacar(Personagem inimigo) {
        System.out.println(nome + " fez um ataque básico em" + inimigo.nome);
        inimigo.vida -= ataque;
    }

    public void mostrarStatus() {
        System.out.println(nome + " | Vida: " + vida);
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public String getNome() {
        return nome;
    }
}