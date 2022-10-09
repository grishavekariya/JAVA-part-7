import java.util.*;

public class Practical_2 
{
    public static void main(String[] args) 
    {
       
        // taking variable of type String and intializing it
        String text = "Good morning."  + "Hello Student.";
        Map<String, Integer> map = new TreeMap<>();
        String[] words = text.split("[ \n\t\r.,;:!?()]");

        // loop to calculate quantity of each word in given string
        for(int i=0; i< words.length; i++)
        {
            String key = words[i].toLowerCase();

            if(key.length() > 0)
            {
                if(!map.containsKey(key))
                {
                    map.put(key, 1);
                }
                else
                {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }

        // printing quantity of each word in given string
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet)
        {
            System.out.println("\n" + entry.getValue() + " word/s - " + entry.getKey());
        }
        System.out.println("prepared by 21CE153_grisha");
    } 
    
}


