package com.example.samajaplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.samajaplication.R;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private MyRecyclerViewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_background);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 7));
        adapter = new MyRecyclerViewAdapter();
        recyclerView.setAdapter(adapter);


    }


    public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {


        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = getLayoutInflater().inflate(R.layout.single_element, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (position / 2 == 0)
                    holder.layout1.setBackgroundColor(getColor(R.color.primaryColour));
            }

        }

        @Override
        public int getItemCount() {
            return 0;
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            RelativeLayout layout1;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);

                layout1 = itemView.findViewById(R.id.view_1);


            }
        }
    }
}