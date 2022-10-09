package class05_method_reference;

/**
 * 静态方法引用
 * @author HuanyuLee
 * @date 2022/10/9
 */
@FunctionalInterface
interface Calculable {
    /**
     * 计算数x的绝对值
     * @param x int
     * @return |x|
     */
    int abs(int x);
}

public class Code02_StaticMethodReference {
    public static void main(String[] args) {
        Calculable c = Math::abs;
        int x = c.abs(-10);
        System.out.println("x = " + x);
    }
}
