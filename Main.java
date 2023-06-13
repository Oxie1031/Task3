import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // 要素の追加
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        if(!map.containsKey("key4")) {
            throw new RuntimeException("Key not found in map: key4");
        }
        else  {
            System.out.println("key4 is included.");
        }
    }
}
