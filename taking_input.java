
import java.io.*;

public class taking_input {
    String str;
    int x;

    BufferedReader ad = new BufferedReader(new InputStreamReader(System.in));

    public void getData() throws IOException { // Add throws declaration
        System.out.println("Enter a string: ");
        str = ad.readLine();

        System.out.println("Enter an integer: ");
        x = Integer.parseInt(ad.readLine());
    }

    public void showData() {
        System.out.println("String: " + str);
        System.out.println("Integer: " + x);
    }
}

class input_demo {
    public static void main(String[] args) {
        try { // Wrap in try-catch
            taking_input obj = new taking_input();
            obj.getData(); // Call getData() within try block
            obj.showData();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
