package J041;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
    int[] numbers;
    public Lotto(){
        remakeAuto();
    }
    public void printNumbers(){
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    public void remake(){
        numbers = new int[6];
        for(int i = 0; i < numbers.length; i++){
            Scanner sc = new Scanner(System.in);
            while(true){
                int num = sc.nextInt();
                if(isAble(num)){
                    //System.out.println("num : " + num);
                    numbers[i] = num;
                    break;
                } else {
                System.out.println("1~45 이내의 숫자를 중복없이 입력해주세요.");
                }
            }
        }
        sorting();
    }

    public void remakeAuto(){
        numbers = new int[6];
        for(int i = 0; i < numbers.length; i++){
            Random random = new Random();
            while(true){
                int num = random.nextInt(45) + 1; // 1 ~ 45
                if(isAble(num)){
                    //System.out.println("num : " + num);
                    numbers[i] = num;
                    break;
                }
            }
        }
        sorting();
    }
    public boolean isAble(int num){
        if(num < 1 || num > 45){
            return false;
        }
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == num){
                return false;
            }
        }
        return true;
    }
    public void sorting(){
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}
