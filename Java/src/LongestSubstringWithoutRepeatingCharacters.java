import java.util.ArrayList;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
 public static void main(String[] args) {
  String input = "abcbbcccdefgh";
  HashSet<Character> set = new HashSet<Character>();
  int start = 0;
  int maxLength = 0;
  ArrayList<Character> max = null;
//		String result = "";

  for (int i = 0; i < input.length(); i++) {
   if (!set.contains(input.charAt(i))) {
    set.add(input.charAt(i));
    if (set.size() > maxLength) {
     maxLength = set.size();
     max = new ArrayList<Character>(set);
    }
   }

   else {
    while (set.contains(input.charAt(i))) {
     set.remove(input.charAt(start));
     start += 1;

    }
   }
   set.add(input.charAt(i));
  }
  StringBuilder result = new StringBuilder(max.size());
  for (Character c : max) {
   result.append(c);
  }
  System.out.print(result.toString());
 }
}
