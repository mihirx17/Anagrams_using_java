import java.util.Arrays;

public class Main {
    public static void Anagram(String str1,String str2)
    {
        String new_string1=str1.toLowerCase();
        String new_string2=str2.toLowerCase();
        if(new_string1==new_string1)
        {
            char [] char_to_array=str1.toCharArray();
            char [] char_to_array1=str2.toCharArray();
            Arrays.sort(char_to_array);
            Arrays.sort(char_to_array1);
            boolean result=Arrays.equals(char_to_array1,char_to_array);
            if(result)
            {
                System.out.println("ANAGRAM");

            }
            else
            {
                System.out.println("NOT ANAGRAM");
            }

        }
    }
    public static void main(String[] args)
    {
        String str1="earth";
        String str2="heart";
        Anagram(str1,str2);
        System.out.println("YOU ARE LOVELY PERSON------");
    }
}