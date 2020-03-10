public class VariablesAndObjects {

    // instance varibale or global variance
    int a;
    int b = 10;
    String name = "prime";
    String name1 = "Testing";

    static int e = 500;
    static String f = "India";

    // static variables global variables
    public static void main(String[] args) {
        //local variable
        int c = 20;
        String d = "Hellow";
        //accessing static variable in static area
        System.out.println(e);
        System.out.println(f);

        VariablesAndObjects obj = new VariablesAndObjects();
        System.out.println(obj.b);
        System.out.println(obj.name);
        // accessing static variable into instance are
        System.out.println(VariablesAndObjects.e);
        System.out.println(VariablesAndObjects.f);
    }

    public void instanceMethod() {
        // instance area
    }

    public static void staticMethod() {
        // static area

    }


}
