package class03_jdk_default;

import java.util.function.Supplier;

/**
 * Supplier接口（供应商）
 * @FunctionalInterface
 * public interface Supplier<T> {
 *     T get();
 * }
 * @author HuanyuLee
 * @date 2022/10/8
 */
public class Code03_Supplier {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9, 2, 4, 6, 8};
        // 获取数组的最大值
        Supplier<Integer> supplier = () -> {
            int max = Integer.MIN_VALUE;
            for (int j : arr) {
                if (j > max) max = j;
            }
            return max;
        };
        System.out.println(supplier.get());
    }
}
