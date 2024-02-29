import java.awt.*;
import java.util.Scanner;

public class firstframe{
public static void main (String []args){
    Frame f = new Frame();
    f.setTitle("hello world");
    f.setSize(500,300);
    f.setVisible(true);
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    s = s+1;
    System.out.println(s);
    sc.close();

}
}