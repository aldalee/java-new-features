package class03_api_terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream流的收集方法：collect
 * R collect(Collector collector)
 * 它是通过工具类Collectors提供了具体的收集方式：
 * 1、把元素收集到List集合中
 * public static <T> Collector toList()
 * 2、把元素收集到Set集合中
 * public static <T> Collector toSet()
 * 3、把元素收集到Map集合中
 * public static Collector toMap(Function keyMapper,Function valueMapper)
 * @author HuanyuLee
 * @date 2022/10/5
 */
public class Code03_Collect {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(
                Arrays.asList("林青霞", "张曼玉", "王祖贤", "柳岩"));
        HashSet<Integer> set = new HashSet<>(
                Arrays.asList(10, 30, 20, 40, 50, 60));
        String[] str = {"林青霞,30", "张曼玉,35", "王祖贤,33", "柳岩,25"};

        list.stream()
                .filter(s -> s.length() == 3)
                .toList()
                .forEach(System.out::println);

        set.stream()
                .filter(x -> x > 25)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        // 得到str字符串年龄数据大于30的流，
        // 将数据收集到Map集合中
        // 最后以 姓名作键，年龄作值 输出
        Stream.of(str)
                .filter(s -> Integer.parseInt(s.split(",")[1]) > 30)
                .collect(Collectors.toMap(
                        s -> s.split(",")[0],
                        s -> Integer.parseInt(s.split(",")[1])))
                .entrySet()
                .forEach(System.out::println);
    }
}
