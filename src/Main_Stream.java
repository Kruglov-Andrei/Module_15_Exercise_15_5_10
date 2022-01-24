import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main_Stream {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(117d, 12.2d, 66d, 18.5d);
        List<String> list2 = Arrays.asList("15", "18.5", "117", "22.2");
        Stream.concat(list.stream(),list2.stream().map(Double::valueOf))
        .distinct()
        .sorted(Comparator.reverseOrder())
        .forEach(System.out::println);
    }
}
