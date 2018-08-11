package ect.inventaireect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AAI extends AppCompatActivity {

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
                passFP = "33";
                Intent toy = new Intent(AAI.this,chaie.class);
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
                passFP = "11";
                Intent toy = new Intent(AAI.this,autremi.class);
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
        setContentView(R.layout.activity_aai);
        init();
    }
}