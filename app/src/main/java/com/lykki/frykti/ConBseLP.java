package com.lykki.frykti;

import android.app.Application;
import android.os.AsyncTask;

public class ConBseLP {

    PlaDaoLF plaDaoLF;

    public ConBseLP(Application application) {
        PlLFDataBase plLFDataBase = PlLFDataBase.getInstanceLF(application);
        plaDaoLF = plLFDataBase.plaDaoLF();
    }

    public PalLF getPl(){
        return plaDaoLF.getPlaLF();
    }

    public void insertPla(PalLF palLF){
        new InsertPlAsyncTaskLF(plaDaoLF).execute(palLF);
    }

    private static class InsertPlAsyncTaskLF extends AsyncTask<PalLF, Void, Void> {
        PlaDaoLF plaDaoLF;

        public InsertPlAsyncTaskLF(PlaDaoLF plaDaoLF) {
            this.plaDaoLF = plaDaoLF;
        }

        @Override
        protected Void doInBackground(PalLF... palLVES) {
            plaDaoLF.player(palLVES[0]);
            return null;
        }
    }
}
