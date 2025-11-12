import uteis.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> livros = new ArrayList<>();

        // gerar 10 livros aleatórios
        for (int i = 0; i < 10; i++) {
            livros.add(RandomDataGenerator.randomBook());
        }

        // Linha superior
        System.out.println("╔" + "═".repeat(111) + "╗");

        // Cabeçalho com divisórias verticais
        System.out.printf("║ %-4s │ %-40s │ %-10s │ %-15s │ %-6s │ %-8s │ %-8s ║\n",
                "ID", "Título", "Idioma", "ISBN", "Ano", "Volume", "Páginas");

        // Linha divisória entre cabeçalho e dados
        System.out.println("╟" + "─".repeat(111) + "╢");

        // Corpo da tabela com divisórias em todas as colunas

        // imprimir detalhes dos livros
        for (Book livro : livros) {
            System.out.printf("║ %-4d │ %-40s │ %-10s │ %-15d │ %-6d │ %-8d │ %-8d ║\n",
                    livro.getId(),
                    livro.getTitle(),
                    livro.getLanguage(),
                    livro.getIsbn(),
                    livro.getYear(),
                    livro.getVolume(),
                    livro.getPages());
        }
        System.out.println("╚" + "═".repeat(111) + "╝");
    }
}