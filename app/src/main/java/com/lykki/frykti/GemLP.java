package com.lykki.frykti;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Vibrator;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.Random;

public class GemLP {

    private ImageView vdsxz, bdxzv;
    private int vdvx;
    private int vdz;
    private boolean moveB = true;
    private boolean fd = true;
    private int moveIn = 0;
    private int vda = 0;
    private Vibrator vibrator;

    public Vibrator getVibrator() {
        return vibrator;
    }

    public void setVibrator(Vibrator vibrator) {
        this.vibrator = vibrator;
    }

    public int getMoveIn() {
        return moveIn;
    }

    public void setVda(int vda) {
        this.vda = vda;
    }

    public int getVda() {
        return vda;
    }

    public void setMoveIn(int moveIn) {
        this.moveIn = moveIn;
    }

    public boolean isFd() {
        return fd;
    }

    public void setFd(boolean fd) {
        this.fd = fd;
    }

    public GemLP() {
    }

    public boolean isMoveB() {
        return moveB;
    }

    public void setMoveB(boolean moveB) {
        this.moveB = moveB;
    }

    public ImageView getVdsxz() {
        return vdsxz;
    }

    public ImageView getBdxzv() {
        return bdxzv;
    }

    public void setBdxzv(ImageView bdxzv) {
        this.bdxzv = bdxzv;
    }

    public void setVdsxz(ImageView vdsxz) {
        this.vdsxz = vdsxz;
    }

    public int getVdvx() {
        return vdvx;
    }

    public void setVdvx(int vdvx) {
        this.vdvx = vdvx;
    }

    public int getVdz() {
        return vdz;
    }

    public void setVdz(int vdz) {
        this.vdz = vdz;
    }

    public void gemLpp(int dra) {
        bdxzv.setImageResource(dra);


        bdxzv.setX(0 + getVdvx() / 6);
        bdxzv.setY(0);
    }

    public void moveLff() {
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (moveB) {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            bdxzv.setY(bdxzv.getY() + 30);
                            if (bdxzv.getY() > getVdz()) {
                                bdxzv.setY(0);
                            }
                        }
                    }, 200);

                } else {
                    bdxzv.setY(bdxzv.getY() - 30);
                    if (bdxzv.getY() < 0) {
                        bdxzv.setY(getVdz() - bdxzv.getWidth());
                    }
                }


                if (moveIn != 1) {
                    handler.postDelayed(this::run, 10);
                } else {
                }

            }
        });
    }

    public void timeLF(TextView textView){
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                vda++;
                textView.setText(vda +"");
                if (moveIn != 1) {
                    handler.postDelayed(this::run, 1000);
                } else {
                }
            }
        });
    }

    public void hhh() {


        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                Rect scs = new Rect();
                vdsxz.getHitRect(scs);

                Rect cvss = new Rect();
                bdxzv.getHitRect(cvss);

                if (Rect.intersects(scs, cvss)) {
                    fd = false;
                    moveIn = 1;
                    vibrator.vibrate(200);;
                }
                handler.postDelayed(this::run,10);
            }
        });



    }

    public void gemLp() {
        Random random = new Random();
        int r = random.nextInt(9);
        switch (r) {
            case 0:
                vdsxz.setImageResource(R.drawable.slot1);
                break;
            case 1:
                vdsxz.setImageResource(R.drawable.slot2);
                break;
            case 2:
                vdsxz.setImageResource(R.drawable.slot3);
                break;
            case 3:
                vdsxz.setImageResource(R.drawable.slot4);
                break;
            case 4:
                vdsxz.setImageResource(R.drawable.slot5);
                break;
            case 5:
                vdsxz.setImageResource(R.drawable.slot7);
                break;
            case 6:
                vdsxz.setImageResource(R.drawable.slot8);
                break;
            case 7:
                vdsxz.setImageResource(R.drawable.slot9);
                break;
            case 8:
                vdsxz.setImageResource(R.drawable.slot10);
                break;


        }

        vdsxz.setY(getVdz() / 4);
        vdsxz.setX(getVdvx());
    }

    public void moveLF() {
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                vdsxz.setX(vdsxz.getX() - 5);
                if (vdsxz.getX() < 0 - vdsxz.getWidth()) {
                    ConstraintLayout.LayoutParams constrainLF = (ConstraintLayout.LayoutParams) vdsxz.getLayoutParams();
                    Random random = new Random();
                    int ds = random.nextInt(3);
                    switch (ds) {
                        case 0:
                            constrainLF.width = vdvx;
                            constrainLF.height = vdvx;
                            break;
                        case 1:
                            constrainLF.width = vdvx / 2;
                            constrainLF.height = vdvx / 2;
                            break;
                        case 2:
                            constrainLF.width = vdvx / 3;
                            constrainLF.height = vdvx / 3;
                            break;

                    }

                    vdsxz.setLayoutParams(constrainLF);
                    gemLp();
                }
                if (moveIn != 1) {
                    handler.postDelayed(this::run, 10);
                } else {
                }
            }
        });
    }
}
