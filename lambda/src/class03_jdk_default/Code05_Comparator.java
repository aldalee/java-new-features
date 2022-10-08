package class03_jdk_default;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Comparator接口
 * @FunctionalInterface
 * public interface Comparator<T> {
 *     int compare(T o1, T o2);
 *     ...
 * }
 * @author HuanyuLee
 * @date 2022/10/8
 */
public class Code05_Comparator {
    public static void main(String[] args) {
        String[] arr = {"ab", "c", "d", "go", "bee"};
        Comparator<String> comparator = String::compareTo;
        // Comparator.reverseOrder();
        // comparator = (o1, o2) -> o2.length() - o1.length();
        Arrays.sort(arr, comparator);
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
