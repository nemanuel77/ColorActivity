package temple.edu;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import android.content.Context;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ColorAdapter extends BaseAdapter {

    Context context;
    //ArrayList<String> colors;
    String[] colors;

    //initial constructor
    public ColorAdapter(Context context, String[] colors) {
        this.context = context;
        this.colors = colors;

    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        TextView textView = new TextView(context);


        //set value to textview objects
        textView.setText(colors[position]);
        textView.setBackgroundColor(Color.parseColor(colors[position]));

        return textView;
    }

    @Override
    public View getDropDownView(int position, View view, ViewGroup parent) {
        TextView txtView = new TextView(context);

        return super.getDropDownView(position, txtView, parent);
    }




}




