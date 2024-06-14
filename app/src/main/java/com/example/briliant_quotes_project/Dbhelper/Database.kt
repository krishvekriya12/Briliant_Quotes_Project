package com.example.briliant_quotes_project.Dbhelper

import android.app.Application
import android.database.sqlite.SQLiteDatabase

class Database : Application() {
    companion object {
        lateinit var db: SQLiteDatabase
    }

    override fun onCreate() {
        super.onCreate()
        db = openOrCreateDatabase("demo.db", MODE_PRIVATE, null)
        db.execSQL(
            "create table if not exists fav(id integer primary key autoincrement," +
                    "quote String,author String)"
        )

    }
}