package Annotation;

public class Person {
    @MyAnnotation() //如果自己创建的注解没有定义默认的值，那么就需要在这里自己设置默认值
    public void show(){
        
    }
    @MyAnnotation(value = "米饭")
    public void eat(){
        
    }

    @Personinfo(name="小明",sex="男",age=23)
    public void show(String name,String sex,int age){
        System.out.println(name+"==="+sex+"==="+age+"");
    }
}
