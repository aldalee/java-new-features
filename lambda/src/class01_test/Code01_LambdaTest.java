package class01_test;

/**
 * Lambda表达式初体验
 * 函数式编程：更关注函数/功能，而非对象
 *   1、函数是"第一等公民"
 *   2、可以赋值给变量
 *   3、可以作为（其它函数的）参数进行传递
 *   4、可以作为（其它函数的）返回值
 * @author HuanyuLee
 * @date 2022/10/6
 */
public class Code01_LambdaTest {
    public static User getUserFromFactory(Factory factory, String beanName) {
        Object o = factory.getObject();
        if (o != null && o.getClass().getSimpleName().equals(beanName)) {
            return (User) o;
        }
        return null;
    }
    // lambda表达式作为函数的返回值
    public static Factory getFactory() {
        return () -> new User("Tha", 22);
    }

    public static void main(String[] args) {
        // 子类实现接口
        Factory factory = new SubClass();
        // 匿名内部类
        factory = new Factory() {
            @Override
            public Object getObject() {
                return new User("John", 18);
            }
        };
        // lambda表达式
        factory = () -> new User("Mike", 30);
        factory = getFactory();
        // lambda表达式作为参数传递
        User user = getUserFromFactory(() -> new User("Aah", 35), "User");
        System.out.println("user = " + user);
    }
}
