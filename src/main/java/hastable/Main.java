package hastable;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {

        //INTEGER
        /*Hashtable<Integer, String> table = new Hashtable<>(10);
        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        //table.remove(777);
        //System.out.println(table.get(100); //Spongebob


        for (Integer key: table.keySet()){
            System.out.println(key.hashCode() % 10 + "\t" +key + "\t" + table.get(key));
            //System.out.println(key.hashCode() + "\t" +key + "\t" + table.get(key));
            //System.out.println(key + "\t" + table.get(key));
        }*/


        //STRING
        Hashtable<String, String> table = new Hashtable<>(21);
        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");

        for (String key : table.keySet()) {
            System.out.println(key.hashCode() % 21 + "\t" + key + "\t" + table.get(key)); //%10
            //System.out.println(key.hashCode() + "\t" +key + "\t" + table.get(key));
        }
    }
}
