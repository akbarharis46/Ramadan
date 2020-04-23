package org.com.ramadan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import org.com.ramadan.adapter.ListFoodRamadan;
import org.com.ramadan.adapter.OnItemClickCallback;

import java.util.ArrayList;

public class HalamanAwal extends AppCompatActivity {
    Button button;
    private RecyclerView ryclefood;
    private ArrayList<Resep> list = new ArrayList<>();


    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_awal);
        button = findViewById(R.id.button);
        ryclefood = findViewById(R.id.ryclefood);
        ryclefood.setHasFixedSize(true);


        list.addAll(DataResep.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        ryclefood.setLayoutManager(new LinearLayoutManager(this));
        ListFoodRamadan listGameAdapter = new ListFoodRamadan(list);
        ryclefood.setAdapter(listGameAdapter);

        listGameAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Resep resep) {
                Intent moveIntent1 = new Intent(HalamanAwal.this, DetailFood.class);
                moveIntent1.putExtra(DetailFood.ITEM_EXTRA, resep);
                startActivity(moveIntent1);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
