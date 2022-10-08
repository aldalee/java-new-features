package class02_syntax;

/**
 * 函数式接口，抽象方法有且仅有一个
 * @author HuanyuLee
 * @date 2022/10/8
 */
@FunctionalInterface
public interface IMathOperation {
    int operate(int a, int b);

    static void show(int a, int b) {
        System.out.printf("(a,b) = (%d,%d)\n", a, b);
    }

    default int get(int a, int b) {
        return Math.max(a, b);
    }
}
