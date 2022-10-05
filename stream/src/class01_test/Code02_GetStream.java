package class01_test;

import java.util.*;
import java.util.stream.Stream;

/**
 * 获取流
 * java.util.stream.Stream<T>是Java8新加入的最常用的流接口。（不是函数式接口！！！）
 * 1、所有的Collection集合都可以通过stream默认方法获取流；
 * default Stream<E> stream()
 * 2、Stream接口的静态方法of可以获取数组对应的流：
 * static <T> Stream<T> of(T... values)
 * @author HuanyuLee
 * @date 2022/10/5
 */
public class Code02_GetStream {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(Arrays.asList("1", "2"));
        Set<String> set = new HashSet<>(Arrays.asList("11", "22"));
        Map<Integer, String> map = new HashMap<>() {{
            put(1, "111");
            put(2, "222");
        }};
        // 获取集合、Map的Stream流
        Stream<String> streamList = list.stream();
        Stream<String> streamSet = set.stream();
        Stream<Map.Entry<Integer, String>> streamMap = map.entrySet().stream();

        // 把数组转换成Stream流
        Stream<int[]> streamArray = Stream.of(new int[]{1, 2, 3, 4, 5});
    }
}
