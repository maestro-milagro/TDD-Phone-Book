import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneBook {
    Map<String, String> phoneBook = new HashMap<>();
    public int add(String name, String number){
        phoneBook.put(name, number);
        return phoneBook.size();
    }
    public String findByNumber(String number){
        String answer = "Нет пользователя с таким номером";
        for(Map.Entry<String, String> entry : phoneBook.entrySet()){
            if (entry.getValue().equals(number)){
                answer = entry.getKey();
            }
        }
        return answer;
    }
    public String findByName(String name){
        if (!phoneBook.containsKey(name)){
            return "Нет такого пользователя";
        }
        return phoneBook.get(name);
    }

    public void printAllNames(){
        for(Map.Entry<String, String> entry : phoneBook.entrySet()){
            System.out.println(entry.getKey());
        }
    }

}
