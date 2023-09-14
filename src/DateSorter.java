import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * Marking will be based upon producing a readable, well engineered solution rather than factors
 * such as speed of processing or other performance-based optimizations, which are less
 * important.
 *
 *
 * Implement in single class.
 */
public class DateSorter {
    /**
     * The implementation of this method should sort dates.
     * The output should be in the following order:
     * Dates with an 'r' in the month,
     * sorted ascending (first to last),
     * then dates without an 'r' in the month,
     * sorted descending (last to first).
     * For example, October dates would come before May dates,
     * because October has an 'r' in it.
     * thus: (2005-07-01, 2005-01-02, 2005-01-01, 2005-05-03)
     * would sort to
     * (2005-01-01, 2005-01-02, 2005-07-01, 2005-05-03)
     *
     * @param unsortedDates - an unsorted list of dates
     * @return the collection of dates now sorted as per the spec
     */
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        // creating predicate to filter months with "r" in name
        Predicate<LocalDate> hasRInMonth = date -> date.getMonth().toString().toLowerCase().contains("r");

        // collecting dates with "r" in month name
        List<LocalDate> monthsWithR = new ArrayList<>(unsortedDates.stream().filter(hasRInMonth).toList());

        // collecting dates without "r" in month name
        List<LocalDate> monthsWithoutR = new ArrayList<>(unsortedDates.stream().filter(hasRInMonth.negate()).toList());

        // sorting months with "r" in ascending order
        Collections.sort(monthsWithR);

        // sorting months without "r" in descending order
        monthsWithoutR.sort(Collections.reverseOrder());

        // merging two sorted lists into one
        List<LocalDate> mergedList = new ArrayList<>(monthsWithR);
        mergedList.addAll(monthsWithoutR);

        return mergedList;
    }
}
