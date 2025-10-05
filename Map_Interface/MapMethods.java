import java.util.*;
public class MapMethods {
    Map<String,Integer> store = new HashMap<>();
    public void insert_map() {
        store.put("siva", 20);
        store.put("sana", 19);
        store.put("kiran", 22);
        store.put("ganesh", 30);
    }
    public void display_map() {

        System.out.println(store);
        System.out.println("get: " + store.get("siva"));
        System.out.println("contains: "+store.containsKey("ganesh"));
        System.out.println("remove: " + store.remove("saikiran"));
         System.out.println("contains: "+store.containsKey("ganesh"));
        System.out.println("size: " + store.size());
        System.out.println("replace: "+store.replace("ganesh", 30, 39));
        System.out.println("default: "+store.getOrDefault("unknown", 10));

        System.out.println("Using entrySet()");
        for(Map.Entry<String,Integer> e:store.entrySet()){
            System.out.println(e.getKey()+" -> "+e.getValue());
        }

        System.out.println("Using keySet()");
        for(String key: store.keySet()){
            System.out.println(key+" -> "+store.get(key));
        }
        
        System.out.println("Using forEach()");
        store.forEach((k,v)-> System.out.println(k+" -> "+v));
    }
    public static void main(String[] args) {
        MapMethods map = new MapMethods();
        Scanner s=new Scanner(System.in);
        map.insert_map();
        map.display_map();
    }
}
