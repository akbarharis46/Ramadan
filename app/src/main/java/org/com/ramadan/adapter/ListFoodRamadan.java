package org.com.ramadan.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.com.ramadan.R;
import org.com.ramadan.Resep;

import java.util.ArrayList;

public class ListFoodRamadan extends RecyclerView.Adapter<ListFoodRamadan.ListViewHolder> {
    private final ArrayList<Resep> listresep;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListFoodRamadan(ArrayList<Resep> list) {
        this.listresep = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //3 menghubungkan layout item contact ke adapter
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ryclefood, viewGroup, false);
        return new ListViewHolder(view);
    }
    //7 menghubungkan id ke data
    @Override
    public void onBindViewHolder(@NonNull ListViewHolder listViewHolder, int i) {
        final Resep resep = listresep.get(i);

        Glide.with(listViewHolder.itemView.getContext())
                .load(resep.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(listViewHolder.imgPhoto);

        listViewHolder.tvName.setText(resep.getNama_makanan());
        listViewHolder.tvDetail.setText(resep.getDeskripsi_makanan());

        listViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(resep);
            }
        });
    }

    @Override
    //mengembalikan jumlahdata
    public int getItemCount() {
        return listresep.size();
    }
    //5 membuat variabel di view holder
    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
