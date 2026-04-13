package J041;

public class J041 {
    public static void main(String[] args) {
        /*Car acar = new Car();
        Car bcar = new Car();
        String temp = acar.toString();
        System.out.println(temp);
        acar.speedUp();
        bcar.setBrand("HD");
        System.out.println(acar.toString());
        System.out.println(bcar.toString());*/

        J041 j041 = new J041();
        j041.j041();
    }
    public void j041(){
        Lotto lotto = new Lotto();
        lotto.printNumbers();
        lotto.remake();
        lotto.printNumbers();
    }
}
