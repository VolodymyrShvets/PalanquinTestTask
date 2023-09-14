import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DateSorter sorter = new DateSorter();
        Collection<LocalDate> dates = sorter.sortDates(sampleData2());
        
        System.out.println("=============");
        dates.forEach(System.out::println);
    }

    private static List<LocalDate> sampleData1() {
        return List.of(
                LocalDate.of(2005, 7, 1),
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2005, 1, 1),
                LocalDate.of(2005, 5, 3)
                );
    }

    private static List<LocalDate> sampleData2() {
        return List.of(
                LocalDate.of(2005, 7, 1),
                LocalDate.of(2005, 1, 5),
                LocalDate.of(2005, 1, 1),
                LocalDate.of(2005, 1, 3),
                LocalDate.of(2005, 12, 24),
                LocalDate.of(2005, 5, 3),
                LocalDate.of(2005, 10, 13),
                LocalDate.of(2005, 6, 8),
                LocalDate.of(2005, 8, 1),
                LocalDate.of(2005, 6, 11)
        );
    }
}