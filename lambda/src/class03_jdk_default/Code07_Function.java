package class03_jdk_default;

import java.util.function.Function;

/**
 * Function接口（函数）
 * 理解为 f: T -> R
 * @FunctionalInterface
 * public interface Function<T, R> {
 *     R apply(T t);
 *     ...
 * }
 * @author HuanyuLee
 * @date 2022/10/8
 */
public class Code07_Function {
    /**
     * 求多项式的二阶导数
     * @param f           求一阶导数
     * @param g           求二阶导数
     * @param coefficient 多项式系数
     * @return 二阶导数的系数
     */
    public static Integer[] getSecondDerivative(Function<Integer[], Integer[]> f,
                                                Function<Integer[], Integer[]> g,
                                                Integer[] coefficient) {
        return f.andThen(g).apply(coefficient);
    }

    // 打印多项式
    public static void showX(Integer[] C) {
        if (C.length == 1) {
            System.out.println("f(x) = " + C[0]);
            return;
        }
        StringBuilder s = new StringBuilder();
        int size = C.length - 1;
        for (int i = 0; i <= size; i++) {
            int pow = size - i;
            if (C[i] != 0 && pow > 0) {
                if (C[i] != 1) s.append(C[i]);
                if (pow == 1) s.append("x");
                else s.append("x^").append(pow);
                s.append(" + ");
            }
            if (C[i] != 0 && pow == 0) s.append(C[i]);
        }
        System.out.println("f(x) = " + s);
    }

    public static void main(String[] args) {
        Function<String, Integer> f = Integer::parseInt;
        Integer ans = f.apply("100");
        System.out.println("ans = " + ans);
        // 求多项式二阶导数
        // f(x) = 5x^3 + 2x^2 + x + 6
        // 系数 = [5,2,1,6]
        // 幂次 = [3,2,1,0]
        // 预期系数 = [30,4]
        // 预期幂次 = [1,0]
        Integer[] C = {5, 2, 1, 6};
        // Integer[] C = {2,1};
        // Integer[] C = {1};
        showX(C);
        Function<Integer[], Integer[]> d = x -> {
            if (x.length == 1) {
                return new Integer[]{0};
            }
            Integer[] C1 = new Integer[x.length - 1];
            for (int i = 0; i < x.length - 1; i++) {
                C1[i] = x[i] * (x.length - 1 - i);
            }
            return C1;
        };
        // 求一阶导数
        Integer[] C1 = d.apply(C);
        showX(C1);
        Integer[] finalC = getSecondDerivative(d, d, C);
        showX(finalC);
        // 求三阶导数
        Integer[] C3 = d.andThen(d.andThen(d)).apply(C);
        showX(C3);
    }
}
