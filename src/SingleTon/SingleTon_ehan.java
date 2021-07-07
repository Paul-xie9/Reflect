package SingleTon;

/**
 * 饿汉式单例
 * 1.创建一个常量
 * 2.构造私有方法，类外部不能创建对象
 * 3.通过一个公开方法，返回这个对象
 * 优点：线程安全
 * 缺点：生命周期太长，浪费空间
 */
public class SingleTon_ehan {
    //创建一个常量
    private static final SingleTon_ehan instance= new SingleTon_ehan();
    //构造私有方法，外部类不能创建对象
    private SingleTon_ehan(){ }
    //通过一个公开方法，返回这个对象
    public static SingleTon_ehan getInstance(){
        return instance;
    }
}
