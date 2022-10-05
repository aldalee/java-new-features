package class02_api_Intermediate;

import java.util.ArrayList;

/**
 * @author HuanyuLee
 * @date 2022/10/5
 */
public class Code03_Limit {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            nums.add(i);
        }
        nums.stream()
                .filter(x -> x > 50)
                .limit(5)
                .forEach(System.out::println);
    }
}
