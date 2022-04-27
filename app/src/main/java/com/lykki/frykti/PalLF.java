package com.lykki.frykti;

import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

@androidx.room.Entity(tableName = "plLF")
public class PalLF {

    public PalLF() {
    }

    @PrimaryKey(autoGenerate = true)
    int id;

    @ColumnInfo(name = "nameLF")
    String nameLF;
    @ColumnInfo(name = "passwordLF")
    String passwordLF;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameLF() {
        return nameLF;
    }

    public void setNameLF(String nameLF) {
        this.nameLF = nameLF;
    }

    public String getPasswordLF() {
        return passwordLF;
    }

    public void setPasswordLF(String passwordLF) {
        this.passwordLF = passwordLF;
    }
}
