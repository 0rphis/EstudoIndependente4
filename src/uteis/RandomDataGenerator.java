package uteis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDataGenerator {
    private static final Random random = new Random();

    // --- Listas fixas para sorteio ---
    private static final List<String> nomes = Arrays.asList(
            "Mateus Daniel", "Ana Souza", "Carlos Pereira", "Beatriz Lima",
            "Felipe Oliveira", "João Mendes", "Mariana Costa", "Rafael Rocha",
            "Laura Martins", "Thiago Nunes", "Camila Ribeiro", "Lucas Alves",
            "Bruna Ferreira", "Pedro Santos", "Isabela Torres", "André Carvalho",
            "Sofia Lima", "Vinícius Silva", "Clara Barbosa", "Eduardo Gomes",
            "Gabriela Duarte", "Ricardo Teixeira", "Julia Castro", "Paulo Ramos",
            "Amanda Lopes", "Luiza Correia", "Hugo Pinto", "Tatiane Dias",
            "Rodrigo Moura", "Natália Azevedo");

    private static final List<String> titulos = Arrays.asList(
            "Introdução à Computação",
            "Estruturas de Dados Avançadas",
            "Inteligência Artificial Aplicada",
            "Aprendizado de Máquina em Java",
            "Programação Funcional Moderna",
            "Algoritmos Genéticos e Evolutivos",
            "Computação Gráfica para Iniciantes",
            "Sistemas Distribuídos e Cloud",
            "Banco de Dados Relacional e NoSQL",
            "Engenharia de Software Moderna",
            "Computação Quântica Descomplicada",
            "Redes Neurais Profundas",
            "Visão Computacional com OpenCV",
            "Desenvolvimento Web com Spring",
            "Microserviços em Arquiteturas Escaláveis",
            "Segurança da Informação e Criptografia",
            "Big Data e Análise de Dados",
            "Compiladores e Linguagens Formais",
            "Programação Paralela e Concorrente",
            "Computação de Alto Desempenho",
            "Gestão de Projetos de Software",
            "Teste de Software e Qualidade",
            "Interação Humano-Computador",
            "Computação Móvel e IoT",
            "Robótica Educacional",
            "Arquitetura de Computadores",
            "Introdução à Lógica e Programação",
            "Ciência de Dados Aplicada",
            "Automação de Processos com Python",
            "Desenvolvimento de Jogos Digitais");

    private static final List<String> idiomas = Arrays.asList("Português", "Inglês", "Espanhol", "Francês");
    private static final List<String> paises = Arrays.asList("Brasil", "EUA", "Canadá", "Alemanha", "Japão");

    // --- Métodos de geração de dados ---
    public static Author randomAuthor() {
        String nome = randomFrom(nomes);
        String email = nome.toLowerCase().replace(" ", ".") + "@example.com";
        String afiliacao = "Universidade " + randomFrom(Arrays.asList("Federal", "Estadual", "Privada"));
        boolean correspondente = random.nextBoolean();
        return new Author(afiliacao, correspondente, nome, email);
    }

    public static User randomUser() {
        String nome = randomFrom(nomes);
        String email = nome.toLowerCase().replace(" ", ".") + "@example.com";
        String telefone = "+55 11 9" + (1000 + random.nextInt(9000)) + "-" + (1000 + random.nextInt(9000));
        String login = nome.split(" ")[0].toLowerCase();
        int senha = 1000 + random.nextInt(9000);
        return new User(telefone, login, senha, nome, email);
    }

    public static Book randomBook() {
        return new Book(
                randomFrom(idiomas),
                9780000000000L + random.nextInt(9999999),
                (short) (100 + random.nextInt(400)),
                randomFrom(titulos),
                (short) (2010 + random.nextInt(16)),
                (byte) (1 + random.nextInt(5)),
                random.nextLong(1000));
    }

    public static Article randomArticle() {
        ArrayList<String> palavras = new ArrayList<>();
        palavras.add(randomFrom(Arrays.asList("Java", "OOP", "IA", "Redes", "Dados", "Computação")));
        palavras.add(randomFrom(Arrays.asList("Algoritmos", "Programação", "Machine Learning", "Software")));

        return new Article(
                palavras,
                10000000L + random.nextInt(9999999),
                (byte) (1 + random.nextInt(10)),
                (short) (1 + random.nextInt(100)),
                (short) (100 + random.nextInt(300)),
                randomFrom(titulos),
                (short) (2010 + random.nextInt(16)),
                (byte) (1 + random.nextInt(10)),
                random.nextLong(10000));
    }

    public static Publisher randomPublisher() {
        return new Publisher(
                "Editora " + randomFrom(Arrays.asList("Atlas", "Moderna", "Científica", "Lumen", "Pearson")),
                randomFrom(paises));
    }

    public static Journal randomJournal() {
        return new Journal("Revista " + randomFrom(Arrays.asList("Computação", "Tecnologia", "Engenharia", "Ciência")),
                (byte) (1 + random.nextInt(10)));
    }

    // --- Utilitário interno ---
    private static <T> T randomFrom(List<T> list) {
        return list.get(random.nextInt(list.size()));
    }
}
