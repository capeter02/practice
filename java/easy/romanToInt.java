import java.util.HashMap;

class romanToInt {
    
    public int convRomanToInt(String s) {
        HashMap<Character, Integer> romanN = new HashMap<Character, Integer>();
        
        romanN.put('I', 1);
        romanN.put('V', 5);
        romanN.put('X', 10);
        romanN.put('L', 50);
        romanN.put('C', 100);
        romanN.put('D', 500);
        romanN.put('M', 1000);
        
        int result = 0;
        
        for (int i = 0; i < s.length(); i++)
        {
            if (i > 0 && romanN.get(s.charAt(i)) > romanN.get(s.charAt(i-1)))
                {
                    result += romanN.get(s.charAt(i)) - (2 * romanN.get(s.charAt(i-1)));
                }
            else {
                result += romanN.get(s.charAt(i));
            }
        }
        return result;
    }
}