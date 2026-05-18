package J071;

import java.util.List;

public interface Icrud {
    public int create(TodoItem item);
    public TodoItem read(int order);
    public void update(int order, TodoItem item);
    public void delete(int order);
}
