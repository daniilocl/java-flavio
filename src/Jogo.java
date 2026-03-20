public class Jogo {

    public static void main(String[] args) {

        Guerreiro guerreiro = new Guerreiro("Thor");
        Mago mago = new Mago("Merlin");

        System.out.println("⚔️ BATALHA INICIADA ⚔️");

        while (guerreiro.estaVivo() && mago.estaVivo()) {

            guerreiro.atacar(mago);
            mago.mostrarStatus();

            if (!mago.estaVivo()) break;

            mago.atacar(guerreiro);
            guerreiro.mostrarStatus();

            System.out.println("----------------------");
        }

        System.out.println("🏆 FIM DE JOGO!");
    }
}