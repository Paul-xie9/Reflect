package Factory;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;

/**
 * 客户程序
 */
public class Test {
    public static void main(String[] args) throws Exception{
        System.out.println("==========请选择 1鼠标 2风扇 3u盘 4键盘============");
        Scanner input = new Scanner(System.in);
        String choice = input.next();
        /*利用属性文件加载*/
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src\\Factory\\usb.properties");    //利用流传递
        properties.load(fileInputStream);
        fileInputStream.close();

        Usb usb = UsbFactory.createUsb(properties.getProperty(choice));
        if (usb !=null){
            System.out.println("购买成功！");
            usb.service();
        }else {
            System.out.println("您选择的产品不存在，购买失败！");
        }
    }
}
