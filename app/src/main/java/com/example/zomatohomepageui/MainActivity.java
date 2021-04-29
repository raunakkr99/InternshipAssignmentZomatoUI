package com.example.zomatohomepageui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.zomatohomepageui.adapter.AsiaFoodAdapter;
import com.example.zomatohomepageui.adapter.PopularFoodAdapter;
import com.example.zomatohomepageui.model.AsiaFood;
import com.example.zomatohomepageui.model.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView popularRecycler, asiaRecycler;
    PopularFoodAdapter popularFoodAdapter;
    AsiaFoodAdapter asiaFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        List<PopularFood> popularFoodList = new ArrayList<>();

        popularFoodList.add(new PopularFood("Float Cake Vietnam", "Rs.150", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Chiken Drumstick", "Rs.250", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Fish Tikka Stick", "Rs.500", R.drawable.popularfood3));
        popularFoodList.add(new PopularFood("Float Cake Vietnam", "Rs.150", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Chiken Drumstick", "Rs.250", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Fish Tikka Stick", "Rs.500", R.drawable.popularfood3));

        setPopularRecycler(popularFoodList);


        List<AsiaFood> asiaFoodList = new ArrayList<>();
        asiaFoodList.add(new AsiaFood("Chicago Pizza", "Rs.400", R.drawable.asiafood1, "4.5", "Briand Restaurant"));
        asiaFoodList.add(new AsiaFood("Straberry Cake", "Rs.500", R.drawable.asiafood2, "4.2", "Friends Restaurant"));
        asiaFoodList.add(new AsiaFood("Chicago Pizza", "Rs.400", R.drawable.asiafood1, "4.5", "Briand Restaurant"));
        asiaFoodList.add(new AsiaFood("Straberry Cake", "Rs.500", R.drawable.asiafood2, "4.2", "Friends Restaurant"));
        asiaFoodList.add(new AsiaFood("Chicago Pizza", "Rs.400", R.drawable.asiafood1, "4.5", "Briand Restaurant"));
        asiaFoodList.add(new AsiaFood("Straberry Cake", "Rs.500", R.drawable.asiafood2, "4.2", "Friends Restaurant"));

        setAsiaRecycler(asiaFoodList);

    }


    private void setPopularRecycler(List<PopularFood> popularFoodList) {

        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);

    }

    private void setAsiaRecycler(List<AsiaFood> asiaFoodList) {

        asiaRecycler = findViewById(R.id.asia_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        asiaRecycler.setLayoutManager(layoutManager);
        asiaFoodAdapter = new AsiaFoodAdapter(this, asiaFoodList);
        asiaRecycler.setAdapter(asiaFoodAdapter);

    }
}