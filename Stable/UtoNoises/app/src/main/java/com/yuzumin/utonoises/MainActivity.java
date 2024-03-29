package com.yuzumin.utonoises;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Count.CountListener{
    ImageView image;
    TextView textCount;

    ImageView MenuBTN;
    ImageView AlarmBTN;

    MediaPlayer noise;
    MediaPlayer.OnCompletionListener listener;

    ObjectAnimator anim1, anim2, anim3;
    AnimatorSet set1, set2;

    SharedPreferences userPreferences;
    SharedPreferences.Editor userPreferencesEditor;

    TextView AppName;
    boolean isFullAuto;

    boolean switch0; //IMPORTANT : For Bottom Bar
    boolean switch1; //IMPORTANT : TO DISABLE TOAST POPUP
    boolean switch2; //TO DISABLE CLICKER

    LinearLayout ButtonBar;

    CardView SoundBTN1;
    CardView SoundBTN2;
    CardView SoundBTN3;
    CardView SoundBTN4;
    CardView SoundBTN5;
    CardView SoundBTN6;
    CardView SoundBTN7;
    CardView SoundBTN8;
    CardView SoundBTN9;
    CardView SoundBTN10;
    CardView SoundBTN11;
    CardView SoundBTN12;
    CardView SoundBTN13;
    CardView SoundBTN14;
    CardView SoundBTN15;
    CardView SoundBTN16;
    CardView SoundBTN17;
    CardView SoundBTN18;
    CardView SoundBTN19;
    CardView SoundBTN20;
    CardView SoundBTN21;
    CardView SoundBTN22;
    CardView SoundBTN23;
    CardView SoundBTN24;
    CardView SoundBTN25;
    CardView SoundBTN26;
    CardView SoundBTN27;
    CardView SoundBTN28;
    CardView SoundBTN29;
    CardView SoundBTN30;
    CardView SoundBTN31;
    CardView SoundBTN32;
    CardView SoundBTN33;
    CardView SoundBTN34;
    CardView SoundBTN35;
    CardView SoundBTN36;
    CardView SoundBTN37;
    CardView SoundBTN38;
    CardView SoundBTN39;
    CardView SoundBTN40;
    CardView SoundBTN41;
    CardView SoundBTN42;
    CardView SoundBTN43;
    CardView SoundBTN44;
    CardView SoundBTN45;
    CardView SoundBTN46;
    CardView SoundBTN47;
    CardView SoundBTN48;
    CardView SoundBTN49;
    CardView SoundBTN50;
    CardView SoundBTN51;
    CardView SoundBTN52;
    CardView SoundBTN53;
    CardView SoundBTN54;
    CardView SoundBTN55;
    CardView SoundBTN56;
    CardView SoundBTN57;
    CardView SoundBTN58;
    CardView SoundBTN59;
    CardView SoundBTN60;
    CardView SoundBTN61;
    CardView SoundBTN62;
    CardView SoundBTN63;
    CardView SoundBTN64;
    CardView SoundBTN65;
    CardView SoundBTN66;
    CardView SoundBTN67;
    CardView SoundBTN68;
    CardView SoundBTN69;
    CardView SoundBTN70;
    CardView SoundBTN71;
    CardView SoundBTN72;
    CardView SoundBTN73;
    CardView SoundBTN74;
    CardView SoundBTN75;
    CardView SoundBTN76;
    CardView SoundBTN77;
    CardView SoundBTN78;
    CardView SoundBTN79;
    CardView SoundBTN80;
    CardView SoundBTN81;
    CardView SoundBTN82;
    CardView SoundBTN83;
    CardView SoundBTN84;
    CardView SoundBTN85;
    CardView SoundBTN86;
    CardView SoundBTN87;
    CardView SoundBTN88;
    CardView SoundBTN89;
    CardView SoundBTN90;
    CardView SoundBTN91;
    CardView SoundBTN92;
    CardView SoundBTN93;
    CardView SoundBTN94;
    CardView SoundBTN95;
    CardView SoundBTN96;
    CardView SoundBTN97;
    CardView SoundBTN98;
    CardView SoundBTN99;
    CardView SoundBTN100;



    List<Integer> listofsounds;
    int charavalue;


    Integer DevCount=1;

    Count count;

    @Override
    public void OnUpdated(int count) {
        //userPreferencesEditor.putInt("count", count).apply();
        userPreferencesEditor = getSharedPreferences("count",MODE_PRIVATE).edit();
        userPreferencesEditor.putInt("count", count);
        userPreferencesEditor.apply();

        textCount.setText(String.format("Count: %d", count));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        // TO OPEN APP MENU
        MenuBTN=findViewById(R.id.menu_btn);
        MenuBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isFullAuto){
                    isFullAuto =false;
                    AppName.setText(getString(R.string.press_vtuber));
                }
                Intent intent;
                intent = new Intent(MainActivity.this, AppMenu.class);
                startActivity(intent);
            }
        });
        AlarmBTN=findViewById(R.id.alarm_btn);
        // TO OPEN ALARM LIST ACTIVITY
        /*
        AlarmBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(DevCount==7){
                    if(isFullAuto){
                        isFullAuto =false;
                        AppName.setText(getString(R.string.press_vtuber));
                    }
                    Intent intent;
                    intent = new Intent(MainActivity.this, AlarmActivity.class);
                    startActivity(intent);
                }
            }
        });
         */
        listener = new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                cleanupMediaPlayer();

                if(isFullAuto){
                    startRandomSound();
                }
            }
        };
        image = findViewById(R.id.image);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startRandomSound();
            }
        });

        ButtonBar=findViewById(R.id.buttonBar);
        ButtonBar.setVisibility(View.GONE);

        SoundBTN1=findViewById(R.id.sound1);
        SoundBTN1.setVisibility(View.GONE);
        SoundBTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(3);
            }
        });

        SoundBTN2=findViewById(R.id.sound2);
        SoundBTN2.setVisibility(View.GONE);
        SoundBTN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(4);
            }
        });

        SoundBTN3=findViewById(R.id.sound3);
        SoundBTN3.setVisibility(View.GONE);
        SoundBTN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(5);
            }
        });

        SoundBTN4=findViewById(R.id.sound4);
        SoundBTN4.setVisibility(View.GONE);
        SoundBTN4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(6);
            }
        });

        SoundBTN5=findViewById(R.id.sound5);
        SoundBTN5.setVisibility(View.GONE);
        SoundBTN5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(7);
            }
        });

        SoundBTN6=findViewById(R.id.sound6);
        SoundBTN6.setVisibility(View.GONE);
        SoundBTN6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(8);
            }
        });

        SoundBTN7=findViewById(R.id.sound7);
        SoundBTN7.setVisibility(View.GONE);
        SoundBTN7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(9);
            }
        });

        SoundBTN8=findViewById(R.id.sound8);
        SoundBTN8.setVisibility(View.GONE);
        SoundBTN8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(10);
            }
        });

        SoundBTN9=findViewById(R.id.sound9);
        SoundBTN9.setVisibility(View.GONE);
        SoundBTN9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(11);
            }
        });

        SoundBTN10=findViewById(R.id.sound10);
        SoundBTN10.setVisibility(View.GONE);
        SoundBTN10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(12);
            }
        });

        SoundBTN11=findViewById(R.id.sound11);
        SoundBTN11.setVisibility(View.GONE);
        SoundBTN11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(13);
            }
        });

        SoundBTN12=findViewById(R.id.sound12);
        SoundBTN12.setVisibility(View.GONE);
        SoundBTN12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(14);
            }
        });

        SoundBTN13=findViewById(R.id.sound13);
        SoundBTN13.setVisibility(View.GONE);
        SoundBTN13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(15);
            }
        });

        SoundBTN14=findViewById(R.id.sound14);
        SoundBTN14.setVisibility(View.GONE);
        SoundBTN14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(16);
            }
        });

        SoundBTN15=findViewById(R.id.sound15);
        SoundBTN15.setVisibility(View.GONE);
        SoundBTN15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(17);
            }
        });

        SoundBTN16=findViewById(R.id.sound16);
        SoundBTN16.setVisibility(View.GONE);
        SoundBTN16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(18);
            }
        });

        SoundBTN17=findViewById(R.id.sound17);
        SoundBTN17.setVisibility(View.GONE);
        SoundBTN17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(19);
            }
        });

        SoundBTN18=findViewById(R.id.sound18);
        SoundBTN18.setVisibility(View.GONE);
        SoundBTN18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(20);
            }
        });

        SoundBTN19=findViewById(R.id.sound19);
        SoundBTN19.setVisibility(View.GONE);
        SoundBTN19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(21);
            }
        });

        SoundBTN20=findViewById(R.id.sound20);
        SoundBTN20.setVisibility(View.GONE);
        SoundBTN20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(22);
            }
        });

        SoundBTN21=findViewById(R.id.sound21);
        SoundBTN21.setVisibility(View.GONE);
        SoundBTN21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(23);
            }
        });

        SoundBTN22=findViewById(R.id.sound22);
        SoundBTN22.setVisibility(View.GONE);
        SoundBTN22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(24);
            }
        });

        SoundBTN23=findViewById(R.id.sound23);
        SoundBTN23.setVisibility(View.GONE);
        SoundBTN23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(25);
            }
        });

        SoundBTN24=findViewById(R.id.sound24);
        SoundBTN24.setVisibility(View.GONE);
        SoundBTN24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(26);
            }
        });

        SoundBTN25=findViewById(R.id.sound25);
        SoundBTN25.setVisibility(View.GONE);
        SoundBTN25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(27);
            }
        });

        SoundBTN26=findViewById(R.id.sound26);
        SoundBTN26.setVisibility(View.GONE);
        SoundBTN26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(28);
            }
        });

        SoundBTN27=findViewById(R.id.sound27);
        SoundBTN27.setVisibility(View.GONE);
        SoundBTN27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(29);
            }
        });

        SoundBTN28=findViewById(R.id.sound28);
        SoundBTN28.setVisibility(View.GONE);
        SoundBTN28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(30);
            }
        });

        SoundBTN29=findViewById(R.id.sound29);
        SoundBTN29.setVisibility(View.GONE);
        SoundBTN29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(31);
            }
        });

        SoundBTN30=findViewById(R.id.sound30);
        SoundBTN30.setVisibility(View.GONE);
        SoundBTN30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(32);
            }
        });

        SoundBTN31=findViewById(R.id.sound31);
        SoundBTN31.setVisibility(View.GONE);
        SoundBTN31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(33);
            }
        });

        SoundBTN32=findViewById(R.id.sound32);
        SoundBTN32.setVisibility(View.GONE);
        SoundBTN32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(34);
            }
        });

        SoundBTN33=findViewById(R.id.sound33);
        SoundBTN33.setVisibility(View.GONE);
        SoundBTN33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(35);
            }
        });

        SoundBTN34=findViewById(R.id.sound34);
        SoundBTN34.setVisibility(View.GONE);
        SoundBTN34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(36);
            }
        });

        SoundBTN35=findViewById(R.id.sound35);
        SoundBTN35.setVisibility(View.GONE);
        SoundBTN35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(37);
            }
        });

        SoundBTN36=findViewById(R.id.sound36);
        SoundBTN36.setVisibility(View.GONE);
        SoundBTN36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(38);
            }
        });

        SoundBTN37=findViewById(R.id.sound37);
        SoundBTN37.setVisibility(View.GONE);
        SoundBTN37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(39);
            }
        });

        SoundBTN38=findViewById(R.id.sound38);
        SoundBTN38.setVisibility(View.GONE);
        SoundBTN38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(40);
            }
        });

        SoundBTN39=findViewById(R.id.sound39);
        SoundBTN39.setVisibility(View.GONE);
        SoundBTN39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(41);
            }
        });

        SoundBTN40=findViewById(R.id.sound40);
        SoundBTN40.setVisibility(View.GONE);
        SoundBTN40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(42);
            }
        });

        SoundBTN41=findViewById(R.id.sound41);
        SoundBTN41.setVisibility(View.GONE);
        SoundBTN41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(43);
            }
        });

        SoundBTN42=findViewById(R.id.sound42);
        SoundBTN42.setVisibility(View.GONE);
        SoundBTN42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(44);
            }
        });

        SoundBTN43=findViewById(R.id.sound43);
        SoundBTN43.setVisibility(View.GONE);
        SoundBTN43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(45);
            }
        });

        SoundBTN44=findViewById(R.id.sound44);
        SoundBTN44.setVisibility(View.GONE);
        SoundBTN44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(46);
            }
        });

        SoundBTN45=findViewById(R.id.sound45);
        SoundBTN45.setVisibility(View.GONE);
        SoundBTN45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(47);
            }
        });

        SoundBTN46=findViewById(R.id.sound46);
        SoundBTN46.setVisibility(View.GONE);
        SoundBTN46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(48);
            }
        });

        SoundBTN47=findViewById(R.id.sound47);
        SoundBTN47.setVisibility(View.GONE);
        SoundBTN47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(49);
            }
        });

        SoundBTN48=findViewById(R.id.sound48);
        SoundBTN48.setVisibility(View.GONE);
        SoundBTN48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(50);
            }
        });

        SoundBTN49=findViewById(R.id.sound49);
        SoundBTN49.setVisibility(View.GONE);
        SoundBTN49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(51);
            }
        });

        SoundBTN50=findViewById(R.id.sound50);
        SoundBTN50.setVisibility(View.GONE);
        SoundBTN50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(52);
            }
        });

        SoundBTN51=findViewById(R.id.sound51);
        SoundBTN51.setVisibility(View.GONE);
        SoundBTN51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(53);
            }
        });

        SoundBTN52=findViewById(R.id.sound52);
        SoundBTN52.setVisibility(View.GONE);
        SoundBTN52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(54);
            }
        });

        SoundBTN53=findViewById(R.id.sound53);
        SoundBTN53.setVisibility(View.GONE);
        SoundBTN53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(55);
            }
        });

        SoundBTN54=findViewById(R.id.sound54);
        SoundBTN54.setVisibility(View.GONE);
        SoundBTN54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(56);
            }
        });

        SoundBTN55=findViewById(R.id.sound55);
        SoundBTN55.setVisibility(View.GONE);
        SoundBTN55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(57);
            }
        });

        SoundBTN56=findViewById(R.id.sound56);
        SoundBTN56.setVisibility(View.GONE);
        SoundBTN56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(58);
            }
        });

        SoundBTN57=findViewById(R.id.sound57);
        SoundBTN57.setVisibility(View.GONE);
        SoundBTN57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(59);
            }
        });

        SoundBTN58=findViewById(R.id.sound58);
        SoundBTN58.setVisibility(View.GONE);
        SoundBTN58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(60);
            }
        });

        SoundBTN59=findViewById(R.id.sound59);
        SoundBTN59.setVisibility(View.GONE);
        SoundBTN59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(61);
            }
        });

        SoundBTN60=findViewById(R.id.sound60);
        SoundBTN60.setVisibility(View.GONE);
        SoundBTN60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(62);
            }
        });

        SoundBTN61=findViewById(R.id.sound61);
        SoundBTN61.setVisibility(View.GONE);
        SoundBTN61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(63);
            }
        });

        SoundBTN62=findViewById(R.id.sound62);
        SoundBTN62.setVisibility(View.GONE);
        SoundBTN62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(64);
            }
        });

        SoundBTN63=findViewById(R.id.sound63);
        SoundBTN63.setVisibility(View.GONE);
        SoundBTN63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(65);
            }
        });

        SoundBTN64=findViewById(R.id.sound64);
        SoundBTN64.setVisibility(View.GONE);
        SoundBTN64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(66);
            }
        });

        SoundBTN65=findViewById(R.id.sound65);
        SoundBTN65.setVisibility(View.GONE);
        SoundBTN65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(67);
            }
        });

        SoundBTN66=findViewById(R.id.sound66);
        SoundBTN66.setVisibility(View.GONE);
        SoundBTN66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(68);
            }
        });

        SoundBTN67=findViewById(R.id.sound67);
        SoundBTN67.setVisibility(View.GONE);
        SoundBTN67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(69);
            }
        });

        SoundBTN68=findViewById(R.id.sound68);
        SoundBTN68.setVisibility(View.GONE);
        SoundBTN68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(70);
            }
        });

        SoundBTN69=findViewById(R.id.sound69);
        SoundBTN69.setVisibility(View.GONE);
        SoundBTN69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(71);
            }
        });

        SoundBTN70=findViewById(R.id.sound70);
        SoundBTN70.setVisibility(View.GONE);
        SoundBTN70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(72);
            }
        });

        SoundBTN71=findViewById(R.id.sound71);
        SoundBTN71.setVisibility(View.GONE);
        SoundBTN71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(73);
            }
        });

        SoundBTN72=findViewById(R.id.sound72);
        SoundBTN72.setVisibility(View.GONE);
        SoundBTN72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(74);
            }
        });

        SoundBTN73=findViewById(R.id.sound73);
        SoundBTN73.setVisibility(View.GONE);
        SoundBTN73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(75);
            }
        });

        SoundBTN74=findViewById(R.id.sound74);
        SoundBTN74.setVisibility(View.GONE);
        SoundBTN74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(76);
            }
        });

        SoundBTN75=findViewById(R.id.sound75);
        SoundBTN75.setVisibility(View.GONE);
        SoundBTN75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(77);
            }
        });

        SoundBTN76=findViewById(R.id.sound76);
        SoundBTN76.setVisibility(View.GONE);
        SoundBTN76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(78);
            }
        });

        SoundBTN77=findViewById(R.id.sound77);
        SoundBTN77.setVisibility(View.GONE);
        SoundBTN77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(79);
            }
        });

        SoundBTN78=findViewById(R.id.sound78);
        SoundBTN78.setVisibility(View.GONE);
        SoundBTN78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(80);
            }
        });

        SoundBTN79=findViewById(R.id.sound79);
        SoundBTN79.setVisibility(View.GONE);
        SoundBTN79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(81);
            }
        });

        SoundBTN80=findViewById(R.id.sound80);
        SoundBTN80.setVisibility(View.GONE);
        SoundBTN80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(82);
            }
        });

        SoundBTN81=findViewById(R.id.sound81);
        SoundBTN81.setVisibility(View.GONE);
        SoundBTN81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(83);
            }
        });

        SoundBTN82=findViewById(R.id.sound82);
        SoundBTN82.setVisibility(View.GONE);
        SoundBTN82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(84);
            }
        });

        SoundBTN83=findViewById(R.id.sound83);
        SoundBTN83.setVisibility(View.GONE);
        SoundBTN83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(85);
            }
        });

        SoundBTN84=findViewById(R.id.sound84);
        SoundBTN84.setVisibility(View.GONE);
        SoundBTN84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(86);
            }
        });

        SoundBTN85=findViewById(R.id.sound85);
        SoundBTN85.setVisibility(View.GONE);
        SoundBTN85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(87);
            }
        });

        SoundBTN86=findViewById(R.id.sound86);
        SoundBTN86.setVisibility(View.GONE);
        SoundBTN86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(88);
            }
        });

        SoundBTN87=findViewById(R.id.sound87);
        SoundBTN87.setVisibility(View.GONE);
        SoundBTN87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(89);
            }
        });

        SoundBTN88=findViewById(R.id.sound88);
        SoundBTN88.setVisibility(View.GONE);
        SoundBTN88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(90);
            }
        });

        SoundBTN89=findViewById(R.id.sound89);
        SoundBTN89.setVisibility(View.GONE);
        SoundBTN89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(91);
            }
        });

        SoundBTN90=findViewById(R.id.sound90);
        SoundBTN90.setVisibility(View.GONE);
        SoundBTN90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(92);
            }
        });

        SoundBTN91=findViewById(R.id.sound91);
        SoundBTN91.setVisibility(View.GONE);
        SoundBTN91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(93);
            }
        });

        SoundBTN92=findViewById(R.id.sound92);
        SoundBTN92.setVisibility(View.GONE);
        SoundBTN92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(94);
            }
        });

        SoundBTN93=findViewById(R.id.sound93);
        SoundBTN93.setVisibility(View.GONE);
        SoundBTN93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(95);
            }
        });

        SoundBTN94=findViewById(R.id.sound94);
        SoundBTN94.setVisibility(View.GONE);
        SoundBTN94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(96);
            }
        });

        SoundBTN95=findViewById(R.id.sound95);
        SoundBTN95.setVisibility(View.GONE);
        SoundBTN95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(97);
            }
        });

        SoundBTN96=findViewById(R.id.sound96);
        SoundBTN96.setVisibility(View.GONE);
        SoundBTN96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(98);
            }
        });

        SoundBTN97=findViewById(R.id.sound97);
        SoundBTN97.setVisibility(View.GONE);
        SoundBTN97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(99);
            }
        });

        SoundBTN98=findViewById(R.id.sound98);
        SoundBTN98.setVisibility(View.GONE);
        SoundBTN98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(100);
            }
        });

        SoundBTN99=findViewById(R.id.sound99);
        SoundBTN99.setVisibility(View.GONE);
        SoundBTN99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(101);
            }
        });

        SoundBTN100=findViewById(R.id.sound100);
        SoundBTN100.setVisibility(View.GONE);
        SoundBTN100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(102);
            }
        });


        isFullAuto=false;
        AppName=findViewById(R.id.FiringState);
        AppName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFullAuto){
                    isFullAuto =false;
                    AppName.setText(getString(R.string.press_vtuber));
                }else{
                    isFullAuto =true;
                    AppName.setText(R.string.sit_back);
                    startRandomSound();
                }
            }
        });


        textCount = findViewById(R.id.count);

        anim1 = ObjectAnimator.ofFloat(image,"translationY", 0f,-50f, 50f, -50f, 50f, 0);
        anim1.setDuration(600);
        set1 = new AnimatorSet();
        ArrayList<Animator> setArray = new ArrayList<>();

        anim2 = ObjectAnimator.ofFloat(image,"translationY", 0f,-50f, 50f, -50f, 50f, -50f, 50f, -50f, 50f,0);
        anim2.setRepeatCount(ValueAnimator.INFINITE);
        setArray.add(anim2);
        anim2 = ObjectAnimator.ofFloat(image,"translationX", 0f,-70f, 70f, -70f, 70f, 0);
        anim2.setRepeatCount(ValueAnimator.INFINITE);
        setArray.add(anim2);
        set1.playTogether(setArray);
        set1.setDuration(2000);
        anim2 = null;

        set2 = new AnimatorSet();
        setArray = new ArrayList<>();
        anim3 = ObjectAnimator.ofFloat(image, "rotation", 0f, -90f, 0f, 90f, 180f, 270f, 360f);
        anim3.setRepeatCount(ValueAnimator.INFINITE);
        setArray.add(anim3);
        anim3 = ObjectAnimator.ofFloat(image, "scaleX", 1f,0.5f, 1.5f, 0.5f, 1.5f, 1f);
        anim3.setRepeatCount(ValueAnimator.INFINITE);
        setArray.add(anim3);
        anim3 = ObjectAnimator.ofFloat(image, "scaleY", 1f,.5f, 1.5f, 0.5f, 1.5f, 1f);
        anim3.setRepeatCount(ValueAnimator.INFINITE);
        setArray.add(anim3);
        set2.playTogether(setArray);
        set2.setDuration(2000);
        anim3 = null;
        count = new Count();
        count.setListener(this);

        userPreferences = this.getSharedPreferences("count", MODE_PRIVATE);
        count.setCount(userPreferences.getInt("count", 0));
        retrievedata();
    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.option,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case(R.id.Alarm):
                Intent intent;
                intent = new Intent(MainActivity.this, AlarmActivity.class);
                startActivity(intent);
                break;
            case(R.id.menu_btn):
                Intent settingmenu;
                settingmenu = new Intent(MainActivity.this, AppMenu.class);
                startActivity(settingmenu);
                break;

        }
        return super.onOptionsItemSelected(item);
    }
     */

    private void stopAnimations(){
        if (anim1.isRunning())
            anim1.end();
        if (set1.isRunning())
            set1.end();
        if (set2.isRunning())
            set2.end();
    }

    private void cleanupMediaPlayer(){
        stopAnimations();
        if(noise!=null) {
            if(noise.isPlaying())
                noise.stop();
            noise.release();
            noise = null;
        }
    }

    private void startRandomSound() {

        if(listofsounds.isEmpty()){
            Toast.makeText(this, "NO SOUND SELECTED", Toast.LENGTH_SHORT).show();

        }else{
            int value=(int)(Math.random()*(listofsounds.size()));
            int num = listofsounds.get(value);
            playSound(num);
        }
    }

    private void playSound(int num){
        cleanupMediaPlayer();
        if(switch2){
            count.increment();
            switch (num) {
                    case 3:
                        noise = MediaPlayer.create(this, R.raw.utonoise1);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise1_text), Toast.LENGTH_SHORT).show();
                        }
                        set2.start();
                        break;
                    case 4:
                        noise = MediaPlayer.create(this, R.raw.utonoise2);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise2_text), Toast.LENGTH_SHORT).show();
                        }
                        anim1.start();
                        break;
                    case 5:
                        noise = MediaPlayer.create(this, R.raw.utonoise3);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise3_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 6:
                        noise = MediaPlayer.create(this, R.raw.utonoise4);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise4_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 7:
                        noise = MediaPlayer.create(this, R.raw.utonoise5);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise5_text), Toast.LENGTH_SHORT).show();
                        }
                        set2.start();
                        break;
                    case 8:
                        noise = MediaPlayer.create(this, R.raw.utonoise6);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise6_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 9:
                        noise = MediaPlayer.create(this, R.raw.utonoise7);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise7_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 10:
                        noise = MediaPlayer.create(this, R.raw.utonoise8);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise8_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 11:
                        noise = MediaPlayer.create(this, R.raw.utonoise9);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise9_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 12:
                        noise = MediaPlayer.create(this, R.raw.utonoise10);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise10_text), Toast.LENGTH_SHORT).show();
                        }
                        set2.start();
                        break;
                    case 13:
                        noise = MediaPlayer.create(this, R.raw.utonoise11);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise11_text), Toast.LENGTH_SHORT).show();
                        }
                        set2.start();
                        break;
                    case 14:
                        noise = MediaPlayer.create(this, R.raw.utonoise12);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise12_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 15:
                        noise = MediaPlayer.create(this, R.raw.utonoise13);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise13_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 16:
                        noise = MediaPlayer.create(this, R.raw.utonoise14);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise14_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 17:
                        noise = MediaPlayer.create(this, R.raw.utonoise15);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise15_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 18:
                        noise = MediaPlayer.create(this, R.raw.utonoise16);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise16_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 19:
                        noise = MediaPlayer.create(this, R.raw.utonoise17);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise17_text), Toast.LENGTH_SHORT).show();
                        }
                        set2.start();
                        break;
                    case 20:
                        noise = MediaPlayer.create(this, R.raw.utonoise18);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise18_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 21:
                        noise = MediaPlayer.create(this, R.raw.utonoise19);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise19_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 22:
                        noise = MediaPlayer.create(this, R.raw.utonoise20);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise20_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 23:
                        noise = MediaPlayer.create(this, R.raw.utonoise21);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise21_text), Toast.LENGTH_SHORT).show();
                        }
                        set2.start();
                        break;
                    case 24:
                        noise = MediaPlayer.create(this, R.raw.utonoise22);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise22_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 25:
                        noise = MediaPlayer.create(this, R.raw.utonoise23);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise23_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 26:
                        noise = MediaPlayer.create(this, R.raw.utonoise24);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise24_text), Toast.LENGTH_SHORT).show();
                        }
                        set2.start();
                        break;
                    case 27:
                        noise = MediaPlayer.create(this, R.raw.utonoise25);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise25_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 28:
                        noise = MediaPlayer.create(this, R.raw.utonoise26);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise26_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 29:
                        noise = MediaPlayer.create(this, R.raw.utonoise27);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise27_text), Toast.LENGTH_SHORT).show();
                        }
                        anim1.start();
                        break;
                    case 30:
                        noise = MediaPlayer.create(this, R.raw.utonoise28);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise28_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 31:
                        noise = MediaPlayer.create(this, R.raw.utonoise29);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise29_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 32:
                        noise = MediaPlayer.create(this, R.raw.utonoise30);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise30_text), Toast.LENGTH_SHORT).show();
                        }
                        set2.start();
                        break;
                    case 33:
                        noise = MediaPlayer.create(this, R.raw.utonoise31);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise31_text), Toast.LENGTH_SHORT).show();
                        }
                        anim1.start();
                        break;
                    case 34:
                        noise = MediaPlayer.create(this, R.raw.utonoise32);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise32_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 35:
                        noise = MediaPlayer.create(this, R.raw.utonoise33);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise33_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 36:
                        noise = MediaPlayer.create(this, R.raw.utonoise34);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise34_text), Toast.LENGTH_SHORT).show();
                        }
                        set2.start();
                        break;
                    case 37:
                        noise = MediaPlayer.create(this, R.raw.utonoise35);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise35_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 38:
                        noise = MediaPlayer.create(this, R.raw.utonoise36);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise36_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 39:
                        noise = MediaPlayer.create(this, R.raw.utonoise37);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise37_text), Toast.LENGTH_SHORT).show();
                        }
                        set2.start();
                        break;
                    case 40:
                        noise = MediaPlayer.create(this, R.raw.utonoise38);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise38_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 41:
                        noise = MediaPlayer.create(this, R.raw.utonoise39);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise39_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 42:
                        noise = MediaPlayer.create(this, R.raw.utonoise40);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise40_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 43:
                        noise = MediaPlayer.create(this, R.raw.utonoise41);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise41_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 44:
                        noise = MediaPlayer.create(this, R.raw.utonoise42);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise42_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 45:
                        noise = MediaPlayer.create(this, R.raw.utonoise43);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise43_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 46:
                        noise = MediaPlayer.create(this, R.raw.utonoise44);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise44_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 47:
                        noise = MediaPlayer.create(this, R.raw.utonoise45);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise45_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 48:
                        noise = MediaPlayer.create(this, R.raw.utonoise46);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise46_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 49:
                        noise = MediaPlayer.create(this, R.raw.utonoise47);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise47_text), Toast.LENGTH_SHORT).show();
                        }
                        set2.start();
                        break;
                    case 50:
                        noise = MediaPlayer.create(this, R.raw.utonoise48);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise48_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 51:
                        noise = MediaPlayer.create(this, R.raw.utonoise49);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise49_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 52:
                        noise = MediaPlayer.create(this, R.raw.utonoise50);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise50_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 53:
                        noise = MediaPlayer.create(this, R.raw.utonoise51);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise51_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 54:
                        noise = MediaPlayer.create(this, R.raw.utonoise52);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise52_text), Toast.LENGTH_SHORT).show();
                        }
                        set2.start();
                        break;
                    case 55:
                        noise = MediaPlayer.create(this, R.raw.utonoise53);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise53_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 56:
                        noise = MediaPlayer.create(this, R.raw.utonoise54);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise54_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 57:
                        noise = MediaPlayer.create(this, R.raw.utonoise55);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise55_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 58:
                        noise = MediaPlayer.create(this, R.raw.utonoise56);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise56_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 59:
                        noise = MediaPlayer.create(this, R.raw.utonoise57);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise57_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 60:
                        noise = MediaPlayer.create(this, R.raw.utonoise58);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise58_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 61:
                        noise = MediaPlayer.create(this, R.raw.utonoise59);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise59_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 62:
                        noise = MediaPlayer.create(this, R.raw.utonoise60);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise60_text), Toast.LENGTH_SHORT).show();
                        }
                        set2.start();
                        break;
                    case 63:
                        noise = MediaPlayer.create(this, R.raw.utonoise61);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise61_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 64:
                        noise = MediaPlayer.create(this, R.raw.utonoise62);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise62_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 65:
                        noise = MediaPlayer.create(this, R.raw.utonoise63);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise63_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 66:
                        noise = MediaPlayer.create(this, R.raw.utonoise64);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise64_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 67:
                        noise = MediaPlayer.create(this, R.raw.utonoise65);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise65_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 68:
                        noise = MediaPlayer.create(this, R.raw.utonoise66);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise66_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 69:
                        noise = MediaPlayer.create(this, R.raw.utonoise67);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise67_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 70:
                        noise = MediaPlayer.create(this, R.raw.utonoise68);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise68_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 71:
                        noise = MediaPlayer.create(this, R.raw.utonoise69);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise69_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 72:
                        noise = MediaPlayer.create(this, R.raw.utonoise70);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise70_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 73:
                        noise = MediaPlayer.create(this, R.raw.utonoise71);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise71_text), Toast.LENGTH_SHORT).show();
                        }
                        set2.start();
                        break;
                    case 74:
                        noise = MediaPlayer.create(this, R.raw.utonoise72);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise72_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 75:
                        noise = MediaPlayer.create(this, R.raw.utonoise73);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise73_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 76:
                        noise = MediaPlayer.create(this, R.raw.utonoise74);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise74_text), Toast.LENGTH_SHORT).show();
                        }
                        anim1.start();
                        break;
                    case 77:
                        noise = MediaPlayer.create(this, R.raw.utonoise75);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise75_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 78:
                        noise = MediaPlayer.create(this, R.raw.utonoise76);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise76_text), Toast.LENGTH_SHORT).show();
                        }
                        anim1.start();
                        break;
                    case 79:
                        noise = MediaPlayer.create(this, R.raw.utonoise77);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise77_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 80:
                        noise = MediaPlayer.create(this, R.raw.utonoise78);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise78_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 81:
                        noise = MediaPlayer.create(this, R.raw.utonoise79);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise79_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 82:
                        noise = MediaPlayer.create(this, R.raw.utonoise80);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise80_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 83:
                        noise = MediaPlayer.create(this, R.raw.utonoise81);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise81_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 84:
                        noise = MediaPlayer.create(this, R.raw.utonoise82);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise82_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 85:
                        noise = MediaPlayer.create(this, R.raw.utonoise83);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise83_text), Toast.LENGTH_SHORT).show();
                        }
                        anim1.start();
                        break;
                    case 86:
                        noise = MediaPlayer.create(this, R.raw.utonoise84);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise84_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 87:
                        noise = MediaPlayer.create(this, R.raw.utonoise85);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise85_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 88:
                        noise = MediaPlayer.create(this, R.raw.utonoise86);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise86_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 89:
                        noise = MediaPlayer.create(this, R.raw.utonoise87);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise87_text), Toast.LENGTH_SHORT).show();
                        }
                        set2.start();
                        break;
                    case 90:
                        noise = MediaPlayer.create(this, R.raw.utonoise88);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise88_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 91:
                        noise = MediaPlayer.create(this, R.raw.utonoise89);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise89_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 92:
                        noise = MediaPlayer.create(this, R.raw.utonoise90);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise90_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 93:
                        noise = MediaPlayer.create(this, R.raw.utonoise91);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise91_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 94:
                        noise = MediaPlayer.create(this, R.raw.utonoise92);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise92_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 95:
                        noise = MediaPlayer.create(this, R.raw.utonoise93);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise93_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 96:
                        noise = MediaPlayer.create(this, R.raw.utonoise94);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise94_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 97:
                        noise = MediaPlayer.create(this, R.raw.utonoise95);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise95_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 98:
                        noise = MediaPlayer.create(this, R.raw.utonoise96);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise96_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 99:
                        noise = MediaPlayer.create(this, R.raw.utonoise97);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise97_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 100:
                        noise = MediaPlayer.create(this, R.raw.utonoise98);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise98_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 101:
                        noise = MediaPlayer.create(this, R.raw.utonoise99);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise99_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    case 102:
                        noise = MediaPlayer.create(this, R.raw.utonoise100);
                        noise.setOnCompletionListener(listener);
                        noise.start();
                        if (switch1) {
                            Toast.makeText(this, getString(R.string.noise100_text), Toast.LENGTH_SHORT).show();
                        }
                        set1.start();
                        break;
                    default:
                        Toast.makeText(this, "NO SOUND SELECTED", Toast.LENGTH_SHORT).show();
                        break;
                }

            }else{
            Toast.makeText(MainActivity.this, "NOT ACTIVE", Toast.LENGTH_SHORT).show();
        }
    }


    private void retrievedata(){

        userPreferences =getSharedPreferences("Chara",MODE_PRIVATE);
        charavalue= userPreferences.getInt("CharaValue",0);

        switch (charavalue) {
            case 0:
                image.setImageResource(R.drawable.uto0);
                break;
            case 1:
                image.setImageResource(R.drawable.uto1);
                break;
            case 2:
                image.setImageResource(R.drawable.uto2);
                break;
            case 3:
                image.setImageResource(R.drawable.uto3);
                break;
            default:
                image.setImageResource(R.drawable.uto4);
                break;
        }


        userPreferences =getSharedPreferences("DevMode",MODE_PRIVATE);
        DevCount= userPreferences.getInt("DevCount",0);
        if(DevCount==7){
            AlarmBTN.setVisibility(View.VISIBLE);
        }else {
            AlarmBTN.setVisibility(View.INVISIBLE);
        }


        listofsounds= new ArrayList<Integer>();


        userPreferences =getSharedPreferences("save0",MODE_PRIVATE);
        switch0= userPreferences.getBoolean("value0",false);
        if (userPreferences.getBoolean("value0",false)) {
            ButtonBar.setVisibility(View.VISIBLE);
        }else{
            ButtonBar.setVisibility(View.GONE);
        }

        userPreferences =getSharedPreferences("save1",MODE_PRIVATE);
        switch1= userPreferences.getBoolean("value1",true);

        userPreferences =getSharedPreferences("save2",MODE_PRIVATE);
        switch2= userPreferences.getBoolean("value2",false);




        userPreferences = getSharedPreferences("save3", MODE_PRIVATE);
        if (userPreferences.getBoolean("value3",true)) {
            listofsounds.add(3);
            SoundBTN1.setVisibility(View.VISIBLE);
        }else{
            SoundBTN1.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save4", MODE_PRIVATE);
        if (userPreferences.getBoolean("value4",true)) {
            listofsounds.add(4);
            SoundBTN2.setVisibility(View.VISIBLE);
        }else{
            SoundBTN2.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save5", MODE_PRIVATE);
        if (userPreferences.getBoolean("value5",true)) {
            listofsounds.add(5);
            SoundBTN3.setVisibility(View.VISIBLE);
        }else{
            SoundBTN3.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save6", MODE_PRIVATE);
        if (userPreferences.getBoolean("value6",true)) {
            listofsounds.add(6);
            SoundBTN4.setVisibility(View.VISIBLE);
        }else{
            SoundBTN4.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save7", MODE_PRIVATE);
        if (userPreferences.getBoolean("value7",true)) {
            listofsounds.add(7);
            SoundBTN5.setVisibility(View.VISIBLE);
        }else{
            SoundBTN5.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save8", MODE_PRIVATE);
        if (userPreferences.getBoolean("value8",true)) {
            listofsounds.add(8);
            SoundBTN6.setVisibility(View.VISIBLE);
        }else{
            SoundBTN6.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save9", MODE_PRIVATE);
        if (userPreferences.getBoolean("value9",true)) {
            listofsounds.add(9);
            SoundBTN7.setVisibility(View.VISIBLE);
        }else{
            SoundBTN7.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save10", MODE_PRIVATE);
        if (userPreferences.getBoolean("value10",true)) {
            listofsounds.add(10);
            SoundBTN8.setVisibility(View.VISIBLE);
        }else{
            SoundBTN8.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save11", MODE_PRIVATE);
        if (userPreferences.getBoolean("value11",true)) {
            listofsounds.add(11);
            SoundBTN9.setVisibility(View.VISIBLE);
        }else{
            SoundBTN9.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save12", MODE_PRIVATE);
        if (userPreferences.getBoolean("value12",true)) {
            listofsounds.add(12);
            SoundBTN10.setVisibility(View.VISIBLE);
        }else{
            SoundBTN10.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save13", MODE_PRIVATE);
        if (userPreferences.getBoolean("value13",true)) {
            listofsounds.add(13);
            SoundBTN11.setVisibility(View.VISIBLE);
        }else{
            SoundBTN11.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save14", MODE_PRIVATE);
        if (userPreferences.getBoolean("value14",true)) {
            listofsounds.add(14);
            SoundBTN12.setVisibility(View.VISIBLE);
        }else{
            SoundBTN12.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save15", MODE_PRIVATE);
        if (userPreferences.getBoolean("value15",true)) {
            listofsounds.add(15);
            SoundBTN13.setVisibility(View.VISIBLE);
        }else{
            SoundBTN13.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save16", MODE_PRIVATE);
        if (userPreferences.getBoolean("value16",true)) {
            listofsounds.add(16);
            SoundBTN14.setVisibility(View.VISIBLE);
        }else{
            SoundBTN14.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save17", MODE_PRIVATE);
        if (userPreferences.getBoolean("value17",true)) {
            listofsounds.add(17);
            SoundBTN15.setVisibility(View.VISIBLE);
        }else{
            SoundBTN15.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save18", MODE_PRIVATE);
        if (userPreferences.getBoolean("value18",true)) {
            listofsounds.add(18);
            SoundBTN16.setVisibility(View.VISIBLE);
        }else{
            SoundBTN16.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save19", MODE_PRIVATE);
        if (userPreferences.getBoolean("value19",true)) {
            listofsounds.add(19);
            SoundBTN17.setVisibility(View.VISIBLE);
        }else{
            SoundBTN17.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save20", MODE_PRIVATE);
        if (userPreferences.getBoolean("value20",true)) {
            listofsounds.add(20);
            SoundBTN18.setVisibility(View.VISIBLE);
        }else{
            SoundBTN18.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save21", MODE_PRIVATE);
        if (userPreferences.getBoolean("value21",true)) {
            listofsounds.add(21);
            SoundBTN19.setVisibility(View.VISIBLE);
        }else{
            SoundBTN19.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save22", MODE_PRIVATE);
        if (userPreferences.getBoolean("value22",true)) {
            listofsounds.add(22);
            SoundBTN20.setVisibility(View.VISIBLE);
        }else{
            SoundBTN20.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save23", MODE_PRIVATE);
        if (userPreferences.getBoolean("value23",true)) {
            listofsounds.add(23);
            SoundBTN21.setVisibility(View.VISIBLE);
        }else{
            SoundBTN21.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save24", MODE_PRIVATE);
        if (userPreferences.getBoolean("value24",true)) {
            listofsounds.add(24);
            SoundBTN22.setVisibility(View.VISIBLE);
        }else{
            SoundBTN22.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save25", MODE_PRIVATE);
        if (userPreferences.getBoolean("value25",true)) {
            listofsounds.add(25);
            SoundBTN23.setVisibility(View.VISIBLE);
        }else{
            SoundBTN23.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save26", MODE_PRIVATE);
        if (userPreferences.getBoolean("value26",true)) {
            listofsounds.add(26);
            SoundBTN24.setVisibility(View.VISIBLE);
        }else{
            SoundBTN24.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save27", MODE_PRIVATE);
        if (userPreferences.getBoolean("value27",true)) {
            listofsounds.add(27);
            SoundBTN25.setVisibility(View.VISIBLE);
        }else{
            SoundBTN25.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save28", MODE_PRIVATE);
        if (userPreferences.getBoolean("value28",true)) {
            listofsounds.add(28);
            SoundBTN26.setVisibility(View.VISIBLE);
        }else{
            SoundBTN26.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save29", MODE_PRIVATE);
        if (userPreferences.getBoolean("value29",true)) {
            listofsounds.add(29);
            SoundBTN27.setVisibility(View.VISIBLE);
        }else{
            SoundBTN27.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save30", MODE_PRIVATE);
        if (userPreferences.getBoolean("value30",true)) {
            listofsounds.add(30);
            SoundBTN28.setVisibility(View.VISIBLE);
        }else{
            SoundBTN28.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save31", MODE_PRIVATE);
        if (userPreferences.getBoolean("value31",true)) {
            listofsounds.add(31);
            SoundBTN29.setVisibility(View.VISIBLE);
        }else{
            SoundBTN29.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save32", MODE_PRIVATE);
        if (userPreferences.getBoolean("value32",true)) {
            listofsounds.add(32);
            SoundBTN30.setVisibility(View.VISIBLE);
        }else{
            SoundBTN30.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save33", MODE_PRIVATE);
        if (userPreferences.getBoolean("value33",true)) {
            listofsounds.add(33);
            SoundBTN31.setVisibility(View.VISIBLE);
        }else{
            SoundBTN31.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save34", MODE_PRIVATE);
        if (userPreferences.getBoolean("value34",true)) {
            listofsounds.add(34);
            SoundBTN32.setVisibility(View.VISIBLE);
        }else{
            SoundBTN32.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save35", MODE_PRIVATE);
        if (userPreferences.getBoolean("value35",true)) {
            listofsounds.add(35);
            SoundBTN33.setVisibility(View.VISIBLE);
        }else{
            SoundBTN33.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save36", MODE_PRIVATE);
        if (userPreferences.getBoolean("value36",true)) {
            listofsounds.add(36);
            SoundBTN34.setVisibility(View.VISIBLE);
        }else{
            SoundBTN34.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save37", MODE_PRIVATE);
        if (userPreferences.getBoolean("value37",true)) {
            listofsounds.add(37);
            SoundBTN35.setVisibility(View.VISIBLE);
        }else{
            SoundBTN35.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save38", MODE_PRIVATE);
        if (userPreferences.getBoolean("value38",true)) {
            listofsounds.add(38);
            SoundBTN36.setVisibility(View.VISIBLE);
        }else{
            SoundBTN36.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save39", MODE_PRIVATE);
        if (userPreferences.getBoolean("value39",true)) {
            listofsounds.add(39);
            SoundBTN37.setVisibility(View.VISIBLE);
        }else{
            SoundBTN37.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save40", MODE_PRIVATE);
        if (userPreferences.getBoolean("value40",true)) {
            listofsounds.add(40);
            SoundBTN38.setVisibility(View.VISIBLE);
        }else{
            SoundBTN38.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save41", MODE_PRIVATE);
        if (userPreferences.getBoolean("value41",true)) {
            listofsounds.add(41);
            SoundBTN39.setVisibility(View.VISIBLE);
        }else{
            SoundBTN39.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save42", MODE_PRIVATE);
        if (userPreferences.getBoolean("value42",true)) {
            listofsounds.add(42);
            SoundBTN40.setVisibility(View.VISIBLE);
        }else{
            SoundBTN40.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save43", MODE_PRIVATE);
        if (userPreferences.getBoolean("value43",true)) {
            listofsounds.add(43);
            SoundBTN41.setVisibility(View.VISIBLE);
        }else{
            SoundBTN41.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save44", MODE_PRIVATE);
        if (userPreferences.getBoolean("value44",true)) {
            listofsounds.add(44);
            SoundBTN42.setVisibility(View.VISIBLE);
        }else{
            SoundBTN42.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save45", MODE_PRIVATE);
        if (userPreferences.getBoolean("value45",true)) {
            listofsounds.add(45);
            SoundBTN43.setVisibility(View.VISIBLE);
        }else{
            SoundBTN43.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save46", MODE_PRIVATE);
        if (userPreferences.getBoolean("value46",true)) {
            listofsounds.add(46);
            SoundBTN44.setVisibility(View.VISIBLE);
        }else{
            SoundBTN44.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save47", MODE_PRIVATE);
        if (userPreferences.getBoolean("value47",true)) {
            listofsounds.add(47);
            SoundBTN45.setVisibility(View.VISIBLE);
        }else{
            SoundBTN45.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save48", MODE_PRIVATE);
        if (userPreferences.getBoolean("value48",true)) {
            listofsounds.add(48);
            SoundBTN46.setVisibility(View.VISIBLE);
        }else{
            SoundBTN46.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save49", MODE_PRIVATE);
        if (userPreferences.getBoolean("value49",true)) {
            listofsounds.add(49);
            SoundBTN47.setVisibility(View.VISIBLE);
        }else{
            SoundBTN47.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save51", MODE_PRIVATE);
        if (userPreferences.getBoolean("value51",true)) {
            listofsounds.add(51);
            SoundBTN49.setVisibility(View.VISIBLE);
        }else{
            SoundBTN49.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save52", MODE_PRIVATE);
        if (userPreferences.getBoolean("value52",true)) {
            listofsounds.add(52);
            SoundBTN50.setVisibility(View.VISIBLE);
        }else{
            SoundBTN50.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save53", MODE_PRIVATE);
        if (userPreferences.getBoolean("value53",true)) {
            listofsounds.add(53);
            SoundBTN51.setVisibility(View.VISIBLE);
        }else{
            SoundBTN51.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save54", MODE_PRIVATE);
        if (userPreferences.getBoolean("value54",true)) {
            listofsounds.add(54);
            SoundBTN52.setVisibility(View.VISIBLE);
        }else{
            SoundBTN52.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save55", MODE_PRIVATE);
        if (userPreferences.getBoolean("value55",true)) {
            listofsounds.add(55);
            SoundBTN53.setVisibility(View.VISIBLE);
        }else{
            SoundBTN53.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save56", MODE_PRIVATE);
        if (userPreferences.getBoolean("value56",true)) {
            listofsounds.add(56);
            SoundBTN54.setVisibility(View.VISIBLE);
        }else{
            SoundBTN54.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save57", MODE_PRIVATE);
        if (userPreferences.getBoolean("value57",true)) {
            listofsounds.add(57);
            SoundBTN55.setVisibility(View.VISIBLE);
        }else{
            SoundBTN55.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save58", MODE_PRIVATE);
        if (userPreferences.getBoolean("value58",true)) {
            listofsounds.add(58);
            SoundBTN56.setVisibility(View.VISIBLE);
        }else{
            SoundBTN56.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save59", MODE_PRIVATE);
        if (userPreferences.getBoolean("value59",true)) {
            listofsounds.add(59);
            SoundBTN57.setVisibility(View.VISIBLE);
        }else{
            SoundBTN57.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save60", MODE_PRIVATE);
        if (userPreferences.getBoolean("value60",true)) {
            listofsounds.add(60);
            SoundBTN58.setVisibility(View.VISIBLE);
        }else{
            SoundBTN58.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save61", MODE_PRIVATE);
        if (userPreferences.getBoolean("value61",true)) {
            listofsounds.add(61);
            SoundBTN59.setVisibility(View.VISIBLE);
        }else{
            SoundBTN59.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save62", MODE_PRIVATE);
        if (userPreferences.getBoolean("value62",true)) {
            listofsounds.add(62);
            SoundBTN60.setVisibility(View.VISIBLE);
        }else{
            SoundBTN60.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save63", MODE_PRIVATE);
        if (userPreferences.getBoolean("value63",true)) {
            listofsounds.add(63);
            SoundBTN61.setVisibility(View.VISIBLE);
        }else{
            SoundBTN61.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save64", MODE_PRIVATE);
        if (userPreferences.getBoolean("value64",true)) {
            listofsounds.add(64);
            SoundBTN62.setVisibility(View.VISIBLE);
        }else{
            SoundBTN62.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save65", MODE_PRIVATE);
        if (userPreferences.getBoolean("value65",true)) {
            listofsounds.add(65);
            SoundBTN63.setVisibility(View.VISIBLE);
        }else{
            SoundBTN63.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save66", MODE_PRIVATE);
        if (userPreferences.getBoolean("value66",true)) {
            listofsounds.add(66);
            SoundBTN64.setVisibility(View.VISIBLE);
        }else{
            SoundBTN64.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save67", MODE_PRIVATE);
        if (userPreferences.getBoolean("value67",true)) {
            listofsounds.add(67);
            SoundBTN65.setVisibility(View.VISIBLE);
        }else{
            SoundBTN65.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save68", MODE_PRIVATE);
        if (userPreferences.getBoolean("value68",true)) {
            listofsounds.add(68);
            SoundBTN66.setVisibility(View.VISIBLE);
        }else{
            SoundBTN66.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save69", MODE_PRIVATE);
        if (userPreferences.getBoolean("value69",true)) {
            listofsounds.add(69);
            SoundBTN67.setVisibility(View.VISIBLE);
        }else{
            SoundBTN67.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save70", MODE_PRIVATE);
        if (userPreferences.getBoolean("value70",true)) {
            listofsounds.add(70);
            SoundBTN68.setVisibility(View.VISIBLE);
        }else{
            SoundBTN68.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save71", MODE_PRIVATE);
        if (userPreferences.getBoolean("value71",true)) {
            listofsounds.add(71);
            SoundBTN69.setVisibility(View.VISIBLE);
        }else{
            SoundBTN69.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save72", MODE_PRIVATE);
        if (userPreferences.getBoolean("value72",true)) {
            listofsounds.add(72);
            SoundBTN70.setVisibility(View.VISIBLE);
        }else{
            SoundBTN70.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save73", MODE_PRIVATE);
        if (userPreferences.getBoolean("value73",true)) {
            listofsounds.add(73);
            SoundBTN71.setVisibility(View.VISIBLE);
        }else{
            SoundBTN71.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save74", MODE_PRIVATE);
        if (userPreferences.getBoolean("value74",true)) {
            listofsounds.add(74);
            SoundBTN72.setVisibility(View.VISIBLE);
        }else{
            SoundBTN72.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save75", MODE_PRIVATE);
        if (userPreferences.getBoolean("value75",true)) {
            listofsounds.add(75);
            SoundBTN73.setVisibility(View.VISIBLE);
        }else{
            SoundBTN73.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save76", MODE_PRIVATE);
        if (userPreferences.getBoolean("value76",true)) {
            listofsounds.add(76);
            SoundBTN74.setVisibility(View.VISIBLE);
        }else{
            SoundBTN74.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save77", MODE_PRIVATE);
        if (userPreferences.getBoolean("value77",true)) {
            listofsounds.add(77);
            SoundBTN75.setVisibility(View.VISIBLE);
        }else{
            SoundBTN75.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save78", MODE_PRIVATE);
        if (userPreferences.getBoolean("value78",true)) {
            listofsounds.add(78);
            SoundBTN76.setVisibility(View.VISIBLE);
        }else{
            SoundBTN76.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save79", MODE_PRIVATE);
        if (userPreferences.getBoolean("value79",true)) {
            listofsounds.add(79);
            SoundBTN77.setVisibility(View.VISIBLE);
        }else{
            SoundBTN77.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save80", MODE_PRIVATE);
        if (userPreferences.getBoolean("value80",true)) {
            listofsounds.add(80);
            SoundBTN78.setVisibility(View.VISIBLE);
        }else{
            SoundBTN78.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save81", MODE_PRIVATE);
        if (userPreferences.getBoolean("value81",true)) {
            listofsounds.add(81);
            SoundBTN79.setVisibility(View.VISIBLE);
        }else{
            SoundBTN79.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save82", MODE_PRIVATE);
        if (userPreferences.getBoolean("value82",true)) {
            listofsounds.add(82);
            SoundBTN80.setVisibility(View.VISIBLE);
        }else{
            SoundBTN80.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save83", MODE_PRIVATE);
        if (userPreferences.getBoolean("value83",true)) {
            listofsounds.add(83);
            SoundBTN81.setVisibility(View.VISIBLE);
        }else{
            SoundBTN81.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save84", MODE_PRIVATE);
        if (userPreferences.getBoolean("value84",true)) {
            listofsounds.add(84);
            SoundBTN82.setVisibility(View.VISIBLE);
        }else{
            SoundBTN82.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save85", MODE_PRIVATE);
        if (userPreferences.getBoolean("value85",true)) {
            listofsounds.add(85);
            SoundBTN83.setVisibility(View.VISIBLE);
        }else{
            SoundBTN83.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save86", MODE_PRIVATE);
        if (userPreferences.getBoolean("value86",true)) {
            listofsounds.add(86);
            SoundBTN84.setVisibility(View.VISIBLE);
        }else{
            SoundBTN84.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save87", MODE_PRIVATE);
        if (userPreferences.getBoolean("value87",true)) {
            listofsounds.add(87);
            SoundBTN85.setVisibility(View.VISIBLE);
        }else{
            SoundBTN85.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save88", MODE_PRIVATE);
        if (userPreferences.getBoolean("value88",true)) {
            listofsounds.add(88);
            SoundBTN86.setVisibility(View.VISIBLE);
        }else{
            SoundBTN86.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save89", MODE_PRIVATE);
        if (userPreferences.getBoolean("value89",true)) {
            listofsounds.add(89);
            SoundBTN87.setVisibility(View.VISIBLE);
        }else{
            SoundBTN87.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save90", MODE_PRIVATE);
        if (userPreferences.getBoolean("value90",true)) {
            listofsounds.add(90);
            SoundBTN88.setVisibility(View.VISIBLE);
        }else{
            SoundBTN88.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save91", MODE_PRIVATE);
        if (userPreferences.getBoolean("value91",true)) {
            listofsounds.add(91);
            SoundBTN89.setVisibility(View.VISIBLE);
        }else{
            SoundBTN89.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save92", MODE_PRIVATE);
        if (userPreferences.getBoolean("value92",true)) {
            listofsounds.add(92);
            SoundBTN90.setVisibility(View.VISIBLE);
        }else{
            SoundBTN90.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save93", MODE_PRIVATE);
        if (userPreferences.getBoolean("value93",true)) {
            listofsounds.add(93);
            SoundBTN91.setVisibility(View.VISIBLE);
        }else{
            SoundBTN91.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save94", MODE_PRIVATE);
        if (userPreferences.getBoolean("value94",true)) {
            listofsounds.add(94);
            SoundBTN92.setVisibility(View.VISIBLE);
        }else{
            SoundBTN92.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save95", MODE_PRIVATE);
        if (userPreferences.getBoolean("value95",true)) {
            listofsounds.add(95);
            SoundBTN93.setVisibility(View.VISIBLE);
        }else{
            SoundBTN93.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save96", MODE_PRIVATE);
        if (userPreferences.getBoolean("value96",true)) {
            listofsounds.add(96);
            SoundBTN94.setVisibility(View.VISIBLE);
        }else{
            SoundBTN94.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save97", MODE_PRIVATE);
        if (userPreferences.getBoolean("value97",true)) {
            listofsounds.add(97);
            SoundBTN95.setVisibility(View.VISIBLE);
        }else{
            SoundBTN95.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save98", MODE_PRIVATE);
        if (userPreferences.getBoolean("value98",true)) {
            listofsounds.add(98);
            SoundBTN96.setVisibility(View.VISIBLE);
        }else{
            SoundBTN96.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save99", MODE_PRIVATE);
        if (userPreferences.getBoolean("value99",true)) {
            listofsounds.add(99);
            SoundBTN97.setVisibility(View.VISIBLE);
        }else{
            SoundBTN97.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save100", MODE_PRIVATE);
        if (userPreferences.getBoolean("value100",true)) {
            listofsounds.add(100);
            SoundBTN98.setVisibility(View.VISIBLE);
        }else{
            SoundBTN98.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save101", MODE_PRIVATE);
        if (userPreferences.getBoolean("value101",true)) {
            listofsounds.add(101);
            SoundBTN99.setVisibility(View.VISIBLE);
        }else{
            SoundBTN99.setVisibility(View.GONE);
        }

        userPreferences = getSharedPreferences("save102", MODE_PRIVATE);
        if (userPreferences.getBoolean("value102",true)) {
            listofsounds.add(102);
            SoundBTN100.setVisibility(View.VISIBLE);
        }else{
            SoundBTN100.setVisibility(View.GONE);
        }


        //For explicit content
        if(DevCount==7){
            userPreferences = getSharedPreferences("save50", MODE_PRIVATE);
            if (userPreferences.getBoolean("value50",true)) {
                listofsounds.add(50);
                SoundBTN48.setVisibility(View.VISIBLE);
            }else{
                SoundBTN48.setVisibility(View.GONE);
            }
        }

    }

    @Override
    protected void onDestroy() {
        cleanupMediaPlayer();
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        cleanupMediaPlayer();
        super.onStop();
    }

    @Override
    protected void onResume() {
        retrievedata();
        if(isFullAuto){
            startRandomSound();
        }
        super.onResume();
    }

}