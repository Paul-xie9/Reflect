package Annotation;

/**
 * 创建注解类型 @interface
 */
public @interface MyAnnotation {
    //属性（类似方法）
    String value() default "你好！";
    String name() default "张三"; //字符类型
    int age() default 21;   //基本类型
    //Class<?> class1();  //Class类型
    //Gender gender();    //枚举类型
    //MyAnnotation annotation();  //注解类型
    //ArrayList<String> list();   //一维数组
}
