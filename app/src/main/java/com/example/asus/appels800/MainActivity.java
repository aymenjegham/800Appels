package com.example.asus.appels800;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView cardView_municipal,cardView_delegation,cardView_medecine,
            cardView_admin,cardView_police,cardView_soin,cardView_pharmacie,cardView_optic,cardView_veterain,cardView_enseign,cardView_enfance,
            cardView_culture,cardView_cultureregional,cardView_justice,cardView_avocat,cardView_huissier,cardView_notaire,cardView_comptabilite,
            cardView_architect, cardView_laposte,cardView_assurance,cardView_bank,cardView_sport,cardView_voyage,cardView_adminregional,
            cardView_transport,cardView_radio,
            cardView_hotel,cardView_park,cardView_urgence;

    TextView municipalitTv,delegationTv,urgenceTv,medecineTv,adminTv,policeTv,soinTv,pharmacieTv,opticTv,veterinTv,enseigneTv,enfanceTv,cultureTv,
    culture_regiTv,justiceTv,avocatTv,huissierTv,notaireTv,comptabiliteTv,architectTv,laposteTv,assuranceTv,bankTv,sportTv,voyageTv,adminregionTv,
    transportTv,radioTv,hotelTv,parkTv;

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

        urgenceTv=findViewById(R.id.urgence_horizental_scroll);
        urgenceTv.setSelected(true);
        urgenceTv.setText("Consulter la liste des contactes d'urgence d'hammam sousse");

        medecineTv=findViewById(R.id.medecine_tv_horizental_scroll);
        medecineTv.setSelected(true);
        medecineTv.setText("Consulter la liste des contactes des médecins d'hammam sousse");

        adminTv=findViewById(R.id.admin_tv_horizental_scroll);
        adminTv.setSelected(true);
        adminTv.setText("Consulter la liste des contactes des administration locales d'hammam sousse");

        policeTv=findViewById(R.id.police_tv_horizental_scroll);
        policeTv.setSelected(true);
        policeTv.setText("Consulter la liste des contactes de la police,garde national et protection civile ");

        soinTv=findViewById(R.id.soin_tv_horizental_scroll);
        soinTv.setSelected(true);
        soinTv.setText("Consulter la liste des contactes des établissements des soins locale,régional et national");

        pharmacieTv=findViewById(R.id.pharmacie_tv_horizental_scroll);
        pharmacieTv.setSelected(true);
        pharmacieTv.setText("Consulter la liste des contactes des pharmacies d'hammam sousse");

        opticTv=findViewById(R.id.optic_horizental_scroll);
        opticTv.setSelected(true);
        opticTv.setText("Consulter la liste des contactes des opticiens d'hammam sousse");

        veterinTv=findViewById(R.id.vétérinaires_tv_horizental_scroll);
        veterinTv.setSelected(true);
        veterinTv.setText("Consulter la liste des contactes des vétérinaires d'hammam sousse");

        enseigneTv=findViewById(R.id.enseignement_horizental_scroll);
        enseigneTv.setSelected(true);
        enseigneTv.setText("Consulter la liste des contactes des établissements d'enseignement et apprentissage d'hammam sousse");

        enfanceTv=findViewById(R.id.enfance_tv_horizental_scroll);
        enfanceTv.setSelected(true);
        enfanceTv.setText("Consulter la liste des contactes des établissement pour l'enfance d'hammam sousse");

        cultureTv=findViewById(R.id.culture_tv_horizental_scroll);
        cultureTv.setSelected(true);
        cultureTv.setText("Culture et jeunesse d'hammam sousse");

        justiceTv=findViewById(R.id.justice_tv_horizental_scroll);
        justiceTv.setSelected(true);
        justiceTv.setText("Consulter la liste des contactes des établissements de la justice");

        avocatTv=findViewById(R.id.avocat_tv_horizental_scroll);
        avocatTv.setSelected(true);
        avocatTv.setText("Consulter la liste des contactes des avocats d'hammam sousse");

        huissierTv=findViewById(R.id.huissier_tv_horizental_scroll);
        huissierTv.setSelected(true);
        huissierTv.setText("Consulter la liste des contactes des huissiers d'hammam sousse");

        notaireTv=findViewById(R.id.notaire_tv_horizental_scroll);
        notaireTv.setSelected(true);
        notaireTv.setText("Consulter la liste des contactes des notaires d'hammam sousse");

        comptabiliteTv=findViewById(R.id.cmptabilite_tv_horizental_scroll);
        comptabiliteTv.setSelected(true);
        comptabiliteTv.setText("Consulter la liste des contactes des comptables d'hammam sousse");

        architectTv=findViewById(R.id.architect_tv_horizental_scroll);
        architectTv.setSelected(true);
        architectTv.setText("Consulter la liste des contactes des architectes d'hammam sousse");

        culture_regiTv=findViewById(R.id.culture_regional_tv_horizental_scroll);
        culture_regiTv.setSelected(true);
        culture_regiTv.setText("Consulter la liste des contactes des établissements culturel régional");

        laposteTv=findViewById(R.id.laposte_tv_horizental_scroll);
        laposteTv.setSelected(true);
        laposteTv.setText("Consulter la liste des contactes des agences de la poste d'hammam sousse");

        assuranceTv=findViewById(R.id.assurance_tv_horizental_scroll);
        assuranceTv.setSelected(true);
        assuranceTv.setText("Consulter la liste des contactes des agences d'assurance d'hammam sousse");

        bankTv=findViewById(R.id.bank_tv_horizental_scroll);
        bankTv.setSelected(true);
        bankTv.setText("Consulter la liste des contactes des agences banquaires d'hammam sousse");

        sportTv=findViewById(R.id.sport_tv_horizental_scroll);
        sportTv.setSelected(true);
        sportTv.setText("Consulter la liste des contactes des association et clubs sportifs d'hammam sousse");

        voyageTv=findViewById(R.id.voyage_tv_horizental_scroll);
        voyageTv.setSelected(true);
        voyageTv.setText("Consulter la liste des contactes des agences de voyage d'hammam sousse");

        adminregionTv=findViewById(R.id.adminregional_tv_horizental_scroll);
        adminregionTv.setSelected(true);
        adminregionTv.setText("Consulter la liste des contactes des administrations régional");

        transportTv=findViewById(R.id.transport_tv_horizental_scroll);
        transportTv.setSelected(true);
        transportTv.setText("Transport,logistique et services divers");

        radioTv=findViewById(R.id.radio_tv_horizental_scroll);
        radioTv.setSelected(true);
        radioTv.setText("Consulter la liste des contactes des radios fm");

        hotelTv=findViewById(R.id.hotels_horizental_scroll);
        hotelTv.setSelected(true);
        hotelTv.setText("Consulter la liste des contactes des hotels et resorts d'hammam sousse");

        parkTv=findViewById(R.id.park_tv_horizental_scroll);
        parkTv.setSelected(true);
        parkTv.setText("Consulter la liste des contactes des parks et attractions d'hammam sousse");

        cardView_municipal=findViewById(R.id.municipalitcard);
        cardView_municipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","Municiplalité");
                startActivity(intent);
            }
        });

        cardView_delegation=findViewById(R.id.delegationcard);
        cardView_delegation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","Délégation");
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
                intent.putExtra("param","Administration Locale");
                startActivity(intent);
            }
        });

        cardView_police=findViewById(R.id.policcard);
        cardView_police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","Police – GARDE Nationale – Protection CIVILE");
                startActivity(intent);
            }
        });

        cardView_soin=findViewById(R.id.etblsm_soin);
        cardView_soin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","Etablissement des Soins Locaux  ");
                startActivity(intent);
            }
        });

        cardView_pharmacie=findViewById(R.id.pharmaciecard);
        cardView_pharmacie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","PHARMACIE");

                startActivity(intent);
            }
        });

        cardView_optic=findViewById(R.id.opticcard);
        cardView_optic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","OPTICIEN");
                startActivity(intent);
            }
        });

        cardView_veterain=findViewById(R.id.veterinairecard);
        cardView_veterain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","Vétérinaire");
                startActivity(intent);
            }
        });

        cardView_enseign=findViewById(R.id.enseignementcard);
        cardView_enseign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","ENSEIGNEMENT & APPRENTISSAGE (LOCAL)");

                startActivity(intent);
            }
        });
        cardView_enfance=findViewById(R.id.enfancecard);
        cardView_enfance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","Enfance & Enseignement (Régional)");
                startActivity(intent);
            }
        });

        cardView_culture=findViewById(R.id.culturecard);
        cardView_culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","Culture & Jeunesse ( local)");
                startActivity(intent);
            }
        });

        cardView_cultureregional=findViewById(R.id.cultureregionalcard);
        cardView_cultureregional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","Etablissement Culturel  Régional");
                startActivity(intent);
            }
        });

        cardView_justice=findViewById(R.id.justicecard);
        cardView_justice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","Justice & Affaires Foncières");
                startActivity(intent);
            }
        });
        cardView_avocat=findViewById(R.id.avocatcard);
        cardView_avocat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","AVOCATS");
                startActivity(intent);
            }
        });

        cardView_huissier=findViewById(R.id.huissiercard);
        cardView_huissier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","Huissiers");
                startActivity(intent);
            }
        });

        cardView_notaire=findViewById(R.id.Notairecard);
        cardView_notaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","Notaires");

                startActivity(intent);
            }
        });

        cardView_comptabilite=findViewById(R.id.comptabilitecard);
        cardView_comptabilite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","Comptabilité");
                startActivity(intent);
            }
        });
        cardView_architect=findViewById(R.id.architectcard);
        cardView_architect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","");
                startActivity(intent);
            }
        });

        cardView_laposte=findViewById(R.id.lapostecard);
        cardView_laposte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","La Poste");
                startActivity(intent);
            }
        });

        cardView_assurance=findViewById(R.id.assurancecard);
        cardView_assurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","Assurances");
                startActivity(intent);
            }
        });

        cardView_bank=findViewById(R.id.bankecard);
        cardView_bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","BANK");
                startActivity(intent);
            }
        });
        cardView_sport=findViewById(R.id.sportcard);
        cardView_sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","Sports & Associations");
                startActivity(intent);
            }
        });

        cardView_voyage=findViewById(R.id.voyagecard);
        cardView_voyage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","Agence de Voyage");
                startActivity(intent);
            }
        });

        cardView_adminregional=findViewById(R.id.adminregionalcard);
        cardView_adminregional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","Administrations Régionales");
                startActivity(intent);
            }
        });

        cardView_transport=findViewById(R.id.transportcard);
        cardView_transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","Transport");

                startActivity(intent);
            }
        });
        cardView_radio=findViewById(R.id.radiocard);
        cardView_radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","Station Radio FM");

                startActivity(intent);
            }
        });

        cardView_hotel=findViewById(R.id.hotelscard);
        cardView_hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","Hotels");

                startActivity(intent);
            }
        });

        cardView_park=findViewById(R.id.parkcard);
        cardView_park.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","Attraction & Loisirs");

                startActivity(intent);
            }
        });

        cardView_urgence=findViewById(R.id.uregencecard);
        cardView_urgence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,NotMainActivity.class);
                intent.putExtra("param","Station Radio FM");

                startActivity(intent);
            }
        });

    }
}
