import java.util.*;

public class StringSwap {
       public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        } else {
            int l = s1.length(), f = 0;
            String s = "", k = s1;
            StringBuilder sb = new StringBuilder(k);
            for (int i = 0; i < l - 1; i++) {
                for (int j = i + 1; j < l; j++) {
                    char ch = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, ch);
                    s = sb.toString();
                    if (s.equalsIgnoreCase(s2)) {
                        f = 1;
                        return true;
                    } else {
                        char tem = sb.charAt(i);
                        sb.setCharAt(i, sb.charAt(j));
                        sb.setCharAt(j, tem);
                        k = sb.toString();
                        continue;

                    }
                }
            }
            if (f == 1) {
                return true;
            } else {
                return false;
            }
        }
    }
    public static void main(String args[]) {
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        StringSwap ss = new StringSwap();
        System.out.println("Enter the strings: ");
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        System.out.println(ss.areAlmostEqual(s1, s2));
    }
}