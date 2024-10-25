import java.util.*;

public class Main{
    public static void main(String[] args){
        LinkedHashMap<String, Integer> cityPopulations = new LinkedHashMap<>();

        cityPopulations.put("London", 8982000);
        cityPopulations.put("NewYork", 8419000);
        cityPopulations.put("Paris", 2148000);

        System.out.println("City populations:");
        for(Map.Entry<String, Integer> entry : cityPopulations.entrySet()){
            System.out.println(entry.getKey() + ": "+ entry.getValue());
        }
    }
}
