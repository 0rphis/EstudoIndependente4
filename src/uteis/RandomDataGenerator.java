package uteis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDataGenerator extends UtilsDados {

    // lista de sorteio para ver qual idioma o livro vai ter

    private static final List<String> idiomas = Arrays.asList("Português", "Inglês", "Espanhol", "Francês");
    private static final List<String> paises = Arrays.asList("Brasil", "EUA", "Canadá", "Alemanha", "Japão");

    // gerar um autor aleatorio

    public static Author randomAuthor() {
        String nome = UtilsDados.gerarNomeAleatorio();
        String email = nome.toLowerCase().replace(" ", ".") + "@example.com";
        String afiliacao = "Universidade " + randomFrom(Arrays.asList("Federal", "Estadual", "Privada"));
        boolean correspondente = ThreadLocalRandom.current().nextBoolean();
        return new Author(afiliacao, correspondente, nome, email);
    }
    // #endregion

    // #region gerar um usuario aleatorio

    public static User randomUser() {
        String nome = UtilsDados.gerarNomeAleatorio();
        String email = nome.toLowerCase().replace(" ", ".") + "@example.com";
        String telefone = "+55 11 9" + (1000 + ThreadLocalRandom.current().nextInt(9000)) + "-"
                + (1000 + ThreadLocalRandom.current().nextInt(9000));
        String login = nome.split(" ")[0].toLowerCase();
        int senha = 1000 + ThreadLocalRandom.current().nextInt(9000);
        return new User(telefone, login, senha, nome, email);
    }
    // #endregion

    // #region gerar um livro aleatorio

    public static Book randomBook() {
        return new Book(
                randomFrom(idiomas),
                9780000000000L + ThreadLocalRandom.current().nextInt(9999999),
                (short) (100 + ThreadLocalRandom.current().nextInt(400)),
                randomFrom(UtilsDados.getTitulos()),
                (short) (2010 + ThreadLocalRandom.current().nextInt(16)),
                (byte) (1 + ThreadLocalRandom.current().nextInt(5)),
                ThreadLocalRandom.current().nextLong(1000));
    }
    // #endregion

    // #region gerar um artigo aleatorio

    public static Article randomArticle() {
        ArrayList<String> palavras = new ArrayList<>();
        palavras.add(randomFrom(Arrays.asList("Java", "OOP", "IA", "Redes", "Dados", "Computação")));
        palavras.add(randomFrom(Arrays.asList("Algoritmos", "Programação", "Machine Learning", "Software")));

        // garantir que as palavras-chave sejam únicas
        return new Article(
                palavras,
                10000000L + ThreadLocalRandom.current().nextInt(9999999),
                (byte) (1 + ThreadLocalRandom.current().nextInt(10)),
                (short) (1 + ThreadLocalRandom.current().nextInt(100)),
                (short) (100 + ThreadLocalRandom.current().nextInt(300)),
                randomFrom(UtilsDados.getTitulos()),
                (short) (2010 + ThreadLocalRandom.current().nextInt(16)),
                (byte) (1 + ThreadLocalRandom.current().nextInt(10)),
                ThreadLocalRandom.current().nextLong(10000));
    }
    // #endregion

    // gerar uma editora aleatoria

    public static Publisher randomPublisher() {
        return new Publisher(
                "Editora " + randomFrom(Arrays.asList("Atlas", "Moderna", "Científica", "Lumen", "Pearson")),
                randomFrom(paises));
    }

    // gerar uma revista aleatoria

    public static Journal randomJournal() {
        return new Journal("Revista " + randomFrom(Arrays.asList("Computação", "Tecnologia", "Engenharia", "Ciência")),
                (byte) (1 + ThreadLocalRandom.current().nextInt(10)));
    }

    // --- Utilitário interno ---
    private static <T> T randomFrom(List<T> list) {
        return list.get(ThreadLocalRandom.current().nextInt(list.size()));
    }
}
