package JavaImpQues;

class student {
    int roll_no = 1;
    static String name = "Avi";
    static float attendance_percentage = 76;
    int mark1 = 20, mark2 = 22;

}
interface attendance {
    float required_percentage = 75;
}
class result extends student implements attendance {
    void verify_attendance() {
        if (student.attendance_percentage >= required_percentage) {
            System.out.println("Roz aata hai sala");
            System.out.println("Average Marks of " + student.name + " is " + (mark1 + mark2)/2);
        }
        else {
            System.out.println("Student is debarred");
        }
    }
}
public class iii_b_attendance {
    public static void main(String[] args) {
        result r1 = new result();
        r1.verify_attendance();
    }
}
