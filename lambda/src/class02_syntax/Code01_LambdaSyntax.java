package class02_syntax;

/**
 * lambda表达式语法格式:
 *      (parameters) ->{ statements;}
 *   or
 *      (parameters) -> expression;
 * Lambda表达式与函数式接口的抽象函数格式一一对应
 * 前提：必须有一个函数式接口（@FunctionalInterface）
 * @author HuanyuLee
 * @date 2022/10/8
 */
public class Code01_LambdaSyntax {
    public static void main(String[] args) {
        // 基本格式
        IMathOperation op = (int a, int b) -> { // 简化 op = Integer::sum;
            return a + b;
        };
        // 省略return
        op = (int a, int b) -> a - b;
        System.out.println(op.operate(1, 2));
        // 省略大括号
        IGreeting g = (String msg) -> System.out.println("hello::" + msg);
        g.hello("lambda");
        // 省略小括号
        g = msg -> System.out.println("nice::" + msg);
        g.hello("lambda");
        // 省略类型参数和大括号
        op = (a, b) -> a * b;
        System.out.println(op.operate(1, 3));
    }
}
