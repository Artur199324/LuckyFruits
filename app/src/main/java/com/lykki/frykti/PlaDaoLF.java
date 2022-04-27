package com.lykki.frykti;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface PlaDaoLF {

    @Insert
    void player(PalLF palLF);

    @Query("SELECT * FROM plLF ORDER BY ID DESC LIMIT 1")
    PalLF getPlaLF();
}
