package class03_api_terminal;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Stream流中的常用方法：count，用于统计Stream流中元素的个数
 *      long count();
 * count方法是一个终结方法，返回值是一个long类型的整数
 * 所以不能再继续调用Stream流中的其他方法
 * @author HuanyuLee
 * @date 2022/10/5
 */
public class Code02_Count {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        // 获取Stream流，统计元素个数
        // 当然更推荐使用 list.size();
        long count = list.stream().count();
        System.out.println("count = " + count);
    }
}
