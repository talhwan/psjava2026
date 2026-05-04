package J061;

import java.util.ArrayList;
import java.util.List;

public class J061 {
    public static void main(String[] args) {

        List<Word> words = new ArrayList<>();
        Word each = new Word("table", "책상", 1);
        words.add(each);

        System.out.println(words.size());
        for (int i=0;i<words.size();i++) {
            System.out.println(words.get(i).getEng() + " // " +  words.get(i).getMeaning());
        }

        words.get(0).setMeaning("책상, 데스크");
        for (int i=0;i<words.size();i++) {
            System.out.println(words.get(i).getEng() + " // " +  words.get(i).getMeaning());
        }

        words.remove(0);
        System.out.println(words.size());



        // 리스트!
        // 여러개 데이터를 저정할때 쓰는 자료 구조? 뭐 있었지요?!
        /*
        *
        배열!!!
        * 크기가 정해져 있습니다!!
        *
        유동적으로 크기를 조절할수 있는 리스트~~


        Integer[] aaa = new Integer[5];
        aaa = new Integer[6];

        List<Integer> list = null; // 인티저 자료형으로 관리하는 목록 을 만들꺼야!!
        List<Integer> list2 = new ArrayList<>(); //유동적으로 자료를 담을수 있음...

        System.out.println(list2.size());

        list2.add(100);
        System.out.println(list2.size());
        list2.add(200);
        System.out.println(list2.size());
        list2.add(300);
        System.out.println(list2.size());

        System.out.println(list2.get(0));

        for(int i=0;i<list2.size();i++){
            System.out.println(i + " : " + list2.get(i));
        }

        //System.out.println(aaa[101]);
        //System.out.println(list2.get(10));

        list2.remove(1);
        for(int i=0;i<list2.size();i++){
            System.out.println(i + " : " + list2.get(i));
        }

        list2.add(1, 200);
        for(int i=0;i<list2.size();i++){
            System.out.println(i + " : " + list2.get(i));
        }
        * */
    }
}
