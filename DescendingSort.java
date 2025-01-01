import java.util.Collections;
import java.util.List;

public class DescendingSort implements SortStrategy {
    @Override
    public void sort(List<Integer> numbers) {
        Collections.sort(numbers, Collections.reverseOrder());
    }
}
