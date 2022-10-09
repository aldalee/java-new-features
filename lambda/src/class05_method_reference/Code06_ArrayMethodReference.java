package class05_method_reference;

import java.util.Arrays;

/**
 * 数组的方法引用
 * @author HuanyuLee
 * @date 2022/10/9
 */
@FunctionalInterface
interface IArrayBuilder {
    int[] builder(int length);
}

public class Code06_ArrayMethodReference {
    public static void main(String[] args) {
        IArrayBuilder ab = int[]::new;
        int[] array = ab.builder(10);
        System.out.println(Arrays.toString(array));
    }
}
