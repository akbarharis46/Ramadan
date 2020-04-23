package org.com.ramadan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailFood extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_food);

        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvDeskripsi = findViewById(R.id.tv_item_deskripsi);
        TextView tvResep = findViewById(R.id.tv_item_resep);


        Resep resep = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (resep != null) {
            Glide.with(this)
                    .load(resep.getPhoto())
                    .into(imgItemPhoto);
            tvName.setText(resep.getNama_makanan());
            tvDeskripsi.setText(resep.getDeskripsi_makanan());
            tvResep.setText(resep.getResep());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Daftar Resep Makanan");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;


    }
}
