package ect.inventaireect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class matinf extends AppCompatActivity {

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
                passFP = "01";
                Intent toy = new Intent(matinf.this,autremi.class);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);
                toy.putExtra("FP",passFP);
                startActivityForResult(toy,1);

            }
        });

        TABMNO = (Button) findViewById(R.id.TABMO);
        TABMNO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "02";
                Intent toy = new Intent(matinf.this,autremi.class);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);
                toy.putExtra("FP",passFP);
                startActivityForResult(toy,1);

            }
        });
        //Haut-Parleur
        PUPI = (Button) findViewById(R.id.PUPI);
        PUPI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "03";
                Intent toy = new Intent(matinf.this,chaie.class);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);
                toy.putExtra("FP",passFP);
                startActivityForResult(toy,1);

            }
        });
        //Clavier
        CHAIE = (Button) findViewById(R.id.CHAIE);
        CHAIE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "04";
                Intent toy = new Intent(matinf.this,chaie.class);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);
                toy.putExtra("FP",passFP);
                startActivityForResult(toy,1);

            }
        });
        //Souris
        CHAIA = (Button) findViewById(R.id.CHAIA);
        CHAIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "05";
                Intent toy = new Intent(matinf.this,chaie.class);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);
                toy.putExtra("FP",passFP);
                startActivityForResult(toy,1);
            }
        });
        //Imprimante et Scanner
        BURPR = (Button) findViewById(R.id.BURPR);
        BURPR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "06";
                Intent toy = new Intent(matinf.this,chaie.class);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);
                toy.putExtra("FP",passFP);
                startActivityForResult(toy,1);

            }
        });
        //tele
        BUT = (Button) findViewById(R.id.BUT);
        BUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "07";
                Intent toy = new Intent(matinf.this,autremi.class);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);
                toy.putExtra("FP",passFP);
                startActivityForResult(toy,1);

            }
        });

        RANM = (Button) findViewById(R.id.RANM);
        RANM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "08";
                Intent toy = new Intent(matinf.this,autremi.class);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);
                toy.putExtra("FP",passFP);
                startActivityForResult(toy,1);

            }
        });

        RANF = (Button) findViewById(R.id.RANF);
        RANF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "09";
                Intent toy = new Intent(matinf.this,autremi.class);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);
                toy.putExtra("FP",passFP);
                startActivityForResult(toy,1);

            }
        });

        PONPO = (Button) findViewById(R.id.FONPO);
        PONPO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "10";
                Intent toy = new Intent(matinf.this,autremi.class);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);
                toy.putExtra("FP",passFP);
                startActivityForResult(toy,1);

            }
        });

        EXTIN = (Button) findViewById(R.id.EXTIN);
        EXTIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passFP = "12";
                Intent toy = new Intent(matinf.this,autremi.class);
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);
                toy.putExtra("FP",passFP);
                startActivityForResult(toy,1);
            }
        });

        AUTRE = (Button) findViewById(R.id.AUTRE);
        AUTRE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(matinf.this,autremi.class);
                passFP = "34";
                toy.putExtra("immo", passImmo);
                toy.putExtra("classe", passEDB);
                toy.putExtra("FP",passFP);
                startActivityForResult(toy,1);

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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        passEDB = intent.getStringExtra("classe");
        passImmo = intent.getStringExtra("immo");
        setContentView(R.layout.activity_matinf);
        init();
    }
}
