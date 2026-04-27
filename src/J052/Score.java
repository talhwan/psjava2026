package J052;

import java.util.Scanner;

public class Score {

    public static void main(String[] args) {
        Score score = new Score(5);
        score.getScore();
        score.printScore();
    }


    int count;
    int[][] jumsu;
    int[] sum_student;
    double[] avg_student;

    public Score(int count){
        this.count=count;
        jumsu = new int[count][3];
        sum_student = new int[count];
        avg_student = new double[count];
    }
    public void getScore(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<jumsu.length;i++){
            sum_student[i] = 0;
            for(int j=0;j<jumsu[i].length;j++){
                jumsu[i][j] = sc.nextInt();
                sum_student[i] += jumsu[i][j];
            }
            avg_student[i] = sum_student[i] / 3.0;
        }
    }
    public void printScore(){
        for(int i=0;i<jumsu.length;i++){
            for(int j=0;j<jumsu[i].length;j++){
                System.out.print(jumsu[i][j] + " ");
            }
            System.out.println();
            System.out.print(sum_student[i] + " ");
            System.out.println(avg_student[i]);
            System.out.println(calGrade(avg_student[i]));
        }
    }

    public String calGrade(double tempScore){
        if(tempScore >= 90){
            return "A";
        } else if(tempScore >= 80){
            return "B";
        } else if(tempScore >= 70){
            return "C";
        } else if(tempScore >= 60){
            return "D";
        } else {
            return "F";
        }
    }
}
