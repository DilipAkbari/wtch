public abstract class Abstraction {

    private int privateSpeed;

    public void setPrivateSpeed(int privateSpeed) {
        this.privateSpeed = privateSpeed;
    }
    public void engineStart(){
        System.out.println("Engine started");
    }
}
