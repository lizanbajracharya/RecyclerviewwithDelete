package com.example.recyclerviewwithdelete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    ImageView imgPhoto;
    TextView tvNames,tvAges,tvGenders,tvAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);

        imgPhoto=findViewById(R.id.imgPhoto);
        tvNames=findViewById(R.id.tvNames);
        tvAges=findViewById(R.id.tvAges);
        tvGenders=findViewById(R.id.tvGenders);
        tvAddress=findViewById(R.id.tvAddress);

        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){
            imgPhoto.setImageResource(bundle.getInt("Image"));
            tvNames.setText(bundle.getString("name"));
            tvAges.setText(bundle.getString("age"));
            tvGenders.setText(bundle.getString("gender"));
            tvAddress.setText(bundle.getString("location"));
        }
    }
}
