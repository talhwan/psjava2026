package J071;

import java.time.LocalDate;

public class TodoItem {
    String title;
    String content;
    LocalDate date;

    public TodoItem(String title, String content, LocalDate date){
        this.title = title;
        this.content = content;
        this.date = date;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
