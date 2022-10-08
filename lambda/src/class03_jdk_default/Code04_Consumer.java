package class03_jdk_default;

import java.util.function.Consumer;

/**
 * Consumer接口（消费者）
 * @FunctionalInterface
 * public interface Consumer<T> {
 *     void accept(T t);
 *     ...
 * }
 * @author HuanyuLee
 * @date 2022/10/8
 */
public class Code04_Consumer {
    public static void consumer(Consumer<String> first, Consumer<String> sec) {
        first.andThen(sec).accept("Tt");
    }

    public static void main(String[] args) {
        Consumer<String> consumer = msg -> System.out.println("msg = " + msg);
        consumer.accept("hello");
        consumer(
                consumer,
                s -> System.out.println(s.toUpperCase())
        );
    }
}
