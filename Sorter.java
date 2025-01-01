import java.util.List;

public class Sorter {
    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(List<Integer> numbers) {
        if (strategy != null) {
            strategy.sort(numbers);
        } else {
            throw new IllegalStateException("Sort strategy is not set.");
        }
    }
}
