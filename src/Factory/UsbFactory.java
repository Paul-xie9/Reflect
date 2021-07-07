package Factory;

import org.w3c.dom.ls.LSOutput;

/**
 * 工厂类
 */
public class UsbFactory {
   /* public static Usb createUsb(int type){
        Usb usb = null;
        if (type == 1){
            //1:鼠标
            usb = new Mouse();
        }else if (type == 2){
            //2:风扇
            usb = new Fan();
        }else if (type == 3){
            //3：u盘
            usb = new Upan();
        }else if (type == 4){
            //4：键盘
            usb = new KeyBoard();
        }
        return usb;
    }
    */


    /* 利用反射，优化之后的代码 */

    public static Usb createUsb(String type){
     Usb usb = null;
        try {
            Class<?> class1 = Class.forName(type);
            usb = (Usb) class1.newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return usb;
    }
}
