package com.lykki.frykti;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = {PalLF.class}, version = 1)
public abstract class PlLFDataBase extends RoomDatabase {
    public abstract PlaDaoLF plaDaoLF();

    public static PlLFDataBase plLFDataBase;

    public static synchronized PlLFDataBase getInstanceLF(Context context) {

        if (plLFDataBase == null) {

            plLFDataBase = Room.databaseBuilder(context.getApplicationContext(),
                    PlLFDataBase.class, "moviesDB")
                    .fallbackToDestructiveMigration()
                    .build();
        }

        return plLFDataBase;
    }
}
