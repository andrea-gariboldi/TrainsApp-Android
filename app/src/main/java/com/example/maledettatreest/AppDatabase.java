package com.example.maledettatreest;
import androidx.room.Database;
import androidx.room.RoomDatabase;


    @Database(entities = {UserEntity.class}, version = 1)
    public abstract class AppDatabase extends RoomDatabase {
        public abstract userDao userDao();
    }



