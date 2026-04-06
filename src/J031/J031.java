package J031;

import java.util.Scanner;

public class J031 {
    public static void main(String[] args) {
        J031 ps = new J031();
        //ps.j031();
        //ps.test1();
        ps.j032();
    }
    public void j031(){
        System.out.println("j031!!");

        /*String abc = "0123456789";
        String abc_1 = abc.substring(0, 5);
        System.out.println(abc_1);
        String abc_2 = abc.substring(2, 5);
        System.out.println(abc_2);

        String test1 = "hello!";
        int index1 = test1.indexOf("a");
        System.out.println(index1);

        boolean aaa = test1.contains("!");
        System.out.println(aaa);*/

        String userId = "";
        String password = "";
        String name = "";

        Scanner sc = new Scanner(System.in);
        userId = sc.nextLine();
        password = sc.nextLine();
        name = sc.nextLine();

        int password_length = password.length();
        if(password_length < 3){
            System.out.println("Error!!!");
        } else {

            String newPw = password.substring(0, 2);
            for(int i=2; i<password_length; i++){
                newPw += "*";
            }

            System.out.println("userId : " + userId);
            System.out.println("password : " + password);
            System.out.println("password : " + newPw);
            System.out.println("name : " + name);
        }
    }
    public void test1(){
        // 00:00 ~ 23:59
        // 3이 한개라도 있는 경우 카운트 하기
        // 하루종일 몇번 카운트 될까요?
        int count = 0;
        String hour = "";
        String minute = "";
        for(int i=0; i<24; i++){
            for(int j=0;j<60; j++){
                hour = "" + i;
                minute = "" + j;
                if(i<10){
                    hour = "0" + i;
                }
                if(j<10){
                    minute = "0" + j;
                }
                System.out.println(hour + ":" + minute);
                String hourMin = hour + ":" + minute;
                if(hourMin.contains("3")){
                    count++;
                }
            }

        }

        System.out.println(count);
    }
    public void j032(){
        String str = "";
        String reverse;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        for(int i=0; i<str.length(); i++){
            int reverse_i = str.length() - 1 - i;
            /*
            reverse = str.charAt(reverse_i) + "";
            System.out.print(reverse);
            */
            reverse = str.substring(reverse_i, reverse_i + 1);
            System.out.print(reverse);
        }
/*
        char a = 'a';
        String text = a + "";*/
    }
}
