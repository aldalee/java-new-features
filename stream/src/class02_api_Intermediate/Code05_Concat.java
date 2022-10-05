package class02_api_Intermediate;

import java.io.Serializable;
import java.util.stream.Stream;

/**
 * Stream流中的常用方法：concat，用于把流组合到一起
 * 如果有两个流，希望合并成为一个流，那么可以使用Stream接口的静态方法concat
 *      static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 * @author HuanyuLee
 * @date 2022/10/5
 */
public class Code05_Concat {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Tom", "John", "Mike");
        Stream<Integer> integerStream = Stream.of(9, 8, 7);
        Stream<? extends Serializable> concat = Stream.concat(stringStream, integerStream);
        concat.forEach(System.out::println);
    }
}
