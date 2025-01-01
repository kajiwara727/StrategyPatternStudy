import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3));

        Sorter sorter = new Sorter();

        // 昇順ソート
        sorter.setStrategy(new AscendingSort());
        System.out.println("Before sorting (ascending): " + numbers);
        sorter.sort(numbers);
        System.out.println("After sorting (ascending): " + numbers);

        // 降順ソート
        sorter.setStrategy(new DescendingSort());
        sorter.sort(numbers);
        System.out.println("After sorting (descending): " + numbers);
    }
}
