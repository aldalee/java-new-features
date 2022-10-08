package class03_jdk_default;

/**
 * Runnable接口
 * @FunctionalInterface
 * public interface Runnable {
 *    public abstract void run();
 * }
 * @author HuanyuLee
 * @date 2022/10/8
 */
public class Code01_Runnable {
    public static void main(String[] args) {
        // 使用匿名内部类的方式实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println("线程 " + name + " 已启动!");
            }
        }).start();
        // 使用Lambda表达式
        new Thread(() -> {
            String name = Thread.currentThread().getName();
            System.out.println("Lambda::线程 " + name + " 已启动!");
        }).start();
    }
}
