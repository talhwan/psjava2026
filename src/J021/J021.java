package J021;

import java.util.Scanner;

public class J021 {
    public static void main(String[] args) {
        J021 ps = new J021();
        ps.j021();
    }
    public void j021(){
        int height, weight;
        double bmi;
        int people = 0;

        int number;
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        //1 for문을 이용하여 판단
        /*
        for(int i=0;i<number;i++){
            height = in.nextInt();
            weight = in.nextInt();
            bmi = weight / (height * 0.01 * height * 0.01);
            if(bmi >= 25){
                people++;
            }
        }
        System.out.println("People : " + people);
        */

        /*
        // 배열을 활용해서 계산
        int[] heights = new int[number];
        int[] weights = new int[number];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = in.nextInt();
            weights[i] = in.nextInt();
            height = heights[i];
            weight = weights[i];
            bmi = weight / (height * 0.01 * height * 0.01);
            if(bmi >= 25){
                people++;
            }
        }
        System.out.println("People : " + people);
         */

        // 2차원 배열 활용
        /*int[][] whs = new int[number][2];
        for (int i = 0; i < whs.length; i++) {
            for (int j = 0; j < whs[i].length; j++) {
                whs[i][j] = in.nextInt(); //height, weight
            }
            height = whs[i][0];
            weight = whs[i][1];
            bmi = weight / (height * 0.01 * height * 0.01);
            if(bmi >= 25){
                people++;
            }
        }
        System.out.println("People : " + people);*/

        int[][] whs = new int[number][3];
        for (int i = 0; i < whs.length; i++) {
            //System.out.println("i : " + i);
            for (int j = 0; j < 2; j++) {
                whs[i][j] = in.nextInt();
            }
            bmi = whs[i][1] / (whs[i][0] * 0.01 * whs[i][0] * 0.01);
            if(bmi >= 25){
                people++;
                whs[i][2] = 1;
            }
        }
        System.out.println("People : " + people);
        for (int i = 0; i < whs.length; i++) {
            System.out.println(i + ") fat : " + whs[i][2] + " ");
        }
    }
}
