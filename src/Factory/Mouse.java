package Factory;

public class Mouse implements Usb{
    @Override
    public void service() {
        System.out.println("鼠标开始工作！");
    }
}
