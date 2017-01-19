/**
 * Created by sim on 1/17/17.
 */
public class Movie implements Comparable{
    String title;
    String category;

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }


    @Override
    public int compareTo(Object t) {
        Movie s = (Movie) t;

        return title.compareTo(s.title);
    }

    public Movie(String title, String category) {
        this.title = title;
        this.category = category;
    }
}
