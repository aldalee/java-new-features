package class01_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://docs.oracle.com/javase/8/docs/api/index.html">JDK8 Stream API</a>
 * @author HuanyuLee
 * @date 2022/10/5
 */
public class Code01_FindName {
    // 查找集合中姓张的人
    // 再筛选出张姓中名字有三个字的人
    // 最后打印出来
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(
                Arrays.asList("张无忌", "周芷若", "赵敏", "张强", "张三丰"));
        // 传统方法
        for (String name : names) {
            if (name.startsWith("张") && name.length() == 3) {
                System.out.println(name);
            }
        }
        // Stream实现
        names.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(System.out::println);
    }
}
