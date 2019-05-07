package com.example.asus.appels800;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView cardView_municipal,cardView_delegation,cardView_medecine,
            cardView_admin,cardView_police,cardView_soin,cardView_pharmacie,cardView_optic;

    TextView municipalitTv,delegationTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        municipalitTv=findViewById(R.id.municip_tv_horizental_scroll);
        municipalitTv.setSelected(true);
        municipalitTv.setText("Municipalité Hammam Sousse");

        delegationTv=findViewById(R.id.deleg_tv_horizental_scroll);
        delegationTv.setSelected(true);
        delegationTv.setText("Consulter la liste des contactes des délégation d'hammam sousse");

        cardView_municipal=findViewById(R.id.municipalitcard);
        cardView_municipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                startActivity(intent);
            }
        });

        cardView_delegation=findViewById(R.id.delegationcard);
        cardView_delegation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                startActivity(intent);
            }
        });
        cardView_medecine=findViewById(R.id.medecinecard);
        cardView_medecine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                startActivity(intent);
            }
        });

        cardView_admin=findViewById(R.id.admincard);
        cardView_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                startActivity(intent);
            }
        });

        cardView_police=findViewById(R.id.policcard);
        cardView_police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                startActivity(intent);
            }
        });

        cardView_soin=findViewById(R.id.etblsm_soin);
        cardView_soin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                startActivity(intent);
            }
        });

        cardView_pharmacie=findViewById(R.id.pharmaciecard);
        cardView_pharmacie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                startActivity(intent);
            }
        });

        cardView_optic=findViewById(R.id.opticcard);
        cardView_optic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                startActivity(intent);
            }
        });


    }
}
