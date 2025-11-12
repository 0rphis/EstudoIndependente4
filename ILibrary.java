import java.util.ArrayList;
import uteis.*;

public interface ILibrary {

    void addPublication(Publication p);

    boolean removePublication(long id);

    ArrayList<Publication> getAllPublications();

    short countPublications();

    Publication findPublication(String title);

    boolean hasPublication(String title);

}
