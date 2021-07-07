package Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class TestPerson {
    /**
     * -verbose:class   显示类的加载过程
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Person zhangsan = new Person();
        zhangsan.name="张三";
        zhangsan.age=22;
        zhangsan.eat();
        System.out.println("******************************");

        reflectOpe3();
        System.out.println("******************************");

        reflect4();
        System.out.println("******************************");

        Properties properties = new Properties();
      /*  properties.setProperty("name","zhangsan");
        System.out.println(properties.toString());
        正常调用
       */
        invokeAny(properties,"setProperty",new Class[]{String.class,String.class},"name","张三");
        System.out.println(properties.toString());
        System.out.println("******************************");
    }

    /**
     * 使用反射获取类中的方法并调用方法
     * @throws Exception
     */
    public static void reflectOpe3() throws Exception{
        //获取类对象
        Class<?> class1 = Class.forName("Reflect.Person");
        //获取方法Method对象
       // Method[] methods = class1.getMethods(); //----getMethods()只能获取公开的方法和从父类继承的方法
        Method[] methods = class1.getDeclaredMethods(); //-----getDeclaredMethods()获取所以方法，不包含继承的
        for (Method method:methods
             ) {
            System.out.println(method.toString());
        }
        System.out.println("--------------");
        /* 获取单个方法 */
        //1.eat()
        Method eatmethod = class1.getMethod("eat");
        //调用方法
        Person zhangsan = (Person) class1.newInstance();
        zhangsan.name = "张三";
        eatmethod.invoke(zhangsan);
        System.out.println("--------------");

        //2.toString()
        Method toStringMethod = class1.getMethod("toString");
        //调用方法
        Object result = toStringMethod.invoke(zhangsan);
        System.out.println(result);
        System.out.println("--------------");

        //3.eat(String food)
        Method eatMethod = class1.getMethod("eat",String.class);
        eatMethod.invoke(zhangsan,"苹果");
        System.out.println("--------------");

        //4.获取私有方法
        Method privateMethod = class1.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);  //设置访问权限
        privateMethod.invoke(zhangsan);
        System.out.println("--------------");

        //5.获取静态方法
        Method staticMethod = class1.getMethod("staticMethod");
        staticMethod.invoke(null);
        System.out.println("--------------");
    }

    /**
     * 使用反射实现一个，可以调用任何对象的通用方法
     */
    public static Object invokeAny(Object obj,String methodName,Class<?>[] types,Object...args) throws Exception{
       Class<?> class1 = obj.getClass();    //获取类对象
       Method method = class1.getMethod(methodName,types);  //获取方法
        return method.invoke(obj,args); //调用
    }

    /**
     * 使用反射获取类中的属性
     */
    public static void reflect4() throws Exception{
        //获取类对象
        Class<?> class1 = Class.forName("Reflect.Person");
        //获取属性（字段）
        Field[] fields = class1.getDeclaredFields();    //可以获取所有的属性
        System.out.println(fields.length);
        for (Field field:fields     //遍历
             ) {
            System.out.println(field.toString());
        }
        System.out.println("--------------");
        //获取单个属性（name）
        Field namefield = class1.getDeclaredField("name");
        Person lisi =(Person) class1.newInstance(); //声明新的对象
        namefield.set(lisi,"李四");   //为新的对象的name属性赋值
        System.out.println(namefield.get(lisi));    //获取值
    }
}