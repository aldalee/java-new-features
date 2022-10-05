package class02_api_Intermediate;

import java.util.stream.Stream;

/**
 * Stream流中的常用方法：filter，用于对Stream流中的数据进行过滤
 *     Stream<T> filter(Predicate<? super T> predicate);
 * filter方法的参数Predicate是一个函数式接口，所以可以传递Lambda表达式，对数据进行过滤
 * Predicate中的抽象方法:
 *     boolean test(T t);
 * @author HuanyuLee
 * @date 2022/10/5
 */
public class Code01_Filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        Stream<String> namesZ = stream.filter(name -> name.startsWith("张"));
        namesZ.forEach(System.out::println);
        // Stream流属于管道流,只能被消费（使用）一次
        // 第一个Stream流调用完毕方法,数据就会流转到下一个Stream上
        // 而这时第一个Stream流已经使用完毕,就会关闭
        // 所以第一个Stream流就不能再调用方法了
        // Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        // stream.forEach(System.out::println);
    }
}
