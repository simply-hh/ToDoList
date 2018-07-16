package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    ListView lvItem;
    ArrayList<ToDoItem> altodo;
    CustomAdapter catodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvItem = findViewById(R.id.listViewItem);
        altodo = new ArrayList<>();
        Calendar now = Calendar.getInstance();
        now.set(2018, 4, 3);
        ToDoItem item1 = new ToDoItem("MSA", now.getTime());
        now.set(2018, 5, 9);
        ToDoItem item2 = new ToDoItem("Interview", now.getTime());
        altodo.add(item1);
        altodo.add(item2);
        catodo = new CustomAdapter(this, R.layout.todo_item, altodo);
        lvItem.setAdapter(catodo);
    }
}
