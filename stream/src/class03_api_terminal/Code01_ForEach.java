package class03_api_terminal;

import java.util.stream.Stream;

/**
 * Stream流中的常用方法：forEach，用来遍历流中的数据
 *      void forEach(Consumer<? super T> action);
 * 该方法接收一个Consumer接口函数，会将每一个流元素交给该函数进行处理。
 * Consumer接口是一个消费型的函数式接口，可以传递Lambda表达式，消费数据
 * forEach是一个终结方法，遍历之后就不能继续调用Stream流中的其他方法
 * @author HuanyuLee
 * @date 2022/10/5
 */
public class Code01_ForEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        stream.forEach(System.out::println);
    }
}
