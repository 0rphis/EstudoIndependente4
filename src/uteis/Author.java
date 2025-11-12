package uteis;

public class Author extends Person {
    private String afiliation;
    private boolean isCorrespondingAuthor;

    public Author(String afiliation, boolean isCorrespondingAuthor, String name, String email) {
        super(name, email);
        this.afiliation = afiliation;
        this.isCorrespondingAuthor = isCorrespondingAuthor;
    }

    public String getAfiliation() {
        return afiliation;
    }

    public boolean isCorrespondingAuthor() {
        return isCorrespondingAuthor;
    }

    public void setAfiliation(String afiliation) {
        this.afiliation = afiliation;
    }

    public void setCorrespondingAuthor(boolean isCorrespondingAuthor) {
        this.isCorrespondingAuthor = isCorrespondingAuthor;
    }

    @Override
    public String toString() {
        return "Author [afiliation=" + afiliation + ", isCorrespondingAuthor=" + isCorrespondingAuthor + "]"
                + super.toString();
    }
}
