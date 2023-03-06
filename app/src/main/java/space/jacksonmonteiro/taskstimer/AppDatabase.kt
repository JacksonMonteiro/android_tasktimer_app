package space.jacksonmonteiro.taskstimer

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

private const val TAG = "AppDatabase"

private const val DATABASE_NAME = "TaskTimer.db"
private const val DATABASE_VERSION = 1

internal class AppDatabase constructor(context: Context): SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    init {
        Log.d(TAG, "AppDatabase: initialising")
    }

    override fun onCreate(p0: SQLiteDatabase?) {
        TODO("Not yet implemented")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

}