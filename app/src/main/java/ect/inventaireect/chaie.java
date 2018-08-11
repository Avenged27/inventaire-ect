package ect.inventaireect;

import android.content.Intent;
import android.database.Cursor;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class chaie extends AppCompatActivity {
    public Button btn1;
    public String Count1;
    public Button MTMB;
    public Button btn2;
    public Button btn3;
    public TextView TLCOUNT;
    public Button btn4;
    public Button MTF;
    public TextView TFCOUNT;
    public Button PTA;
    public Button MTA;
    public TextView TACOUNT;
    public DatabaseHelper mydb;
    public String passEDB;
    public String passImmo;
    public String passFP;
    public String T4;
    public String T1;
    public String T2;
    public String T3;
    public String FP;
    public String Catego;
    public String Codebarre;
    public String Immo;
    public Integer Immo1;
    public Integer Immo2;
    public String Immo3;
    public String Immo4;
    private static Toast address;
    public String CodebarreDel;
    public Integer Fix;
    public Integer Immoreal;
    public String fuck;
    public ToggleButton Ancient;
    public ToggleButton seize;
    public ToggleButton sept;
    public ToggleButton encour;
    public String Origine;
    public String Count2;
    public String Count3;
    public String Count4;
    public TextView deleterow;
    public Button delete;
    public TextView def;
    public Integer intcount4Value;
    public Integer intcount3Value;
    public Integer intcount2Value;
    public Integer intcount1Value;
    public String B2;
    public Integer Countall;
    public TextView V1;
    public TextView V2;
    public TextView V3;
    public TextView V4;
    public String passing;








    public void AddData() {

        V1 = (TextView) findViewById(R.id.textView2);
        V2 = (TextView) findViewById(R.id.textView3);
        V3 = (TextView) findViewById(R.id.textView4);
        V4 = (TextView) findViewById(R.id.textView5);

        if (passFP.equals("04")) {
            T1 = "Clavier DELL";
            T2 = "Clavier ASUS";
            T3 = "Clavier LENOVO";
            T4 = "Clavier Autre";
            FP = "04";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MI";
        }
        if (passFP.equals("05")) {
            T1 = "Souris DELL";
            T2 = "Souris ASUS";
            T3 = "Souris LENOVO";
            T4 = "Souris Autre";
            FP = "05";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MI";
        }
        if (passFP.equals("03")) {
            T1 = "Haut-Parleur Portable";
            T2 = "Haut-Parleur Ordinateur";
            T3 = "Radio/CD";
            T4 = "Haut-Parleur Autre";
            FP = "03";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MI";
        }
        if (passFP.equals("06")) {
            T1 = "Imprimante Petite";
            T2 = "Impriante Grande";
            T3 = "Scanner";
            T4 = "Imprimante 3D";
            FP = "06";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MI";
        }
        if (passFP.equals("13")) {
            T1 = "Tableau Magnétique Blanc";
            T2 = "Tableau Ardoise Fixe";
            T3 = "Tableau Liège Fixe";
            T4 = "Tableau Feutre Fixe";
            FP = "13";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MMB";
        }
        if (passFP.equals("14")) {
            T1 = "Grand Tableau Blanc Mobile";
            T2 = "Petit Tableau Blanc Mobile";
            T3 = "Tableau Feûtre ou Liège Mobile";
            T4 = "Tableau Ardoise Mobile";
            FP = "14";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MMB";
        }

        if (passFP.equals("15")) {
            T1 = "Pupitre Maternelle";
            T2 = "Pupitre PreSchool";
            T3 = "Pupitre Primaire";
            T4 = "Pupitre Secondaire";
            FP = "15";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MMB";
        }
        if (passFP.equals("16")) {
            T1 = "Chaise Maternelle";
            T2 = "Chaise PreSchool";
            T3 = "Chaise Primaire";
            T4 = "Chaise Secondaire";
            FP = "16";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MMB";
        }
        if (passFP.equals("17")) {
            T1 = "Chaise Prof Cuir Roulette";
            T2 = "Chaise Prof Cuir";
            T3 = "Chaise Prof Bois";
            T4 = "Chaise Prof Autre";
            FP = "17";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MMB";
        }
        if (passFP.equals("18")) {
            T1 = "Bureau Prof Bois";
            T2 = "Bureau Prof Plastique";
            T3 = "Bureau Prof Métal";
            T4 = "Bureau Prof Autre";
            FP = "18";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MMB";
        }
        if (passFP.equals("19")) {
            T1 = "Table Travail Classe";
            T2 = "Table Cantine Secondaire";
            T3 = "Table Cantine Primaire PreSCH";
            T4 = "Table Cantine Maternelle";
            FP = "19";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MMB";
        }
        if (passFP.equals("20")) {
            T1 = "Rangement Mobile Portes";
            T2 = "Rangement Mobile 1-6 Cases";
            T3 = "Rangement Mobile 7+ Cases";
            T4 = "Rangement Mobile Tablettes";
            FP = "20";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MMB";
        }
        if (passFP.equals("21")) {
            T1 = "Rangement Fixe Mural Cases";
            T2 = "Rangement Fixe Mural Tablettes";
            T3 = "Armoire Fixe";
            T4 = "Rangement Fixe Autre";
            FP = "21";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MMB";
        }
        if (passFP.equals("22")) {
            T1 = "Fontaine d'eau Portable Cantine";
            T2 = "Fontaine d'eau Portable Secondaire";
            T3 = "Fontaine d'eau Portable Primaire";
            T4 = "Fontaine d'eau Portable Maternelle / PreSchool";
            FP = "22";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MMB";
        }
        if (passFP.equals("23")) {
            T1 = "Extincteur Mural Secondaire";
            T2 = "Extincteur Mural Primaire";
            T3 = "Extincteur Mural Maternelle / PreSchool";
            T4 = "Extincteur Mural Autre";
            FP = "23";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MMB";
        }
        if (passFP.equals("24")) {
            T1 = "Jeux PreSchool";
            T2 = "Jeux Service de Garde";
            T3 = "Jeux Maternelle";
            T4 = "Jeux Primaire Secondaire";
            FP = "24";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MMB";
        }
        if (passFP.equals("25")) {
            T1 = "Livre Scolaire";
            T2 = "Roman";
            T3 = "Dictionnaire";
            T4 = "Encyclopédie";
            FP = "25";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MMB";
        }
        if (passFP.equals("26")) {
            T1 = "Piano";
            T2 = "Lutrin";
            T3 = "Estrade Bois";
            T4 = "Autre Instrument";
            FP = "26";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MMB";
        }
        if (passFP.equals("27")) {
            T1 = "Mobile Mural";
            T2 = "Ballon";
            T3 = "Tapis";
            T4 = "Autre Équipement Éducation Physique";
            FP = "27";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MMB";
        }
        if (passFP.equals("28")) {
            T1 = "Lit d'Infirmerie";
            T2 = "Trousse de Premier Soin";
            T3 = "Équipement Médicale";
            T4 = "Autre Équipement";
            FP = "28";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MMB";
        }
        if (passFP.equals("29")) {
            T1 = "Micro-Onde";
            T2 = "Rangement Pour Plateaux";
            T3 = "Buffet";
            T4 = "Autre Équipement Cantine";
            FP = "29";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MMB";
        }
        if (passFP.equals("30")) {
            T1 = "Tabouret";
            T2 = "Tables Labo";
            T3 = "Station Scientifique";
            T4 = "Rapprochement Avec la Liste D'équipement Pour labo";
            FP = "30";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MMB";
        }
        if (passFP.equals("31")) {
            T1 = "Balai";
            T2 = "Serpierre";
            T3 = "Sceaux";
            T4 = "Autre Équipement de Maintenance";
            FP = "31";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MMB";
        }
        if (passFP.equals("33")) {
            T1 = "Rideau 0M-0.6M";
            T2 = "Rideau 0.6M-1.3M";
            T3 = "Rideau 1.3M-2M";
            T4 = "Rideau 2M+";
            FP = "33";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "AAI";
        }
        if (passFP.equals("32")) {
            T1 = "Multiprise";
            T2 = "Corbeille";
            T3 = "Horloge";
            T4 = "Autre Équipement D'Organisation";
            FP = "32";
            V1.setText(T1);
            V2.setText(T2);
            V3.setText(T3);
            V4.setText(T4);
            Catego = "MMB";
        }



        Origine = "Ancient";
        Fix = 0;
        Immo4 = "A";
        fuck = passImmo;
        Immoreal = Integer.parseInt(fuck);
        Count1 = "0";
        Count2 = "0";
        Count3 = "0";
        Count4 = "0";
        intcount4Value = 0;
        intcount1Value = 0;
        intcount2Value = 0;
        intcount3Value = 0;


        Ancient = (ToggleButton) findViewById(R.id.toggleButton6);
        Ancient.setChecked(true);
        encour = (ToggleButton) findViewById(R.id.toggleButton7);
        seize = (ToggleButton) findViewById(R.id.toggleButton4);
        sept = (ToggleButton) findViewById(R.id.toggleButton5);
        btn1 = (Button) findViewById(R.id.PTMB);
        btn2 = (Button) findViewById(R.id.PTL);
        btn3 = (Button) findViewById(R.id.PTF);
        btn4 = (Button) findViewById(R.id.PTA);
        deleterow = (TextView) findViewById(R.id.textView6);
        delete = (Button) findViewById(R.id.MTMB);
        def = (TextView) findViewById(R.id.textView7);

        Ancient.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    encour.setChecked(false);
                    seize.setChecked(false);
                    sept.setChecked(false);
                    Origine = "Ancient";

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
                    Origine = "En Cours";

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
                    Origine = "2016";

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
                    Origine = "2017";

                } else {
                    // The toggle is disabled
                }
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intcount1Value = Integer.parseInt(Count1);

                intcount1Value++;

                Count1 = Integer.toString(intcount1Value);

                btn1.setText(Count1);

                Immo3 = Integer.toString(Immoreal);
                Codebarre = FP + passEDB + Immo3;
                mydb.insertData(Immoreal, T1, Codebarre, Catego, passEDB, FP, Origine);
                if (address != null)
                    address.cancel();

                address = Toast.makeText(getBaseContext(), "Ajouté: " + Codebarre, Toast.LENGTH_LONG);
                address.show();
                Cursor res = mydb.getAllData();
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
                deleterow.setText("Immo :" + buffer.toString() + System.getProperty("line.separator") + "Caption :" + buffer1.toString() + System.getProperty("line.separator") + "Code :" + buffer2.toString() + System.getProperty("line.separator") + "Année :" + buffer6.toString());
                def.setText("Immo ajoutée : ");
                Immoreal++;
                passing = Integer.toString(Immoreal);
                Intent intent = new Intent();
                intent.putExtra("editTextValue", Immoreal.toString());
                setResult(RESULT_OK, intent);
                return;

            }

        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intcount2Value = Integer.parseInt(Count2);

                intcount2Value++;

                Count2 = Integer.toString(intcount2Value);

                btn2.setText(Count2);

                Immo3 = Integer.toString(Immoreal);
                Codebarre = FP + passEDB + Immo3;
                mydb.insertData(Immoreal, T2, Codebarre, Catego, passEDB, FP, Origine);
                if (address != null)
                    address.cancel();

                address = Toast.makeText(getBaseContext(), "Ajouté: " + Codebarre, Toast.LENGTH_LONG);
                address.show();
                Cursor res = mydb.getAllData();
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
                deleterow.setText("Immo :" + buffer.toString() + System.getProperty("line.separator") + "Caption :" + buffer1.toString() + System.getProperty("line.separator") + "Code :" + buffer2.toString() + System.getProperty("line.separator") + "Année :" + buffer6.toString());
                def.setText("Immo ajoutée : ");
                Immoreal++;
                passing = Integer.toString(Immoreal);
                Intent intent = new Intent();
                intent.putExtra("editTextValue", Immoreal.toString());
                setResult(RESULT_OK, intent);
                return;

            }

        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intcount3Value = Integer.parseInt(Count3);

                intcount3Value++;

                Count3 = Integer.toString(intcount3Value);

                btn3.setText(Count3);

                Immo3 = Integer.toString(Immoreal);
                Codebarre = FP + passEDB + Immo3;
                mydb.insertData(Immoreal, T3, Codebarre, Catego, passEDB, FP, Origine);
                if (address != null)
                    address.cancel();

                address = Toast.makeText(getBaseContext(), "Ajouté: " + Codebarre, Toast.LENGTH_LONG);
                address.show();
                Cursor res = mydb.getAllData();
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
                deleterow.setText("Immo :" + buffer.toString() + System.getProperty("line.separator") + "Caption :" + buffer1.toString() + System.getProperty("line.separator") + "Code :" + buffer2.toString() + System.getProperty("line.separator") + "Année :" + buffer6.toString());
                def.setText("Immo ajoutée : ");
                Immoreal++;
                passing = Integer.toString(Immoreal);
                Intent intent = new Intent();
                intent.putExtra("editTextValue", Immoreal.toString());
                setResult(RESULT_OK, intent);
                return;

            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intcount4Value = Integer.parseInt(Count4);

                intcount4Value++;

                Count4 = Integer.toString(intcount4Value);

                btn4.setText(Count4);

                Immo3 = Integer.toString(Immoreal);
                Codebarre = FP + passEDB + Immo3;
                mydb.insertData(Immoreal, T4, Codebarre, Catego, passEDB, FP, Origine);
                if (address != null)
                    address.cancel();

                address = Toast.makeText(getBaseContext(), "Ajouté: " + Codebarre, Toast.LENGTH_LONG);
                address.show();
                Cursor res = mydb.getAllData();
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
                deleterow.setText("Immo :" + buffer.toString() + System.getProperty("line.separator") + "Caption :" + buffer1.toString() + System.getProperty("line.separator") + "Code :" + buffer2.toString() + System.getProperty("line.separator") + "Année :" + buffer6.toString());
                def.setText("Immo ajoutée : ");
                Immoreal++;
                passing = Integer.toString(Immoreal);
                Intent intent = new Intent();
                intent.putExtra("editTextValue", Immoreal.toString());
                setResult(RESULT_OK, intent);
                return;

            }

        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Countall = intcount1Value + intcount2Value + intcount3Value + intcount4Value;
                if (Countall == 0) {
                } else {
                    Immo3 = Integer.toString(Immoreal - 1);
                    Cursor res = mydb.getAllData();
                    if (res.getCount() > 0) {
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
                        B2 = buffer1.toString();

                        if (B2.equals(T2)) {
                            intcount2Value--;

                            Count2 = Integer.toString(intcount2Value);

                            btn2.setText(Count2);
                        }
                        if (B2.equals(T3)) {
                            intcount3Value--;

                            Count3 = Integer.toString(intcount3Value);

                            btn3.setText(Count3);
                        }
                        if (B2.equals(T4)) {
                            intcount4Value--;

                            Count4 = Integer.toString(intcount4Value);

                            btn4.setText(Count4);
                        }
                        if (B2.equals(T1)) {
                            intcount1Value--;

                            Count1 = Integer.toString(intcount1Value);

                            btn1.setText(Count1);
                        }
                        deleterow.setText("Immo :" + buffer.toString() + System.getProperty("line.separator") + "Caption :" + buffer1.toString() + System.getProperty("line.separator") + "Code :" + buffer2.toString() + System.getProperty("line.separator") + "Année :" + buffer6.toString());
                        def.setText("Immo enlevée : ");
                        mydb.deletedata(Immo3);


                        Immoreal--;
                        passing = Integer.toString(Immoreal);
                        Intent intent = new Intent();
                        intent.putExtra("editTextValue", Immoreal.toString());
                        setResult(RESULT_OK, intent);
                    }

                }
            }
        });


//        Intent intent = new Intent();
//        intent.putExtra("editTextValue", Immoreal.toString());
//        setResult(RESULT_OK, intent);
// //       finish();


    }









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        passEDB = intent.getStringExtra("classe");
        passImmo = intent.getStringExtra("immo");
        passFP = intent.getStringExtra("FP");
        setContentView(R.layout.activity_chaie);
        AddData();


        mydb = new DatabaseHelper(this);
    }
}
