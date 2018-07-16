package sg.edu.rp.c346.todolist;

import java.util.Date;

/**
 * Created by 16039009 on 16/7/2018.
 */

public class ToDoItem {
    private String title;
    private Date date;

    public ToDoItem(String title, Date date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "title='" + title + '\'' +
                ", date=" + date +
                '}';
    }
}
