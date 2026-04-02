import java.util.HashMap;
import java.util.HashSet;



public class ArrayMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        HashSet<Integer> hashMap2 = new HashSet<>();

        hashMap.put("b", 20);
        hashMap.put("a", 10);
        hashMap.put("c", 30);

        hashMap2.add(30);
        hashMap2.add(40);
        hashMap2.add(50);
        for(String key : hashMap.keySet()){
            System.out.println(key + " : " + hashMap.get(key));
        }
        System.out.println(hashMap.containsKey("c"));
        System.out.println(hashMap2);
    }
}
