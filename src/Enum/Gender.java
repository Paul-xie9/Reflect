package Enum;

/**
 * 性别枚举
 * 注意：
 * 1.枚举必须要包含枚举常量，也可以包含属性，方法，私有构造方法
 * 2.枚举常量必须在前面，多个常量之间使用常量隔开，最后分号可写可不写
 */
public enum Gender {
    MALE,FEMALE;
    private String value;
    private Gender(){
    }
    public void show(){
    }
    public static void show2(){
    }

}
