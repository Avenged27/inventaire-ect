package ect.inventaireect;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Environment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class first extends AppCompatActivity {

    public Button butstart;
    public EditText NUMCLASSE;
    public DatabaseHelper mydb;
    public Button btnviewAll;
    public Button buttonexp;
    public Button btnc;
    public Button btns;
    public EditText ets;
    public String Immo;
    public Boolean Fake;
    public Integer Ska;
    public Button but4;

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if(resultCode == RESULT_OK) {
                Immo = data.getStringExtra("editTextValue");
            }
        }
    }

    public void init(){
        butstart= (Button)findViewById(R.id.buttonstart);
        NUMCLASSE= (EditText)findViewById(R.id.editText);
        btnviewAll= (Button)findViewById(R.id.buttond);
        btnc= (Button)findViewById(R.id.buttonc);
        btns= (Button)findViewById(R.id.buttons);
        ets= (EditText)findViewById(R.id.ets);
        but4 = (Button)findViewById(R.id.button4);
        Fake = false;

        //Setting Immo to last entry + 1
        Cursor res = mydb.getAllData();
        StringBuffer buffer = new StringBuffer();
        res.moveToLast();
        if (res.getCount()==0) {
            Immo = "1";
        }
        else {
            buffer.append(res.getString(0));
            Immo = buffer.toString();
            Ska = Integer.parseInt(Immo);
            Ska++;
            Immo = Integer.toString(Ska);
        }

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(first.this,delete.class);
                startActivityForResult(toy, 1);
            }
        });


        butstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(first.this,FPG.class);
                String ed_text = NUMCLASSE.getText().toString().trim();

                if (ed_text.isEmpty() || ed_text.length() == 0 || ed_text.equals("")) {
                    Toast.makeText(first.this,"Le Numéro de la Classe est requis pour débuter",Toast.LENGTH_LONG).show();
                    //"Le Numéro de la Classe est requis pour débuter"


                } else {
                    toy.putExtra("classe", ed_text);
                    toy.putExtra("immo", Immo);
                    Fake = false;
                    startActivityForResult(toy, 1);

                }
            }
        });
    }
    public void setimmo(){
        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String setimmo = ets.getText().toString().trim();
                if (setimmo.matches(""))
                {
                    Toast.makeText(first.this,"Entrer # Immo",Toast.LENGTH_LONG).show();
                }
                else {
                    Immo = setimmo;
                    Fake = true;
                }

            }
        });

    }
    public void createtable(){

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(first.this)
                        .setTitle("Confirmation")
                        .setMessage("Effacer la table actuelle?")
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int whichButton) {
                                Toast.makeText(first.this, "Nouvelle Table Crée", Toast.LENGTH_SHORT).show();
                                mydb.deleteAll();
                                Immo = "1";
                                Fake = false;
                            }})
                        .setNegativeButton(android.R.string.no, null).show();

            }
        });

    }




    public void viewAll(){
        btnviewAll.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (Fake == false) {
                            if (Immo == "1") {
                                Toast.makeText(first.this, "Base de Donnée Vide", Toast.LENGTH_SHORT).show();
                            }
                            else {
                                Cursor res = mydb.getAllData();
                                StringBuffer buffer = new StringBuffer();
                                res.moveToLast();
                                buffer.append(res.getString(0));
                                Immo = buffer.toString();
                                Ska = Integer.parseInt(Immo);


                                Ska ++;
                                Immo = Integer.toString(Ska);
                                    Toast.makeText(first.this, "# Immo :"+Immo, Toast.LENGTH_SHORT).show();
                                    return;
                                }

                            }

                        else {
                            Toast.makeText(first.this, "# Immo :" +Immo, Toast.LENGTH_SHORT).show();
                        }
                    }
                }

        );
    }

    public void exportDatabase(){
        buttonexp = (Button)findViewById(R.id.buttonsd);
        buttonexp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    File backupDB = Environment.getExternalStorageDirectory(); // for example "my_data_backup.db"
                    File currentDB = getApplicationContext().getDatabasePath("inventaire.db");
                    Toast.makeText(getApplicationContext(), backupDB.toString(), Toast.LENGTH_LONG).show();//databaseName=your current application database name, for example "my_data.db"
                    if (currentDB.exists()) {
                        FileChannel src = new FileInputStream(currentDB).getChannel();
                        FileChannel dst = new FileOutputStream(backupDB).getChannel();
                        dst.transferFrom(src, 0, src.size());
                        src.close();
                        dst.close();
                        Toast.makeText(getApplicationContext(), "Backup Success!", Toast.LENGTH_SHORT).show();
                    }
                }catch (Exception e) {

                    Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_LONG).show();

                }

            }
//                 try {
//                     mydb.exportDatabase();
//                 } catch (IOException e) {
//                     e.printStackTrace();
//                 }

        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        mydb = new DatabaseHelper(this);
        init();
        viewAll();
        exportDatabase();
        createtable();
        setimmo();
    }
}