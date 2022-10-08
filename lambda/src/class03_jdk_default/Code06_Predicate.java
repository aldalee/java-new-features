package class03_jdk_default;

import java.util.function.Predicate;

/**
 * Predicate接口（断言）
 * @FunctionalInterface
 * public interface Predicate<T> {
 *     boolean test(T t);
 *     ...
 * }
 * @author HuanyuLee
 * @date 2022/10/8
 */
public class Code06_Predicate {
    /**
     * 与
     * @param p1 boolean test(T t);
     * @param p2 boolean test(T t);
     * @param s string
     * @return boolean
     */
    public static boolean and(Predicate<String> p1, Predicate<String> p2, String s) {
        return p1.and(p2).test(s);
    }
    /**
     * 或
     * @param p1 boolean test(T t);
     * @param p2 boolean test(T t);
     * @param s string
     * @return boolean
     */
    public static boolean or(Predicate<String> p1, Predicate<String> p2, String s) {
        return p1.or(p2).test(s);
    }
    /**
     * 非
     * @param p boolean test(T t);
     * @param s string
     * @return boolean
     */
    public static boolean negate(Predicate<String> p, String s) {
        return p.negate().test(s);
    }
    public static void main(String[] args) {
        String str = "Hello the world !";
        boolean ans;
        ans = and(s -> s.contains("H"), s -> s.contains("w"), str);
        ans = or(s -> s.contains("A"), s -> s.contains("z"), str);
        ans = negate(s -> s.length() < 10, str);
        System.out.println("ans = " + ans);
    }
}
