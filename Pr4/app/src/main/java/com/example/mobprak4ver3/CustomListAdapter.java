package com.example.mobprak4ver3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomListAdapter extends ArrayAdapter<ListPart> {
    private final int layout;
    private final LayoutInflater inflater;
    private List<ListPart> items;

    public CustomListAdapter(Context context, int resource, List<ListPart> items) {
        super(context, R.layout.f3_list_item, items);
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
        this.items = items;
    }
    static class ViewHolder {
        TextView title;
        ImageView image;
    }
    public View getView(int position, View convertView,
                        ViewGroup parent) {
        View view=inflater.inflate(this.layout, parent, false);
        TextView textView = view.findViewById(R.id.item_text);
        ImageView imageView = view.findViewById(R.id.item_image);
        ListPart item = items.get(position);
        textView.setText(item.getText());
        imageView.setImageResource(R.mipmap.ava_round);
        return view;
    }
}
