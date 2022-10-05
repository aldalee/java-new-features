package class02_api_Intermediate;

import java.util.stream.Stream;

/**
 * Stream流中的常用方法：map，用于类型转换
 * 如果需要将流中的元素映射到另一个流中，可以使用map方法.
 *     <R> Stream<R> map(Function<? super T, ? extends R> mapper);
 * 该接口需要一个Function函数式接口参数，可以将当前流中的T类型数据转换为另一种R类型的流。
 * Function中的抽象方法:
 *     R apply(T t);
 * @author HuanyuLee
 * @date 2022/10/5
 */
public class Code02_Map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        // 使用map方法，把字符串类型的整数转换为Integer类型的整数
        stream.map(Integer::parseInt).forEach(System.out::println);
    }
}
