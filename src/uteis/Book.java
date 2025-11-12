package uteis;

public class Book extends Publication {
    private String language;
    private long isbn;
    private short pages;

    public Book(String language, long isbn, short pages, String title, short year, byte volume, long id) {
        super(title, year, volume, id);
        this.language = language;
        this.isbn = isbn;
        this.pages = pages;
    }

    public void Book(String language, long isbn, short pages, String title, short year, byte volume, long id) {
    }

    public String getLanguage() {
        return language;
    }

    public long getIsbn() {
        return isbn;
    }

    public short getPages() {
        return pages;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setPages(short pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book [language=" + language + ", isbn=" + isbn + ", pages=" + pages + "]";
    }
}
