import java.util.ArrayList;
import java.util.List;

public class Catalog extends Items {
    List<Items> myItems = new ArrayList<Items>();

    public Catalog(String newName, String newReleaseYear, String newPath, String newRating) {
        super(newName, newReleaseYear, newPath, newRating);
    }


    public List<Items> getMyItems() {
        return myItems;
    }


}