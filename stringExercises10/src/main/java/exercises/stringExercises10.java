package exercises;
import java.lang.String;
public class stringExercises10 {
    public static void main(String[] args) {
        String s = "Carl,Susie,Fredrick,Bob,Erik";
        String[] parts = s.split(",");
        String name1 = parts[0];
        String name2 = parts[1];
        String name3 = parts[2];
        String name4 = parts[3];
        String name5 = parts[4];
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);
    }
}
