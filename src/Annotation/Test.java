package Annotation;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception{
        //获取类对象
        Class<?> class1=Class.forName("Annotation.Person");
        //获取方法
        Method method = class1.getMethod("show",String.class,String.class,int.class);
        //获取方法上面的注解信息
        Personinfo personinfo=method.getAnnotation(Personinfo.class);
        //打印出来
        System.out.println(personinfo.name()+" "+personinfo.sex()+" "+personinfo.age());
        //调用方法
        Person xiaoming = (Person) class1.newInstance();
        method.invoke(xiaoming,personinfo.name(),personinfo.sex(),personinfo.age());
    }
}
