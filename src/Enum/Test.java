package Enum;

public class Test {
    public static void main(String[] args) {
        Gender gender = Gender.MALE;
        System.out.println(gender.toString());
        System.out.println("************");
        Season season = Season.冬天;
        System.out.println(season.toString());
        System.out.println("************");
        //枚举和switch的联合使用
        Season season1 = Season.SPRING;
        switch (season1){
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
            default:
                break;
        }
    }
}
