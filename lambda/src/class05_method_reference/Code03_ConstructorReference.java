package class05_method_reference;

/**
 * 构造方法引用
 * @author HuanyuLee
 * @date 2022/10/9
 */
@FunctionalInterface
interface IPersonBuilder {
    /**
     * 传递姓名，创建Person对象并返回
     * @param name string
     * @return Person
     */
    Person builder(String name);
}

class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Code03_ConstructorReference {
    public static void main(String[] args) {
        IPersonBuilder p = Person::new;
        Person person = p.builder("Tom");
        System.out.println(person);
    }
}
