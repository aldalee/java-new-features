package class05_method_reference;

/**
 * super this
 * 注意，方法引用是为了替代lambda表达式，避免重复造轮子
 * @author HuanyuLee
 * @date 2022/10/9
 */
@FunctionalInterface
interface IGreet {
    void greet();
}

class Human {
    public void say() {
        System.out.println("I am a human!");
    }
}

class Man extends Human {
    @Override
    public void say() {
        System.out.println("I am a man!");
    }
    public void show() {
        // 子类调用父类的方法
        IGreet gf = super::say;
        gf.greet();
        // 调用本类的方法
        IGreet g = this::say;
        g.greet();
    }
}

public class Code05_SuperThisMethodReference {
    public static void main(String[] args) {
        Man man = new Man();
        man.show();
    }
}
