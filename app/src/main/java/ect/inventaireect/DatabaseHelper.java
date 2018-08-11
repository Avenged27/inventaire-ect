package ect.inventaireect;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Environment;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

    /**
     * Created by Jules on 2017-03-26.
     */

    public class DatabaseHelper extends SQLiteOpenHelper {
        public static final String DATABASE_NAME = "inventaire.db";
        public static final String TABLE_NAME = "Inventaire";
        public static final String COL_1 = "IMMO";
        public static final String COL_2 = "CAPTION";
        public static final String COL_3 = "CODEBARRE";
        public static final String COL_4 = "CODECATEGORIE";
        public static final String COL_5 = "CODEEMPLACEMENT";
        public static final String COL_6 = "CODEFAMILLEPHYSIQUE";
        public static final String COL_7 = "ORIGINE";

        private static final String DATABASE_CREATE_FRIDGE_ITEM = "create table Inventaire(IMMO Integer not null,CAPTION text not null,CODEBARRE text not null,CODECATEGORIE text not null,CODEEMPLACEMENT text not null,CODEFAMILLEPHYSIQUE text not null,ORIGINE text not null);";


        public DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            try {
                db.execSQL(DATABASE_CREATE_FRIDGE_ITEM);
            } catch (Exception e) {

            }

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
            onCreate(db);

        }

        public boolean insertData(Integer immo, String caption, String codebarre, String codecategorie, String codeemplacement, String codefamillephysique, String origine) {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(COL_1, immo);
            contentValues.put(COL_2, caption);
            contentValues.put(COL_3, codebarre);
            contentValues.put(COL_4, codecategorie);
            contentValues.put(COL_5, codeemplacement);
            contentValues.put(COL_6, codefamillephysique);
            contentValues.put(COL_7, origine);
            long result = db.insert(TABLE_NAME, null, contentValues);
            if (result == -1)
                return false;
            else
                return true;
        }

        public Cursor getAllData() {
            SQLiteDatabase db = this.getWritableDatabase();
            Cursor res = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
            //Cursor res = db.rawQuery("SELECT * FROM " + TABLE_NAME + " ORDER BY column DESC LIMIT 1",null);
            return res;
        }

        public void deleteAll()
        {
            SQLiteDatabase db = this.getWritableDatabase(); //get database
            db.delete(TABLE_NAME, null, null);
            //db.execSQL("DELETE FROM TABLE_NAME"); //delete all rows in a table
            db.close();
        }



        public Integer deletedata(String id) {
            SQLiteDatabase db = this.getWritableDatabase();
            return db.delete(TABLE_NAME, "IMMO = ?", new String[]{id});
        }












//    public static void exportDatabase() throws IOException {
//        boolean success = true;
//        File file = null;
//        file = new File(Environment.getExternalStorageDirectory() + "/M.O.L.S_Backup");
//        String dateStr = "04/05/2010";
//
//        SimpleDateFormat curFormater = new SimpleDateFormat("dd/MM/yyyy");
//        Date dateObj = null;
//        try {
//            dateObj = curFormater.parse(dateStr);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        SimpleDateFormat postFormater = new SimpleDateFormat("MMMM dd, yyyy");
//
//        String newDateStr = postFormater.format(dateObj);
//
//        if (file.exists()) {
//            success = true;
//        } else {
//            success = file.mkdir();
//        }
//
//        if (success) {
//            String inFileName = "/data/data/com.example.jules.invento/databases/inventaire"+ newDateStr +".db";
//            File dbFile = new File(inFileName);
//            FileInputStream fis = new FileInputStream(dbFile);
//
//            String outFileName = Environment.getExternalStorageDirectory() + "/Inventaire/Inventaire.db";
//
//            // Open the empty db as the output stream
//            OutputStream output = new FileOutputStream(outFileName);
//
//            // Transfer bytes from the inputfile to the outputfile
//            byte[] buffer = new byte[1024];
//            int length;
//            while ((length = fis.read(buffer)) > 0) {
//                output.write(buffer, 0, length);
//            }
//
//            output.flush();
//            output.close();
//            fis.close();
//        }
//    }
    }


