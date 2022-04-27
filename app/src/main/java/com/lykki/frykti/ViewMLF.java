package com.lykki.frykti;

import android.app.Application;
import android.os.Vibrator;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class ViewMLF extends AndroidViewModel {
    private GemLP gemLP;
    private ConBseLP conBseLP;
    private ConLF conLF;
    private AppsLF appsLF;
    private DeepLF deepLF;

    public ViewMLF(@NonNull Application application) {
        super(application);
        appsLF = new AppsLF();
        conBseLP = new ConBseLP(application);
        gemLP = new GemLP();
        conLF = new ConLF();
        deepLF = new DeepLF();


    }

    public void app(AppLF appLF){
        appsLF.appsLF(appLF);
    }
    public void deepLinkLF(MainActivity mainActivity){
        deepLF.deepLF(mainActivity);
    }

    public ConLF connLP(){
        conLF.conLf();
        return conLF;
    }

    public void insertDataLF(PalLF palLF){
        conBseLP.insertPla(palLF);
    }

    public String[] getDataLF(){
        String[] ds = new String[2];
        ds[0] = conBseLP.getPl().nameLF;
        ds[1] = conBseLP.getPl().passwordLF;
        return ds;
    }

    public void gemLpp(ImageView imageView, ImageView imageView2, int w, int h, int dra) {
        gemLP.setVdsxz(imageView);
        gemLP.setBdxzv(imageView2);
        gemLP.setVdvx(w);
        gemLP.setVdz(h);
        gemLP.gemLp();
        gemLP.moveLF();
        gemLP.gemLpp(dra);
        gemLP.moveLff();
        gemLP.hhh();
    }

    public void setMoveLF(boolean b) {
        gemLP.setMoveB(b);
    }

    public boolean fbb() {
        return gemLP.isFd();
    }
    public void fddS(boolean sa){
        gemLP.setFd(sa);
    }
    public void moveIn(int ff){
        gemLP.setMoveIn(ff);
    }
    public void timerLP(TextView textView){
        gemLP.timeLF(textView);
    }
    public void setTimer(int t){
        gemLP.setVda(t);
    }
    public void vib(Vibrator vibrator){
        gemLP.setVibrator(vibrator);
    }


}
