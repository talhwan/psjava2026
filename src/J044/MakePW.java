package J044;

import java.util.UUID;

public class MakePW {

    public static void main(String[] args) {
        MakePW makePW = new MakePW();
        makePW.make(10, 3);
    }

    private String password;

    public MakePW(){
        // make(10);
    }
    // 해당 길이만큼 암호만들기
    public void make(int length){
        UUID uuid = UUID.randomUUID();
        password = uuid.toString().replaceAll("-", "");
        password = password.substring(0, length);
        System.out.println(password);
    }
    public void make(int length, int amount){
        for(int i = 0; i < amount; i++){
            make(length);
        }
    }

    public String getPassword() {
        return password;
    }
}
