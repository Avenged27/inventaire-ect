package ect.inventaireect;


import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jules on 2017-05-09.
 */

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class autredb extends AppCompatActivity {

        public EditText Caption;
        public EditText meuble;
        public EditText Famille;
        public EditText Emplacement;
        public Button Add;
        public TextView ID;
        public DatabaseHelper mydb;
        public String Codebarre;
        public String Immo;
        public Integer Immo1;
        public Integer Immo2;
        public String Immo3;
        public Button remove;
        public String origine;
        public String passImmo;



    public ToggleButton Ancient;
    public ToggleButton seize;
    public ToggleButton sept;
    public ToggleButton encour;


        public void init(){
            Ancient = (ToggleButton) findViewById(R.id.toggleButton);
            Ancient.setChecked(true);
            encour = (ToggleButton) findViewById(R.id.toggleButton2);
            seize = (ToggleButton) findViewById(R.id.toggleButton3);
            sept = (ToggleButton) findViewById(R.id.toggleButton8);
            Caption = (EditText) findViewById(R.id.editText2);
            meuble = (EditText) findViewById(R.id.editText5);
            Famille = (EditText) findViewById(R.id.editText4);
            Emplacement = (EditText) findViewById(R.id.editText3);
            Add = (Button) findViewById(R.id.button);
            ID = (TextView)findViewById(R.id.text123);
            remove = (Button)findViewById(R.id.button2);
            remove.setEnabled(false);
            remove.setClickable(false);
            origine = "Ancient";


            Ancient.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        encour.setChecked(false);
                        seize.setChecked(false);
                        sept.setChecked(false);
                        origine = "Ancient";

                    } else {
                        // The toggle is disabled
                    }
                }
            });
            encour.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Ancient.setChecked(false);
                        seize.setChecked(false);
                        sept.setChecked(false);
                        origine = "En Cours";

                    } else {
                        // The toggle is disabled
                    }
                }
            });
            seize.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        encour.setChecked(false);
                        Ancient.setChecked(false);
                        sept.setChecked(false);
                        origine = "2016";

                    } else {
                        // The toggle is disabled
                    }
                }
            });
            sept.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        encour.setChecked(false);
                        seize.setChecked(false);
                        Ancient.setChecked(false);
                        origine = "2017";

                    } else {
                        // The toggle is disabled
                    }
                }
            });





            Cursor res = mydb.getAllData();
            if (res.getCount()==0){
                Immo = "0";
                return;
            }
            else {
                StringBuffer buffer = new StringBuffer();
                res.moveToLast();
                buffer.append(res.getString(0));
                Immo = buffer.toString();
            }

            Immo1 = Integer.parseInt(Immo);
            Immo2 = Immo1 + 1;
            Immo3 = Integer.toString(Immo2);
            ID.setText("#Immo :" +Immo3);




            Add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String cap_text = Caption.getText().toString().trim();
                    String meuble_text = meuble.getText().toString().trim();
                    String fam_text = Famille.getText().toString().trim();
                    String emp_text = Emplacement.getText().toString().trim();

                    if (cap_text.isEmpty() || cap_text.length() == 0 || cap_text.equals("")|| cap_text.equals("Caption")){
                        Toast.makeText(autredb.this,"Champs Incomplet",Toast.LENGTH_LONG).show();
                        if (meuble_text.isEmpty() || meuble_text.length() == 0 || meuble_text.equals("")){
                            Toast.makeText(autredb.this,"Champs Incomplet",Toast.LENGTH_LONG).show();
                            if (fam_text.isEmpty() || fam_text.length() == 0 || fam_text.equals("")|| fam_text.equals("Famille Physique")){
                                Toast.makeText(autredb.this,"Champs Incomplet",Toast.LENGTH_LONG).show();
                                if (emp_text.isEmpty() || emp_text.length() == 0 || emp_text.equals("")|| emp_text.equals("Emplacement")){


                                    Toast.makeText(autredb.this,"Champs Incomplet",Toast.LENGTH_LONG).show();}}}


                    } else {
                        Cursor res = mydb.getAllData();
                        if (res.getCount()==0){
                            Immo = "0";
                            return;
                        }
                        else {
                            StringBuffer buffer = new StringBuffer();
                            res.moveToLast();
                            buffer.append(res.getString(0));
                            Immo = buffer.toString();
                        }

                        Immo1 = Integer.parseInt(Immo);
                        Immo2 = Immo1 + 1;
                        Integer Immo4 = Immo1 + 2;
                        String Immo5 = Integer.toString(Immo4);
                        Immo3 = Integer.toString(Immo2);
                        Codebarre = fam_text+emp_text+Immo3;
                        mydb.insertData(Immo1,cap_text,Codebarre,meuble_text,emp_text,fam_text,origine);
                        Toast.makeText(autredb.this,"Ajouté:" + Codebarre,Toast.LENGTH_LONG).show();
                        ID.setText("#Immo :" +Immo5);
                        remove.setClickable(true);
                        remove.setEnabled(true);

                    }
                }
            });

            remove.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Cursor res = mydb.getAllData();
                    if (res.getCount()==0){
                        ID.setText("1");
                        Toast.makeText(autredb.this,"Rien à Supprimer",Toast.LENGTH_LONG).show();
                        remove.setEnabled(false);
                        remove.setClickable(false);
                        return;
                    }
                    else {
                        StringBuffer buffer = new StringBuffer();
                        res.moveToLast();
                        buffer.append(res.getString(0));
                        Integer deletedrows = mydb.deletedata(buffer.toString());
                        Immo = buffer.toString();
                        remove.setEnabled(false);
                        remove.setClickable(false);
                        Toast.makeText(autredb.this,"Immo#:"+ Immo + "Supprimer",Toast.LENGTH_LONG).show();
                    }
                }
            });
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Intent intent = getIntent();
            setContentView(R.layout.activity_autredb);
            passImmo =  intent.getStringExtra("immo");
            mydb = new DatabaseHelper(this);
            init();
        }
    }
