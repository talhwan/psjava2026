package J071;

import java.util.ArrayList;
import java.util.List;

public class TodoCrud implements Icrud{

    List<TodoItem> list = new ArrayList<>();


    @Override
    public int create(TodoItem item) {
        return 0;
    }

    @Override
    public TodoItem read(int order) {
        return null;
    }

    @Override
    public void update(int order, TodoItem item) {

    }

    @Override
    public void delete(int order) {

    }
}
