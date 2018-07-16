package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16039009 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> todoItems;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ToDoItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        todoItems = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);
        ToDoItem currentItem = todoItems.get(position);
        String title = currentItem.getTitle();
        String date = DateFormat.getDateInstance(DateFormat.SHORT).format(currentItem.getDate());
        tvTitle.setText(title);
        tvDate.setText(date);
        return rowView;
    }
}
