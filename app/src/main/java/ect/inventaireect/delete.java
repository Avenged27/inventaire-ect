package ect.inventaireect;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class delete extends AppCompatActivity {

    public Button delete;
    public Button set;
    public Button delset;
    public DatabaseHelper mydb;
    public TextView del;
    public TextView next;
    public EditText edit;


    public void init(){
        delete = (Button)findViewById(R.id.button6);

        del = (TextView)findViewById(R.id.textView8);
        next = (TextView)findViewById(R.id.textView9);

        del.setText("");


        Cursor res = mydb.getAllData();
        if (res.getCount()>0) {
            res.moveToLast();
            StringBuffer buffer = new StringBuffer();
            StringBuffer buffer2 = new StringBuffer();
            StringBuffer buffer1 = new StringBuffer();
            StringBuffer buffer6 = new StringBuffer();
            buffer.append(res.getString(0));
            buffer1.append(res.getString(1));
            buffer2.append(res.getString(2));
            buffer6.append(res.getString(6));
            next.setText("Immo Supprimé :" + System.getProperty("line.separator")  + buffer.toString()  + System.getProperty("line.separator")  +"Caption :"+ System.getProperty("line.separator") + buffer1.toString()  + System.getProperty("line.separator")  + "Code :" + buffer2.toString()  + System.getProperty("line.separator") + "Année :" + buffer6.toString());
        }
        else{
            next.setText("Base de Donnée vide");
        }
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Cursor res = mydb.getAllData();

                if (res.getCount()>0) {
                    res.moveToLast();
                    StringBuffer buffer = new StringBuffer();
                    StringBuffer buffer2 = new StringBuffer();
                    StringBuffer buffer1 = new StringBuffer();
                    StringBuffer buffer6 = new StringBuffer();
                    buffer.append(res.getString(0));
                    buffer1.append(res.getString(1));
                    buffer2.append(res.getString(2));
                    buffer6.append(res.getString(6));
                    del.setText("Immo Supprimé :" + System.getProperty("line.separator")  + buffer.toString()  + System.getProperty("line.separator")  +"Caption :"+ System.getProperty("line.separator") + buffer1.toString()  + System.getProperty("line.separator")  + "Code :" + buffer2.toString()  + System.getProperty("line.separator") + "Année :" + buffer6.toString());
                    mydb.deletedata(buffer.toString());
                    if (res.getCount()>0) {
                        res.moveToPrevious();
                        StringBuffer buffera = new StringBuffer();
                        StringBuffer bufferb = new StringBuffer();
                        StringBuffer bufferc = new StringBuffer();
                        StringBuffer bufferd = new StringBuffer();
                        buffera.append(res.getString(0));
                        bufferb.append(res.getString(1));
                        bufferc.append(res.getString(2));
                        bufferd.append(res.getString(6));
                        next.setText("Prochain Immo :" + System.getProperty("line.separator")  + buffera.toString()  + System.getProperty("line.separator")  +"Caption :"+ System.getProperty("line.separator") + bufferb.toString()  + System.getProperty("line.separator")  + "Code :" + bufferc.toString()  + System.getProperty("line.separator") + "Année :" + bufferd.toString());
                    }
                }
                else{
                    del.setText("Base de donnée vide");
                }





                }

        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        mydb = new DatabaseHelper(this);
        init();

    }
}
