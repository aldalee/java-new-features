package class01_test;

/**
 * 使用lambda表达式的前提：必须有一个函数式的、且仅有一个抽象方法的接口
 * @author HuanyuLee
 * @date 2022/10/6
 */
public interface Factory {
    Object getObject();
    // Object f();
}
