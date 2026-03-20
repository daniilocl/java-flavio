public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome, 70, 20);
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(getNome() + " lançou uma bola de fogo 🔥");
        inimigo.vida -= 25;
    }
}

