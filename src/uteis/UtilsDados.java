package uteis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class UtilsDados {

    // lista de sorteio para ver qual nome a pessoa vai ter

    private static final List<String> nomes = Arrays.asList(
            "Maria", "João", "Ana", "Pedro", "Francisca", "Antônio", "Paula", "Carlos", "Juliana", "Rafael",
            "Amanda", "Luiz", "Letícia", "Marcos", "Patrícia", "José", "Beatriz", "Gabriel", "Bruna", "Gustavo",
            "Larissa", "Rodrigo", "Mariana", "Felipe", "Sofia", "Lucas", "Clara", "Daniel", "Camila", "Mateus",
            "Isabella", "Leonardo", "Manuela", "André", "Laura", "Thiago", "Alice", "Alexandre", "Giovanna", "Bruno",
            "Helena", "Eduardo", "Carolina", "Diego", "Valentina", "Ricardo", "Lívia", "Fernando", "Yasmin", "Marcelo",
            "Nicole", "Paulo", "Emanuelly", "Roberto", "Cecília", "Rogério", "Vitória", "Sérgio", "Lorena", "Henrique",
            "Rebeca", "William", "Alícia", "Otávio", "Elisa", "Vicente", "Marina", "Caio", "Maitê", "Renan",
            "Stella", "Augusto", "Gabriela", "Vitor", "Benício", "Davi", "Bento", "Arthur", "Miguel", "Bernardo",
            "Samuel", "Enzo", "Noah", "Heitor", "Théo", "Lorenzo", "Benjamin", "Nicolas", "João Miguel", "Pietro",
            "Isadora", "Heloísa", "Ayla", "Lara", "Esther", "Chloe", "Aurora", "Melina", "Eva", "Raquel");

    // lista de sorteio para ver qual sobrenome a pessoa vai ter

    public static final List<String> sobrenome = List.of(
            "Silva", "Santos", "Oliveira", "Souza", "Pereira", "Costa", "Carvalho", "Almeida", "Ferreira", "Rodrigues",
            "Gomes", "Martins", "Rocha", "Ribeiro", "Alves", "Monteiro", "Mendes", "Nunes", "Lopes", "Lima",
            "Araújo", "Barbosa", "Dias", "Fernandes", "Guedes", "Machado", "Freitas", "Pinto", "Moura", "Vieira",
            "Fonseca", "Nascimento", "Barros", "Vasconcelos", "Leal", "Moreira", "Pires", "Cunha", "Brito", "Rezende",
            "Pacheco", "Gonçalves", "Borges", "Campos", "Cardoso", "Correia", "Duarte", "Figueiredo", "Melo", "Miranda",
            "Neves", "Teixeira", "Viana", "Siqueira", "Magalhães", "Zanetti", "Guimarães", "Azevedo", "Ramos",
            "Santana",
            "Tavares", "Godoy", "Bueno", "Diniz", "Coelho", "Couto", "Garcia", "Cruz", "Batista", "Queiroz",
            "Morais", "Abreu", "Passos", "Rosa", "Porto", "Paiva", "Rangel", "Reis", "Aguiar", "Sales",
            "Mesquita", "Bandeira", "Caldas", "Cavalcanti", "Marques", "Guerra", "Assis", "Bastos", "Sá", "Serra",
            "Peixoto", "Castro", "Franco", "Telles", "Jardim", "Penteado", "Lacerda", "Brandão", "Andrade", "Vasques");

    // lista de sorteio para ver qual titulo o livro vai ter

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

    // lista de sorteio para ver qual idioma o livro vai ter

    public static List<String> getTitulos() {
        return titulos;
    }

    private static final List<String> idiomas = Arrays.asList("Português", "Inglês", "Espanhol", "Francês");

    // lista para sber de qual pais vai ser
    private static final List<String> paises = Arrays.asList("Brasil", "EUA", "Canadá", "Alemanha", "Japão");

    private static final Set<String> nomesGerados = new HashSet<>();

    public static String gerarNomeAleatorio() {

        String resultado;

        do {
            String nome = nomes.get(ThreadLocalRandom.current().nextInt(nomes.size()));

            int qtdSobrenomes = ThreadLocalRandom.current().nextInt(1, 3); // 1 ou 2

            StringBuilder sb = new StringBuilder(nome);

            for (int i = 0; i < qtdSobrenomes; i++) {
                sb.append(" ").append(sobrenome.get(ThreadLocalRandom.current().nextInt(sobrenome.size())));
            }
            resultado = sb.toString();

        } while (nomesGerados.contains(resultado));

        nomesGerados.add(resultado);

        return resultado;

    }

}
