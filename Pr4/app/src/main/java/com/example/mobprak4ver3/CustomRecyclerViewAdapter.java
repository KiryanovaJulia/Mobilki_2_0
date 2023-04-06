package com.example.mobprak4ver3;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomRecyclerViewAdapter.ViewHolder>
{


    private final LayoutInflater inflater;
    private final List<ListPart> items;

    public CustomRecyclerViewAdapter(Context context, List<ListPart>
            items) {
        this.items = items;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public CustomRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.f3_list_item, parent,
                false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull CustomRecyclerViewAdapter.ViewHolder holder, int position) {

        ListPart item = items.get(position);
        holder.itemText.setText(item.getText());
        holder.itemImage.setImageResource(R.mipmap.ava_round);
        holder.itemView.setOnClickListener((layout) -> {
            Log.i("TAG", "Element " + position + " clicked");
            Toast.makeText(inflater.getContext(), "Element " + position + " clicked", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends
            RecyclerView.ViewHolder {
        TextView itemText;
        ImageView itemImage;
        ViewHolder(View view){
            super(view);
            itemText = view.findViewById(R.id.item_text);
            itemImage = view.findViewById(R.id.item_image);
        } }
}
