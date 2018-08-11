package ect.inventaireect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FPG extends AppCompatActivity {
    public Button EDB;
    public Button MI;
    public Button AAI;
    public Button LOG;
    public Button MDT;
    public TextView txtView;
    public String passFPG;
    public String passImmo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        passFPG = intent.getStringExtra("classe");
        passImmo = intent.getStringExtra("immo");
        setContentView(R.layout.activity_fpg);
        init();
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                passImmo = data.getStringExtra("editTextValue");
            }
        }
        Intent intent = new Intent();
        intent.putExtra("editTextValue", passImmo);
        setResult(RESULT_OK, intent);
    }

    public void init() {
        EDB = (Button) findViewById(R.id.EDB);
        EDB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(FPG.this, EDBFP.class);
                toy.putExtra("classe", passFPG);
                toy.putExtra("immo", passImmo);

                startActivityForResult(toy, 1);
            }
        });


        MI = (Button) findViewById(R.id.MI);
        MI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(FPG.this, matinf.class);
                toy.putExtra("classe", passFPG);
                toy.putExtra("immo", passImmo);

                startActivityForResult(toy, 1);
            }
        });


        AAI = (Button) findViewById(R.id.AAI);
        AAI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(FPG.this, AAI.class);
                toy.putExtra("classe", passFPG);
                toy.putExtra("immo", passImmo);

                startActivityForResult(toy, 1);

            }
        });


        LOG = (Button) findViewById(R.id.LOG);
        LOG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getBaseContext(), "Catégorie Non Existante", Toast.LENGTH_LONG).show();
            }
        });


        MDT = (Button) findViewById(R.id.MDT);
        MDT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getBaseContext(), "Catégorie Non Existante", Toast.LENGTH_LONG).show();
            }
        });
    }

};

