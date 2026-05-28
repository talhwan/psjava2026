package week12;

import java.util.HashMap;
import java.util.Map;

public class MapHash {

    public static void main(String[] args) {
        FileIO fileIO = new FileIO();
        fileIO.out();

        /*Map<String, Object> a_map = new HashMap<>();
        a_map.put("key1", "value1");
        a_map.put("key2", "value2");
        a_map.put("key3", "value3");
        System.out.println(a_map); //
        System.out.println(a_map.get("key1")); //
        System.out.println(a_map.get("key")); //

        MapHash mapHash = new MapHash();
        mapHash.put("key1", "value1");
        mapHash.put("key2", "value2");
        mapHash.put("key3", "value3");
        System.out.println(mapHash); //
        System.out.println(mapHash.get("key1")); //
        System.out.println(mapHash.get("key")); //
        mapHash.put("key1", "value11111");
        System.out.println(mapHash); //
        mapHash.remove("key1");
        System.out.println(mapHash); //*/


    }

    String[] keys = null;
    Object[] values = null;

    public MapHash() {
        keys = new String[0];
        values = new Object[0];
    }

    public void put(String key, Object value) {
        boolean isExist = false;
        for(int i = 0; i < keys.length; i++){
            if(keys[i].equals(key)){
                values[i] = value;
                isExist = true;
            }
        }
        if(!isExist){
            String[] newKeys =  new String[keys.length+1];
            Object[] newValues = new Object[keys.length+1];
            for(int i = 0; i < keys.length; i++){
                newKeys[i] = keys[i];
                newValues[i] = values[i];
            }
            newKeys[keys.length] = key;
            newValues[keys.length] = value;
            keys = newKeys;
            values = newValues;
        }
    }

    public Object get(String key) {
        for(int i = 0; i < keys.length; i++){
            if(keys[i].equals(key)){
                return values[i];
            }
        }
        return null;
    }

    public void remove(String key) {
        int index = -1;
        for(int i = 0; i < keys.length; i++){
            if(keys[i].equals(key)){
                index = i;
            }
        }
        if(index != -1){
            String[] newKeys =  new String[keys.length-1];
            Object[] newValues = new Object[keys.length-1];
            for(int i = 0; i < index; i++){
                newKeys[i] = keys[i];
                newValues[i] = values[i];
            }
            // 0 1 2 3 4
            // 0 - 2 3 4
            // 0 2 3 4
            for(int i = index; i < keys.length - 1; i++){
                newKeys[i] = keys[i + 1];
                newValues[i] = values[i + 1];
            }
            keys = newKeys;
            values = newValues;
        }
    }
    @Override
    public String toString(){
        String result = "";
        for(int i = 0; i < keys.length; i++){
            result += keys[i] + "=" + values[i] + "\n";
        }
        return result;
    }
}
