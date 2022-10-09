package class05_method_reference;

/**
 * 普通方法引用
 * @author HuanyuLee
 * @date 2022/10/9
 */
class Out {
    public void toUpper(String str) {
        System.out.println(str.toUpperCase());
    }
}

public class Code04_CommonMethodReference {
    public static void main(String[] args) {
        Out out = new Out();
        IPrintable p = out::toUpper;
        p.print("java_home");
    }
}
