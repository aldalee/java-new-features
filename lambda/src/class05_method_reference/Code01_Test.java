package class05_method_reference;

/**
 * @author HuanyuLee
 * @date 2022/10/8
 */
@FunctionalInterface
interface IPrintable {
    /**
     * 定义一个打印操作的函数式接口
     * @param s string
     */
    void print(String s);
}
public class Code01_Test {
    public static void main(String[] args) {
        // IPrintable p = s -> System.out.println(s);
        // PrintStream中已经存在println方法
        // 故lambda表达式没必要重复造轮子
        // 因此可以进行 方法引用
        // 普通方法引用语法格式：对象名::方法名
        IPrintable p = System.out::println;
        p.print("hello");
    }
}
