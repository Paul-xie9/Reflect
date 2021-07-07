package SingleTon;

/**
 * 懒汉式单例
 * * 1.创建一个对象，赋值为null
 *  * 2.构造私有方法，类外部不能创建对象
 *  * 3.通过一个公开方法，返回这个对象
 *  优点：生命周期短，节省空间
 *  缺点：有线程安全问题
 */
public class SingleTon_lanhan {
    //创建对象
    private static SingleTon_lanhan instance=null;
    //私有话构造方法
    private SingleTon_lanhan(){}
    //静态方法

    /*通过synchronized来实现同步*/
/** public static synchronized SingleTon_lanhan getInstance(){
        if (instance==null){
            instance=new SingleTon_lanhan();
        }
        return instance;
    }
 */
    /* 使用同步代码块实现同步 */
public static synchronized SingleTon_lanhan getInstance() {
    if (instance==null){    //提高执行效率
        synchronized (SingleTon_lanhan.class) { //实现同步
            if (instance == null) {
                instance = new SingleTon_lanhan();
            }
        }
    }
        return instance;
    }
}
