package homework;

public class Lesson1 {

    int a=100;
    int b=200;

    public static void main(String[] args) {
        Lesson1 add = new Lesson1();
        add.addition(100, 200);
        System.out.println(add);
    }
    public void addition(int a, int b) {
        int plus = a + b;
        System.out.println(plus);
    }
    public void substration(int a, int b) {
        int sub = a - b;
        System.out.print(sub);
    }
}