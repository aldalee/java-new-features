package class02_api_Intermediate;

import java.util.stream.Stream;

/**
 * Stream流中的常用方法：skip，用于跳过元素
 * 如果希望跳过前几个元素，可以使用skip方法获取一个截取之后的新流：
 *      Stream<T> skip(long n);
 * 如果流的当前长度大于n，则跳过前n个；否则将会得到一个长度为0的空流。
 * @author HuanyuLee
 * @date 2022/10/5
 */
public class Code04_Skip {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stream.of(arr)
                .skip(3)    // 跳过前3个元素
                .forEach(System.out::println);
    }
}
