package class01_test;

/**
 * @author HuanyuLee
 * @date 2022/10/6
 */
public class SubClass implements Factory {
    @Override
    public Object getObject() {
        return new User("tom", 20);
    }
}
