package corejava;

public class Method {

    public static void main(String[] args) {
        Method obj = new Method();
        obj.addition(10,20);
        subtration(10,20);
    }

    public void addition(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public static void subtration(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }
}


