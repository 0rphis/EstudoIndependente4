import uteis.Article;
import uteis.Book;
import uteis.Publication;
import java.util.ArrayList;

public class ACademicLibrary implements ILibrary {
    private ArrayList<Publication> publications;

    public ACademicLibrary() {
        this.publications = new ArrayList<>();
    }

    @Override
    public void addPublication(Publication p) {
        publications.add(p);
    }

    @Override
    public boolean removePublication(long id) {
        return publications.removeIf(pub -> pub.getId() == id);
    }

    @Override
    public ArrayList<Publication> getAllPublications() {
        return new ArrayList<>(publications);
    }

    @Override
    public short countPublications() {
        return (short) publications.size();
    }

    @Override
    public Publication findPublication(String title) {
        for (Publication pub : publications) {
            if (pub.getTitle().equalsIgnoreCase(title)) {
                return pub;
            }
        }
        return null;
    }

    @Override
    public boolean hasPublication(String title) {
        return findPublication(title) != null;
    }

    // Métodos extras opcionais (não exigidos pela interface)
    public Article findArticle(String title) {
        for (Publication pub : publications) {
            if (pub instanceof Article && pub.getTitle().equalsIgnoreCase(title)) {
                return (Article) pub;
            }
        }
        return null;
    }

    // procurar livro por ISBN

    public Book findBook(String title) {
        for (Publication pub : publications) {
            if (pub instanceof Book && pub.getTitle().equalsIgnoreCase(title)) {
                return (Book) pub;
            }
        }
        return null;
    }

    // procurar livro por ISBN

    public Book findBook(long isbn) {
        for (Publication pub : publications) {
            if (pub instanceof Book) {
                Book b = (Book) pub;
                if (b.getIsbn() == isbn)
                    return b;
            }
        }
        return null;
    }
}
