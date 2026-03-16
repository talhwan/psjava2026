import java.util.Scanner;

public class MainLab01 {
    public static void main(String[] args) {
        MainLab01 mainLab01 = new MainLab01();
        mainLab01.j005();
    }
    void j000(){
        //변수 선언
        int int_a1 = 0;
        // float float_a1 = 0.0f;
        double double_a1 = 0.0;
        char c1 = 'a';
        boolean bool_a1 = false;
        // 문자열
        String string_a1 = ""; //null
    }
    void j001(){
        int height, weight; //신장(cm), 몸무게(kg)
        double bmi; //비만도 수치

        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        weight = sc.nextInt();

        /*
        bmi = 체중(kg) / 신장(m)^2
        * */
        bmi = weight / (height * 0.01 * height * 0.01);
        System.out.println("BMI = " + bmi);
    }
    void j002(){
        double c_degree; // 섭씨
        double h_degree; // 화씨
        //화씨온도 = 1.8 * 섭씨온도  + 32
        Scanner sc = new Scanner(System.in);
        c_degree = sc.nextDouble();
        h_degree = 1.8 * c_degree + 32;
        System.out.println("H = " + h_degree);
    }
    void j005(){
        //2월 28일
        // 1 3 5 7 8 10 12 : 31일
        // 4 6 9 11 : 30일
        int month, day;
        int day_count;
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        day = sc.nextInt();

        day_count = 0;
        for(int i=1;i<month;i++){
            day_count += getDays(i);
        }
        day_count += day;
        System.out.println("Day count = " + day_count);
    }
    int getDays(int month){
        int days = 0;
        switch (month) {
            case 2: days = 28; break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30; break;
            default: days = 31; break;
        }
        return days;
    }
}
