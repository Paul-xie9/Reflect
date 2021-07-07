package SingleTon;

/**
 * 单例的第三种写法
 * 静态内部类
 */
public class SingleTon_interal {
    private SingleTon_interal(){}
    //静态内部类
    private static class Holder{
        static SingleTon_interal instance = new SingleTon_interal();
    }

    public static SingleTon_interal getInstance(){
        return Holder.instance;
    }
}
