package SingleTon;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(SingleTon_ehan.getInstance().hashCode());
                }
            }).start();
        }
    }
}
