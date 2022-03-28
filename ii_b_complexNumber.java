package JavaImpQues;

public class ii_b_complexNumber {
    ii_b_complexNumber(int r1, int i1, int r2, int i2) {
        int rr = r1 + r2;
        int ir = i1 + i2;
        System.out.println("Result is: " + rr + " + " + ir + "i");
    }
    public static void main(String[] args) {
        int r1 = 2;
        int i1 = 5;
        int r2 = 4;
        int i2 = -11;
//        addition(r1, i1, r2, i2);
        ii_b_complexNumber q1 = new ii_b_complexNumber(r1, i1, r2, i2);

    }
}
