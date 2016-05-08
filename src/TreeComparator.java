/**
 * Created by Magdalena Polak on 04.05.2016.
 */
import java.util.Comparator;
//Included for needed comparator
class TreeComparator<T> implements Comparator<T> {
    @SuppressWarnings("unchecked")
    public int compare(T a, T b) {
        return ((Comparable<T>)a).compareTo(b);
    }
}