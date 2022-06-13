package exercises;
import java.lang.String;
public class stringExercises11 {
    public static void main(String[] args) {
        String s = "ThisShouldBeConverted";
        char[] chars = s.toCharArray();
        for (int i=0;i<21;i++){
            System.out.println(chars[i]);
        }
    }
}
