package interfaceExample;

public class AB extends ABC implements A, B {
    public void m1() {
        System.out.println("interface m1 method implementation");
    }
    public static void main(String[] args) {
        AB ab = new AB();
        ab.m1();
        ABC abc = new ABC();
        ABC abc1 = new AB();
        abc.m1();
        abc1.m1();
    }
}
