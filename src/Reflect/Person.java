package Reflect;

public class Person {
    String name;
    int age;

    public Person() {
    }

    @Override
    public String toString() {
        return "reflect01.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat() {
        System.out.println(name+" 正在吃...");
    }

    //带参的方法
    public void eat(String food){
        System.out.println(name+"正在吃"+food);
    }

    //私有方法
    private void privateMethod(){
        System.out.println(name+"正在睡觉...");
    }

    //静态方法
    public static void staticMethod(){
        System.out.println("这是一个静态方法！");
    }
}
