package com.example.who_is_the_millionaire;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SqliteScore extends SQLiteOpenHelper {
    private static final String DATABASE_SCORE = "scoreManager";
    private static final int DATABASE_VESION = 1;
    private static final String TABLE_NAME = "tblScore";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_SCORE = "score";


    public SqliteScore(@Nullable Context context) {
        super(context, DATABASE_SCORE, null, DATABASE_VESION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + " (" +
                KEY_ID + " INTEGER PRIMARY KEY, " +
                KEY_NAME + " TEXT, " +
                KEY_SCORE + " TEXT)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String querry = "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(querry);
        onCreate(db);

    }
public void addPlayerScore (PlayerGame playerGame){
    SQLiteDatabase sql = this.getWritableDatabase();
    ContentValues contentValues = new ContentValues();
    contentValues.put(KEY_NAME, playerGame.getName());
    contentValues.put(KEY_SCORE, playerGame.getScore());
    sql.insert(TABLE_NAME, null, contentValues);
    // dóng kết nối
    sql.close();
}
public ArrayList<PlayerGame> getPlayerGame (){
    ArrayList<PlayerGame> arrayList = new ArrayList<>();
    SQLiteDatabase sql = this.getReadableDatabase();
    String querry = "SELECT * FROM " + TABLE_NAME;
    Cursor cursor = sql.rawQuery(querry, null);
    //nêu con trỏ đang trỏ đến vị trí thứ nhất
    if (cursor.moveToFirst()) {
        do {
            // khởi tạo sinh viên
            PlayerGame playerGame = new PlayerGame();
            // gán giá trị cho từng sinh viên
            playerGame.setId(cursor.getInt(0));
            playerGame.setName(cursor.getString(1));
            playerGame.setScore(cursor.getString(2));
            //thêm vào danh sách sinh viên
            arrayList.add(playerGame);
        } while (cursor.moveToNext());
        cursor.close();
        // đóng kết nối
        sql.close();
    }
    return arrayList;
}

}
