import java.util.Collections;
import java.util.List;

public class AscendingSort implements SortStrategy {
    @Override
    public void sort(List<Integer> numbers) {
        Collections.sort(numbers);
    }
}
