package J013;

import java.util.Scanner;

public class J013 {
    public static void main(String[] args) {
        J013 ps = new J013();
        ps.j013();
    }
    public void j013(){
        System.out.println("J013");
        int kor, eng, math, total;
        double avg;
        Scanner sc = new Scanner(System.in);
        kor = sc.nextInt();
        eng = sc.nextInt();
        math = sc.nextInt();
        total = kor + eng + math;
        avg = (double) total / 3;

        System.out.println("Average is " + avg);
        System.out.println("Total is " + total);

        checkPassORFail("국어", kor);
        checkPassORFail("영어", eng);
        checkPassORFail("수학", math);
    }
    public void checkPassORFail(String subject, int point){
        if(point >= 70){
            System.out.println(subject + " : PASS!");
        } else {
            System.out.println(subject + " : FAIL!");
        }
    }
}
