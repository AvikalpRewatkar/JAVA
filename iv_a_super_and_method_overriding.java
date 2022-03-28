package JavaImpQues;
class animal {
    void color() {
        System.out.println("White");
    }
}
class dog extends animal {
    @Override
    void color() {
        System.out.println("Black");
    }
    void display() {
        super.color();
    }
}
public class iv_a_super_and_method_overriding {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.display();
    }
}
