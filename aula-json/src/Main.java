import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception{
        //é o caminho
        String caminho = "pessoa.json";
        //ler todo o conteúdo do arquivo
        String json = new String(Files.readAllBytes(Paths.get(caminho)));

        //Mostrar o json completo
        System.out.println("Conteúdo do JSON.");
        System.out.println(json);

        String nome = json.split("\"nome\": \"")[1].split("\"")[0];
        String idade = json.split("\"idade\": ")[1].split("}")[0];

        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);

    }
}



