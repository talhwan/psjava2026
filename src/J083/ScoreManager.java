package J083;

import java.io.File;
import java.io.FileOutputStream;
import java.util.*;

public class ScoreManager {

    public static void main(String[] args) {
        ScoreManager sm = new ScoreManager();
        System.out.println(sm);
        Map<String, Object> tempPoint = sm.getPointBySubject(1);
        System.out.println(tempPoint.get("sum"));
        System.out.println(tempPoint.get("avg"));

        Score score = sm.getTopScore();
        System.out.println(score.getName() + " : " + score.getAvg());

    }

    List<Score> scores = null;
    public ScoreManager() {
        init();
    }
    public void init(){
        scores = new ArrayList<>();
        in();
    }
    public void addScore(Score s){
        for(Score score: scores){
            if(score.name.equals(s.name)){
                s.setName(score.name + "!");
            }
        }
        scores.add(s);
        out();
    }
    public Score getScore(String name){
        for(Score score: scores){
            if(score.name.equals(name)){
                return score;
            }
        }
        return null;
    }
    public void removeScore(String name){
        for(Score score: scores){
            if(score.name.equals(name)){
                scores.remove(score);
            }
        }
        out();
    }
    public Map<String, Object> getPointBySubject(int subjectType){
        int sum = 0;
        double avg = 0.0;
        for(Score score: scores){
            int tempScore = 0;
            switch (subjectType){
                case 1: tempScore = score.getKor(); break;
                case 2: tempScore = score.getEng(); break;
                case 3: tempScore = score.getMat(); break;
                default: tempScore = score.getKor(); break;
            }
            sum += tempScore;
        }
        avg = (double) sum / scores.size();
        Map<String, Object> map = new HashMap<>();
        map.put("avg", avg);
        map.put("sum", sum);
        return map;
    }

    public Score getTopScore(){
        Score returnScore = null;
        int bestScore = 0;
        for(Score score: scores){
            if(score.getSum() >= bestScore){
                bestScore = score.getSum();
                returnScore = score;
            }
        }
        return returnScore;
    }

    public String toString(){
        String s = "";
        for(Score score: scores){
            s += score.name + " " + score.kor + " " + score.eng + " " + score.mat + "\n";
        }
        return s;
    }

    public void out() {
        try {
            String text = toString();
            FileOutputStream fileOutputStream = new FileOutputStream("./src/J083/j083.txt");
            byte b[] = text.getBytes();
            fileOutputStream.write(b);
            fileOutputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void in() {
        try{
            File file = new File("./src/J083/j083.txt");
            Scanner scanner = new Scanner(file);
            int order = 0;
            while (scanner.hasNextLine()) {
                //System.out.println("data order : " + order++);
                String line = scanner.nextLine();
                //System.out.println(line);
                String[] split = line.split(" ");
                String name = split[0];
                int kor = Integer.parseInt(split[1]);
                int eng = Integer.parseInt(split[2]);
                int mat = Integer.parseInt(split[3]);
                Score score = new Score(name, kor, eng, mat);
                scores.add(score);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
