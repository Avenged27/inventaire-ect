package ect.inventaireect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EDBFP extends AppCompatActivity {

    public Button TNIF;
    public Button TABMNO;
    public Button PUPI;
    public Button CHAIE;
    public Button CHAIA;
    public Button BURPR;
    public Button BUT;
    public Button RANM;
    public Button RANF;
    public Button PONPO;
    public Button EXTIN;
    public Button JEUX;
    public Button LIVR;
    public Button MUSI;
    public Button EDUC;
    public Button INFIR;
    public Button CANT;
    public Button LAB;
    public Button MAINT;
    public Button ORG;
    public Button AUTRE;
    public String NUMCLASSESTRING;
    public String passEDB;
    public String passImmo;
    public String passFP;

    public void init() {

        TNIF = (Button) findViewById(R.id.TNIF);
        TNIF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "13";
                Intent toy = new Intent(EDBFP.this, chaie.class);
                toy.putExtra("FP",passFP);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);

                startActivityForResult(toy, 1);

            }
        });

        TABMNO = (Button) findViewById(R.id.TABMO);
        TABMNO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "14";
                Intent toy = new Intent(EDBFP.this, chaie.class);
                toy.putExtra("FP",passFP);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);

                startActivityForResult(toy, 1);

            }
        });

        PUPI = (Button) findViewById(R.id.PUPI);
        PUPI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "15";
                Intent toy = new Intent(EDBFP.this, chaie.class);
                toy.putExtra("FP",passFP);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);

                startActivityForResult(toy, 1);

            }
        });

        CHAIE = (Button) findViewById(R.id.CHAIE);
        CHAIE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "16";
                Intent toy = new Intent(EDBFP.this, chaie.class);
                toy.putExtra("FP",passFP);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);

                startActivityForResult(toy, 1);

            }
        });

        CHAIA = (Button) findViewById(R.id.CHAIA);
        CHAIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "17";
                Intent toy = new Intent(EDBFP.this, chaie.class);
                toy.putExtra("FP",passFP);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);

                startActivityForResult(toy, 1);

            }
        });

        BURPR = (Button) findViewById(R.id.BURPR);
        BURPR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "18";
                Intent toy = new Intent(EDBFP.this, chaie.class);
                toy.putExtra("FP",passFP);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);

                startActivityForResult(toy, 1);

            }
        });

        BUT = (Button) findViewById(R.id.BUT);
        BUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "19";
                Intent toy = new Intent(EDBFP.this, chaie.class);
                toy.putExtra("FP",passFP);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);

                startActivityForResult(toy, 1);

            }
        });

        RANM = (Button) findViewById(R.id.RANM);
        RANM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "20";
                Intent toy = new Intent(EDBFP.this, chaie.class);
                toy.putExtra("FP",passFP);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);

                startActivityForResult(toy, 1);

            }
        });

        RANF = (Button) findViewById(R.id.RANF);
        RANF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "21";
                Intent toy = new Intent(EDBFP.this, chaie.class);
                toy.putExtra("FP",passFP);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);

                startActivityForResult(toy, 1);

            }
        });

        PONPO = (Button) findViewById(R.id.FONPO);
        PONPO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "22";
                Intent toy = new Intent(EDBFP.this, chaie.class);
                toy.putExtra("FP",passFP);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);

                startActivityForResult(toy, 1);

            }
        });

        EXTIN = (Button) findViewById(R.id.EXTIN);
        EXTIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "23";
                Intent toy = new Intent(EDBFP.this, chaie.class);
                toy.putExtra("FP",passFP);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);

                startActivityForResult(toy, 1);

            }
        });

        JEUX = (Button) findViewById(R.id.JEUX);
        JEUX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "24";
                Intent toy = new Intent(EDBFP.this, chaie.class);
                toy.putExtra("FP",passFP);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);

                startActivityForResult(toy, 1);

            }
        });

        LIVR = (Button) findViewById(R.id.LIVR);
        LIVR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "25";
                Intent toy = new Intent(EDBFP.this, chaie.class);
                toy.putExtra("FP",passFP);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);

                startActivityForResult(toy, 1);

            }
        });

        MUSI = (Button) findViewById(R.id.MUSI);
        MUSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "26";
                Intent toy = new Intent(EDBFP.this, chaie.class);
                toy.putExtra("FP",passFP);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);

                startActivityForResult(toy, 1);

            }
        });

        EDUC = (Button) findViewById(R.id.EDUC);
        EDUC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "27";
                Intent toy = new Intent(EDBFP.this, chaie.class);
                toy.putExtra("FP",passFP);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);

                startActivityForResult(toy, 1);

            }
        });

        INFIR = (Button) findViewById(R.id.INFIR);
        INFIR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "28";
                Intent toy = new Intent(EDBFP.this, chaie.class);
                toy.putExtra("FP",passFP);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);

                startActivityForResult(toy, 1);

            }
        });

        CANT = (Button) findViewById(R.id.CANT);
        CANT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "29";
                Intent toy = new Intent(EDBFP.this, chaie.class);
                toy.putExtra("FP",passFP);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);

                startActivityForResult(toy, 1);

            }
        });

        LAB = (Button) findViewById(R.id.LAB);
        LAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "30";
                Intent toy = new Intent(EDBFP.this, chaie.class);
                toy.putExtra("FP",passFP);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);

                startActivityForResult(toy, 1);

            }
        });

        MAINT = (Button) findViewById(R.id.MAINT);
        MAINT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "31";
                Intent toy = new Intent(EDBFP.this, chaie.class);
                toy.putExtra("FP",passFP);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);

                startActivityForResult(toy, 1);

            }
        });

        ORG = (Button) findViewById(R.id.ORG);
        ORG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "32";
                Intent toy = new Intent(EDBFP.this, chaie.class);
                toy.putExtra("FP",passFP);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);

                startActivityForResult(toy, 1);

            }
        });

        AUTRE = (Button) findViewById(R.id.AUTRE);
        AUTRE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "33";
                Intent toy = new Intent(EDBFP.this, autredb.class);
                toy.putExtra("FP",passFP);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);

                startActivityForResult(toy, 1);



            }
        });
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if(resultCode == RESULT_OK) {
                passImmo = data.getStringExtra("editTextValue");
            }
        }
        Intent intent = new Intent();
        intent.putExtra("editTextValue", passImmo);
        setResult(RESULT_OK, intent);
    }



    @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            Intent intent = getIntent();
            passEDB = intent.getStringExtra("classe");
            passImmo = intent.getStringExtra("immo");
            setContentView(R.layout.activity_edbfp);
            init();
        }
    }


