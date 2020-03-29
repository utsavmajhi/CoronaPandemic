package com.creatordev.coronapandemic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.creatordev.coronapandemic.RetrofitAllWorldModel.Getworlddetails;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView allworldcases,allworlddeaths,allworldrecoveries,councases,coundeaths,councritical,counrecovery,counname;
    ImageView counimg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        allworldcases=findViewById(R.id.totcases);
        allworlddeaths=findViewById(R.id.totdeaths);
        allworldrecoveries=findViewById(R.id.totrecovered);
        councases=findViewById(R.id.regiscases);
        coundeaths=findViewById(R.id.deathcases);
        councritical=findViewById(R.id.criticalcases);
        counrecovery=findViewById(R.id.recoveredcases);
        counname=findViewById(R.id.countname);
        counimg=findViewById(R.id.countryflagimg);

        String cname=null;

        //backend starts
        fetchalldetails();
        fetchforcountry(cname);

    }


    //for a partcular country

    private void fetchforcountry(String cname) {


        ApiInterface apiInterface= RetrofitClient.getClient().create(ApiInterface.class);
        //pass the country name
        Call<Getpartcountrydet> call=apiInterface.getcountrydet("India");
        call.enqueue(new Callback<Getpartcountrydet>() {
            @Override
            public void onResponse(Call<Getpartcountrydet> call, Response<Getpartcountrydet> response) {
                if(response.isSuccessful())
                {
                    String flagimgurl=response.body().getCountryInfo().getFlag();
                    String totalcases=response.body().getCases().toString();
                    String totaldeaths=response.body().getDeaths().toString();
                    String totalcritical=response.body().getCritical().toString();
                    String totalrecover=response.body().getRecovered().toString();
                    String countryname=response.body().getCountry();
                    //binding data to ui
                    councases.setText(totalcases);
                    councritical.setText(totalcritical);
                    coundeaths.setText(totaldeaths);
                    counrecovery.setText(totalrecover);
                    counname.setText(countryname);


                    Picasso.with(MainActivity.this).load(flagimgurl).into(counimg);

                }
                else
                {
                    Toast.makeText(MainActivity.this, response.message(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Getpartcountrydet> call, Throwable t) {

            }
        });
    }

    private void fetchalldetails() {

        ApiInterface apiInterface= RetrofitClient.getClient().create(ApiInterface.class);
        Call<Getworlddetails> call=apiInterface.getalldet("123");
        call.enqueue(new Callback<Getworlddetails>() {
            @Override
            public void onResponse(Call<Getworlddetails> call, Response<Getworlddetails> response) {
                if(response.isSuccessful())
                {
                    String totalcases=response.body().getCases().toString();
                    String totaldeaths=response.body().getDeaths().toString();
                    String totrecoveries=response.body().getRecovered().toString();

                    //setting values
                    allworldcases.setText(totalcases);
                    allworlddeaths.setText(totaldeaths);
                    allworldrecoveries.setText(totrecoveries);
                    // done updating the world report
                }
                else
                {
                    Toast.makeText(MainActivity.this, response.message(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Getworlddetails> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();

            }
        });

    }
}
