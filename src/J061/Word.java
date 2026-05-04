package J061;

public class Word {
    private String eng;
    private String meaning;
    private int level;

    public Word(String eng, String meaning, int level) {
        this.eng = eng;
        this.meaning = meaning;
        this.level = level;
    }

    public String getEng() {
        return eng;
    }
    public void setEng(String eng) {
        this.eng = eng;
    }
    public String getMeaning() {
        return meaning;
    }
    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}
