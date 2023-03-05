package com.erbol.notes;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class NotesDBHelper extends SQLiteOpenHelper {
    private static final String DB_NAME="notes.db";
    private static final int DB_VERSION = 2;

    public NotesDBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
//        этот метод для создания БД
        db.execSQL(NotesContract.NotesEntry.CREATE_COMMAND);//Мы получили внутри execSQL данные от класса NotesContract NotesEntry subclass

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(NotesContract.NotesEntry.DROP_COMMAND); // если данные обновились нужно удалить и создать новый БД
        onCreate(db);
    }
}
