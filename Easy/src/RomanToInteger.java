import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "III";

        int ans = romanToInt(s);
        System.out.println(ans);
    }
    
    public static int romanToInt(String s) {
        if (s.length() == 0 || s == null)
            return 0;

        HashMap<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);

        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (mp.get(s.charAt(i)) >= mp.get(s.charAt(i + 1)))
                res += mp.get(s.charAt(i));
            else
                res -= mp.get(s.charAt(i));
        }
        
        res += mp.get(s.charAt(s.length() - 1));
        return res;
    }
}
