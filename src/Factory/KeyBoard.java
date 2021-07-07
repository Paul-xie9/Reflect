package Factory;

public class KeyBoard implements Usb{
    @Override
    public void service() {
        System.out.println("键盘正在工作！");
    }
}
