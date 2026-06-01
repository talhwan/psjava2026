package J083;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0;i<100;i++){
            sum += (i+1);
        }
        System.out.println(sum);

        String[] names = {"james", "wb", "hee"};
        for(int i=0;i<names.length;i++){
            String name = names[i];
            System.out.println(name);
        }
        //for each 문!
        for(String name: names){
            System.out.println(name);
        }

        List<String> titles = new ArrayList<>();
        titles.add("james");
        titles.add("james");
        titles.add("wb");
        titles.add("hee");
        for(int i=0;i<titles.size();i++){
            String title = titles.get(i);
            System.out.println(title);
        }
        for(String title: titles){
            System.out.println(title);
        }

        /*
        List, Map!!
        Set!!
        */
    }
}
