package J024;

import java.util.Scanner;

public class J024 {
    public static void main(String[] args) {
        J024 j024 = new J024();
        j024.j024();
    }
    public void j024() {
        System.out.println("j024!!");
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];   // 10개의 숫자
        int first;                    // 첫 번째로 큰 수
        int second;                   // 두 번째로 큰 수
        int second_max_index = -1;    // 두 번째로 큰 수의 인덱스

        // 입력 받기
        System.out.println("10개의 숫자를 입력하세요:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        // 초기값 설정
        first = Integer.MIN_VALUE;
        second = Integer.MIN_VALUE;

        // 최대값과 두 번째 최대값 찾기
        for (int i = 0; i < 10; i++) {
            if (numbers[i] > first) {
                second = first;
                first = numbers[i];
            } else if (numbers[i] > second && numbers[i] != first) {
                second = numbers[i];
            }
        }

        // 결과 출력
        System.out.println("두 번째로 큰 수: " + second);
        System.out.println("인덱스: " + second_max_index);

        sc.close();
    }
}
