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
import android.widget.ToggleButton;

public class autremi extends AppCompatActivity {

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
    public String passFG;
    public String passEDB;
    public Integer Immoreal;
    public String Catego;
    public String passing;



    public ToggleButton Ancient;
    public ToggleButton seize;
    public ToggleButton sept;
    public ToggleButton encour;


    public void init(){
        Catego = "MI";
        Ancient = (ToggleButton) findViewById(R.id.toggleButton);
        Ancient.setChecked(true);
        encour = (ToggleButton) findViewById(R.id.toggleButton2);
        seize = (ToggleButton) findViewById(R.id.toggleButton3);
        sept = (ToggleButton) findViewById(R.id.toggleButton8);
        Caption = (EditText) findViewById(R.id.editText2);
        meuble = (EditText) findViewById(R.id.editText5);
        Famille = (EditText) findViewById(R.id.editText4);
        Add = (Button) findViewById(R.id.button);
        ID = (TextView)findViewById(R.id.text123);
        remove = (Button)findViewById(R.id.button2);
        remove.setEnabled(false);
        remove.setClickable(false);
        origine = "Ancient";
        Immoreal = Integer.parseInt(passImmo);

        if (passFG.equals("01")){
            Caption.setText("Ordinateur Portable");
        }
        if (passFG.equals("02")){
            Caption.setText("Ordinateur Bureau");
        }
        if (passFG.equals("07")){
            Caption.setText("Téléviseur");
        }
        if (passFG.equals("08")){
            Caption.setText("Vidéoprojecteur");
        }
        if (passFG.equals("09")){
            Caption.setText("Appareil Télécommunication");
        }
        if (passFG.equals("10")){
            Caption.setText("Appareil Réseau");
        }
        if (passFG.equals("11")){
            Caption.setText("Climatiseur");
            Catego = "AAI";
        }
        if (passFG.equals("12")){
            Caption.setText("Tableau Intéractif");
        }



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


        Immo3 = Integer.toString(Immoreal);
        ID.setText("#Immo :" +Immo3);




        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cap_text = Caption.getText().toString().trim()+ " & "+meuble.getText().toString().trim()+" & "+Famille.getText().toString().trim();



                if (cap_text.isEmpty() || cap_text.length() == 0 || cap_text.equals("")|| cap_text.equals("Caption")){
                    Toast.makeText(autremi.this,"Champs Incomplet",Toast.LENGTH_LONG).show();
                }
                else {
                    Cursor res = mydb.getAllData();
                    Immo3 = Integer.toString(Immoreal);
                    Codebarre = passFG+passEDB+Immo3;
                    mydb.insertData(Immoreal,cap_text,Codebarre,Catego,passEDB,passFG,origine);
                    Toast.makeText(autremi.this,"Ajouté",Toast.LENGTH_SHORT).show();
                    StringBuffer buffer = new StringBuffer();
                    StringBuffer buffer1 = new StringBuffer();
                    StringBuffer buffer2 = new StringBuffer();
                    StringBuffer buffer3 = new StringBuffer();
                    StringBuffer buffer4 = new StringBuffer();
                    StringBuffer buffer5 = new StringBuffer();
                    StringBuffer buffer6 = new StringBuffer();
                    res.moveToLast();
                    buffer.append(res.getString(0));
                    buffer1.append(res.getString(1));
                    buffer2.append(res.getString(2));
                    buffer3.append(res.getString(3));
                    buffer4.append(res.getString(4));
                    buffer5.append(res.getString(5));
                    buffer6.append(res.getString(6));
                    ID.setText("Immo Ajouté :" + buffer.toString() + System.getProperty("line.separator") + "Caption :" + buffer1.toString() + System.getProperty("line.separator") + "Code :" + buffer2.toString() + System.getProperty("line.separator") + "Année :" + buffer6.toString());
                    Immoreal ++;
                    remove.setClickable(true);
                    remove.setEnabled(true);
                    passing = Integer.toString(Immoreal);
                    Intent intent = new Intent();
                    intent.putExtra("editTextValue", Immoreal.toString());
                    setResult(RESULT_OK, intent);

                }
            }
        });

        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = mydb.getAllData();
                if (res.getCount()==0){
                    ID.setText("1");
                    Toast.makeText(autremi.this,"Rien à Supprimer",Toast.LENGTH_LONG).show();
                    remove.setEnabled(false);
                    remove.setClickable(false);
                    return;
                }
                else {
                    StringBuffer buffer = new StringBuffer();
                    StringBuffer buffer1 = new StringBuffer();
                    StringBuffer buffer2 = new StringBuffer();
                    StringBuffer buffer3 = new StringBuffer();
                    StringBuffer buffer4 = new StringBuffer();
                    StringBuffer buffer5 = new StringBuffer();
                    StringBuffer buffer6 = new StringBuffer();
                    res.moveToLast();
                    buffer.append(res.getString(0));
                    buffer1.append(res.getString(1));
                    buffer2.append(res.getString(2));
                    buffer3.append(res.getString(3));
                    buffer4.append(res.getString(4));
                    buffer5.append(res.getString(5));
                    buffer6.append(res.getString(6));
                    Integer deleted = Immoreal - 1;
                    Integer deletedrows = mydb.deletedata(deleted.toString());
                    Toast.makeText(autremi.this,"Supprimer",Toast.LENGTH_SHORT).show();
                    Immoreal --;
                    ID.setText("Immo Supprimé :" + buffer.toString() + System.getProperty("line.separator") + "Caption :" + buffer1.toString() + System.getProperty("line.separator") + "Code :" + buffer2.toString() + System.getProperty("line.separator") + "Année :" + buffer6.toString());
                    passing = Integer.toString(Immoreal);
                    Intent intent = new Intent();
                    intent.putExtra("editTextValue", Immoreal.toString());
                    setResult(RESULT_OK, intent);
                }
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_autremi);
        passImmo =  intent.getStringExtra("immo");
        passFG = intent.getStringExtra("FP");
        passEDB = intent.getStringExtra("classe");
        mydb = new DatabaseHelper(this);
        init();
    }
}

