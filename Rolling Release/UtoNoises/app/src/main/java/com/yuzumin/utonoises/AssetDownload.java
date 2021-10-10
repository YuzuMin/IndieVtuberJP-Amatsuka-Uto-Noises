package com.yuzumin.utonoises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;

public class AssetDownload extends AppCompatActivity {

    ImageView back_btn;

    ImageView bg0;

    ImageView switch3;
    ImageView switch4;
    ImageView switch5;
    ImageView switch6;
    ImageView switch7;
    ImageView switch8;
    ImageView switch9;
    ImageView switch10;
    ImageView switch11;
    ImageView switch12;
    ImageView switch13;
    ImageView switch14;
    ImageView switch15;
    ImageView switch16;
    ImageView switch17;
    ImageView switch18;
    ImageView switch19;
    ImageView switch20;
    ImageView switch21;
    ImageView switch22;
    ImageView switch23;
    ImageView switch24;
    ImageView switch25;
    ImageView switch26;
    ImageView switch27;
    ImageView switch28;
    ImageView switch29;
    ImageView switch30;
    ImageView switch31;
    ImageView switch32;
    ImageView switch33;
    ImageView switch34;
    ImageView switch35;
    ImageView switch36;
    ImageView switch37;
    ImageView switch38;
    ImageView switch39;
    ImageView switch40;
    ImageView switch41;
    ImageView switch42;
    ImageView switch43;
    ImageView switch44;
    ImageView switch45;
    ImageView switch46;
    ImageView switch47;
    ImageView switch48;
    ImageView switch49;
    ImageView switch50;
    ImageView switch51;
    ImageView switch52;
    ImageView switch53;
    ImageView switch54;
    ImageView switch55;
    ImageView switch56;
    ImageView switch57;
    ImageView switch58;
    ImageView switch59;
    ImageView switch60;
    ImageView switch61;
    ImageView switch62;
    ImageView switch63;
    ImageView switch64;
    ImageView switch65;
    ImageView switch66;
    ImageView switch67;
    ImageView switch68;
    ImageView switch69;
    ImageView switch70;
    ImageView switch71;
    ImageView switch72;
    ImageView switch73;
    ImageView switch74;
    ImageView switch75;
    ImageView switch76;
    ImageView switch77;
    ImageView switch78;
    ImageView switch79;
    ImageView switch80;
    ImageView switch81;
    ImageView switch82;
    ImageView switch83;
    ImageView switch84;
    ImageView switch85;
    ImageView switch86;
    ImageView switch87;
    ImageView switch88;
    ImageView switch89;
    ImageView switch90;
    ImageView switch91;
    ImageView switch92;
    ImageView switch93;
    ImageView switch94;
    ImageView switch95;
    ImageView switch96;
    ImageView switch97;
    ImageView switch98;
    ImageView switch99;
    ImageView switch100;
    ImageView switch101;
    ImageView switch102;

    String mainDirectory="https://github.com/YuzuMin/Hololive-CEO-Yagoo-Noises/raw/main/Assets/";
    String audioDirectory="Audio/";
    String imageDirectory="Image/";
    String videoDirectory="Video/";

    String audioExtension=".mp3";

    Integer DevCount;
    TableLayout explicitContainer;


    SharedPreferences userPreferences;
    SharedPreferences.Editor userPreferencesEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_downloads);
        getSupportActionBar().hide();

        back_btn=findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



        explicitContainer=findViewById(R.id.explicitContainer);
        retrievedata();







        bg0 =findViewById(R.id.bg0);
        bg0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://github.com/YuzuMin/Hololive-CEO-Yagoo-Noises/raw/main/Assets/Image/bg0.png"));
                startActivity(i);
            }
        });

        switch3 = findViewById(R.id.switch3);
        switch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"AAAAAAAAAAA!!"+audioExtension));
                startActivity(i);
            }
        });


        switch4 = findViewById(R.id.switch4);
        switch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Oh?!"+audioExtension));
                startActivity(i);
            }
        });


        switch5 = findViewById(R.id.switch5);
        switch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Everyone my friend"+audioExtension));
                startActivity(i);
            }
        });


        switch6 = findViewById(R.id.switch6);
        switch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"You are my little pogchamp"+audioExtension));
                startActivity(i);
            }
        });


        switch7 = findViewById(R.id.switch7);
        switch7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"blessed evil laugh"+audioExtension));
                startActivity(i);
            }
        });


        switch8 = findViewById(R.id.switch8);
        switch8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"I am angry"+audioExtension));
                startActivity(i);
            }
        });


        switch9 = findViewById(R.id.switch9);
        switch9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Watashi Ikatteiru"+audioExtension));
                startActivity(i);
            }
        });


        switch10 = findViewById(R.id.switch10);
        switch10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Anata denwa yo"+audioExtension));
                startActivity(i);
            }
        });


        switch11 = findViewById(R.id.switch11);
        switch11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"MMMMM!!"+audioExtension));
                startActivity(i);
            }
        });


        switch12 = findViewById(R.id.switch12);
        switch12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Iyada x4"+audioExtension));
                startActivity(i);
            }
        });


        switch13 = findViewById(R.id.switch13);
        switch13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Tenshi Breathing"+audioExtension));
                startActivity(i);
            }
        });


        switch14 = findViewById(R.id.switch14);
        switch14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Yabai yabai"+audioExtension));
                startActivity(i);
            }
        });


        switch15 = findViewById(R.id.switch15);
        switch15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Amatsuka Uto headpats"+audioExtension));
                startActivity(i);
            }
        });


        switch16 = findViewById(R.id.switch16);
        switch16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Ollie Chan I love you"+audioExtension));
                startActivity(i);
            }
        });


        switch17 = findViewById(R.id.switch17);
        switch17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Shinu"+audioExtension));
                startActivity(i);
            }
        });


        switch18 = findViewById(R.id.switch18);
        switch18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"10Q Arigatou"+audioExtension));
                startActivity(i);
            }
        });


        switch19 = findViewById(R.id.switch19);
        switch19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Nyaaa~~"+audioExtension));
                startActivity(i);
            }
        });


        switch20 = findViewById(R.id.switch20);
        switch20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Omedetou Hapi Basuday"+audioExtension));
                startActivity(i);
            }
        });


        switch21 = findViewById(R.id.switch21);
        switch21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Big yabe"+audioExtension));
                startActivity(i);
            }
        });


        switch22 = findViewById(R.id.switch22);
        switch22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Moe Moe Kyun"+audioExtension));
                startActivity(i);
            }
        });


        switch23 = findViewById(R.id.switch23);
        switch23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"NNNNNNNN!"+audioExtension));
                startActivity(i);
            }
        });


        switch24 = findViewById(R.id.switch24);
        switch24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Nico Nico Nii"+audioExtension));
                startActivity(i);
            }
        });


        switch25 = findViewById(R.id.switch25);
        switch25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Nice to Meet You"+audioExtension));
                startActivity(i);
            }
        });


        switch26 = findViewById(R.id.switch26);
        switch26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"NEEEEEEEEEEEE!!!"+audioExtension));
                startActivity(i);
            }
        });


        switch27 = findViewById(R.id.switch27);
        switch27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"omae wa mou shindeiru"+audioExtension));
                startActivity(i);
            }
        });


        switch28 = findViewById(R.id.switch28);
        switch28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"omae wa mou shindeiru ASMR"+audioExtension));
                startActivity(i);
            }
        });


        switch29 = findViewById(R.id.switch29);
        switch29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"LMAO"+audioExtension));
                startActivity(i);
            }
        });


        switch30 = findViewById(R.id.switch30);
        switch30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Big Kusa"+audioExtension));
                startActivity(i);
            }
        });


        switch31 = findViewById(R.id.switch31);
        switch31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Tenshi Giggle"+audioExtension));
                startActivity(i);
            }
        });


        switch32 = findViewById(R.id.switch32);
        switch32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"ABC Song"+audioExtension));
                startActivity(i);
            }
        });


        switch33 = findViewById(R.id.switch33);
        switch33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"HMPH"+audioExtension));
                startActivity(i);
            }
        });


        switch34 = findViewById(R.id.switch34);
        switch34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Hey Moona"+audioExtension));
                startActivity(i);
            }
        });


        switch35 = findViewById(R.id.switch35);
        switch35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Almond Almond"+audioExtension));
                startActivity(i);
            }
        });


        switch36 = findViewById(R.id.switch36);
        switch36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Heavy Breathing"+audioExtension));
                startActivity(i);
            }
        });


        switch37 = findViewById(R.id.switch37);
        switch37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Arigato Minna"+audioExtension));
                startActivity(i);
            }
        });


        switch38 = findViewById(R.id.switch38);
        switch38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Everyone is my husband, Okay"+audioExtension));
                startActivity(i);
            }
        });


        switch39 = findViewById(R.id.switch39);
        switch39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"BUN BUN CHA"+audioExtension));
                startActivity(i);
            }
        });


        switch40 = findViewById(R.id.switch40);
        switch40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Onii Chan"+audioExtension));
                startActivity(i);
            }
        });


        switch41 = findViewById(R.id.switch41);
        switch41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Papa"+audioExtension));
                startActivity(i);
            }
        });


        switch42 = findViewById(R.id.switch42);
        switch42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Ara Ara"+audioExtension));
                startActivity(i);
            }
        });


        switch43 = findViewById(R.id.switch43);
        switch43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Uto Pop Pop"+audioExtension));
                startActivity(i);
            }
        });


        switch44 = findViewById(R.id.switch44);
        switch44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Step Bro Nani o shimasu ka"+audioExtension));
                startActivity(i);
            }
        });


        switch45 = findViewById(R.id.switch45);
        switch45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Yoshi Yoshi Good Boy"+audioExtension));
                startActivity(i);
            }
        });


        switch46 = findViewById(R.id.switch46);
        switch46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Yo Wazzup"+audioExtension));
                startActivity(i);
            }
        });


        switch47 = findViewById(R.id.switch47);
        switch47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"I Love Everyone"+audioExtension));
                startActivity(i);
            }
        });


        switch48 = findViewById(R.id.switch48);
        switch48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Bye Bye"+audioExtension));
                startActivity(i);
            }
        });


        switch49 = findViewById(R.id.switch49);
        switch49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"WAAAAAA!"+audioExtension));
                startActivity(i);
            }
        });


        switch50 = findViewById(R.id.switch50);
        switch50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Watafaq"+audioExtension));
                startActivity(i);
            }
        });


        switch51 = findViewById(R.id.switch51);
        switch51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Im Die Thank You 4ever"+audioExtension));
                startActivity(i);
            }
        });


        switch52 = findViewById(R.id.switch52);
        switch52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Tenshi Noises"+audioExtension));
                startActivity(i);
            }
        });


        switch53 = findViewById(R.id.switch53);
        switch53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"My New PC"+audioExtension));
                startActivity(i);
            }
        });


        switch54 = findViewById(R.id.switch54);
        switch54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Yaaaaay"+audioExtension));
                startActivity(i);
            }
        });


        switch55 = findViewById(R.id.switch55);
        switch55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Sugoi Yo"+audioExtension));
                startActivity(i);
            }
        });


        switch56 = findViewById(R.id.switch56);
        switch56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Ureshii Nee"+audioExtension));
                startActivity(i);
            }
        });


        switch57 = findViewById(R.id.switch57);
        switch57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Very Strong Pc"+audioExtension));
                startActivity(i);
            }
        });


        switch58 = findViewById(R.id.switch58);
        switch58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Interesting"+audioExtension));
                startActivity(i);
            }
        });


        switch59 = findViewById(R.id.switch59);
        switch59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Pumpkin Pc"+audioExtension));
                startActivity(i);
            }
        });


        switch60 = findViewById(R.id.switch60);
        switch60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Eroge Suki Janai"+audioExtension));
                startActivity(i);
            }
        });


        switch61 = findViewById(R.id.switch61);
        switch61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"I am SIMP"+audioExtension));
                startActivity(i);
            }
        });


        switch62 = findViewById(R.id.switch62);
        switch62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Struggling Noises"+audioExtension));
                startActivity(i);
            }
        });


        switch63 = findViewById(R.id.switch63);
        switch63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Peko Laugh"+audioExtension));
                startActivity(i);
            }
        });


        switch64 = findViewById(R.id.switch64);
        switch64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Don't cry"+audioExtension));
                startActivity(i);
            }
        });


        switch65 = findViewById(R.id.switch65);
        switch65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Oya Oya"+audioExtension));
                startActivity(i);
            }
        });


        switch66 = findViewById(R.id.switch66);
        switch66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Shuba Shuba"+audioExtension));
                startActivity(i);
            }
        });


        switch67 = findViewById(R.id.switch67);
        switch67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Subaru Desu"+audioExtension));
                startActivity(i);
            }
        });


        switch68 = findViewById(R.id.switch68);
        switch68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Haachama Chama"+audioExtension));
                startActivity(i);
            }
        });


        switch69 = findViewById(R.id.switch69);
        switch69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Rushia Desu"+audioExtension));
                startActivity(i);
            }
        });


        switch70 = findViewById(R.id.switch70);
        switch70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Holy coughs"+audioExtension));
                startActivity(i);
            }
        });


        switch71 = findViewById(R.id.switch71);
        switch71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"GG Men"+audioExtension));
                startActivity(i);
            }
        });


        switch72 = findViewById(R.id.switch72);
        switch72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"otsukaresama deshita"+audioExtension));
                startActivity(i);
            }
        });


        switch73 = findViewById(R.id.switch73);
        switch73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Tenshi Cries"+audioExtension));
                startActivity(i);
            }
        });


        switch74 = findViewById(R.id.switch74);
        switch74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Study gambare"+audioExtension));
                startActivity(i);
            }
        });


        switch75 = findViewById(R.id.switch75);
        switch75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Dinner,Bath or Superchat?"+audioExtension));
                startActivity(i);
            }
        });


        switch76 = findViewById(R.id.switch76);
        switch76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Ahoy"+audioExtension));
                startActivity(i);
            }
        });


        switch77 = findViewById(R.id.switch77);
        switch77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Marine Desu"+audioExtension));
                startActivity(i);
            }
        });


        switch78 = findViewById(R.id.switch78);
        switch78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Minna"+audioExtension));
                startActivity(i);
            }
        });


        switch79 = findViewById(R.id.switch79);
        switch79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Smug Laugh"+audioExtension));
                startActivity(i);
            }
        });


        switch80 = findViewById(R.id.switch80);
        switch80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Satisfied Noises"+audioExtension));
                startActivity(i);
            }
        });


        switch81 = findViewById(R.id.switch81);
        switch81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"PANIK"+audioExtension));
                startActivity(i);
            }
        });


        switch82 = findViewById(R.id.switch82);
        switch82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Pain"+audioExtension));
                startActivity(i);
            }
        });


        switch83 = findViewById(R.id.switch83);
        switch83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Onii Chan Asa Dayo"+audioExtension));
                startActivity(i);
            }
        });


        switch84 = findViewById(R.id.switch84);
        switch84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Oh My God!"+audioExtension));
                startActivity(i);
            }
        });


        switch85 = findViewById(R.id.switch85);
        switch85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Chu"+audioExtension));
                startActivity(i);
            }
        });


        switch86 = findViewById(R.id.switch86);
        switch86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Nani"+audioExtension));
                startActivity(i);
            }
        });


        switch87 = findViewById(R.id.switch87);
        switch87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Doyukoto"+audioExtension));
                startActivity(i);
            }
        });


        switch88 = findViewById(R.id.switch88);
        switch88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Nande"+audioExtension));
                startActivity(i);
            }
        });


        switch89 = findViewById(R.id.switch89);
        switch89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Konpeko"+audioExtension));
                startActivity(i);
            }
        });


        switch90 = findViewById(R.id.switch90);
        switch90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"nab0i mama"+audioExtension));
                startActivity(i);
            }
        });


        switch91 = findViewById(R.id.switch91);
        switch91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"No Pettan"+audioExtension));
                startActivity(i);
            }
        });


        switch92 = findViewById(R.id.switch92);
        switch92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Normal Pettan"+audioExtension));
                startActivity(i);
            }
        });


        switch93 = findViewById(R.id.switch93);
        switch93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Pettan Janai no desu"+audioExtension));
                startActivity(i);
            }
        });


        switch94 = findViewById(R.id.switch94);
        switch94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Normal Tenshi"+audioExtension));
                startActivity(i);
            }
        });


        switch95 = findViewById(R.id.switch95);
        switch95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"I wink everyday"+audioExtension));
                startActivity(i);
            }
        });


        switch96 = findViewById(R.id.switch96);
        switch96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Uto's sister"+audioExtension));
                startActivity(i);
            }
        });


        switch97 = findViewById(R.id.switch97);
        switch97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Peko peko peko"+audioExtension));
                startActivity(i);
            }
        });


        switch98 = findViewById(R.id.switch98);
        switch98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Gambarimasu Onii Chan"+audioExtension));
                startActivity(i);
            }
        });


        switch99 = findViewById(R.id.switch99);
        switch99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"confused angry noises"+audioExtension));
                startActivity(i);
            }
        });


        switch100 = findViewById(R.id.switch100);
        switch100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Buruh"+audioExtension));
                startActivity(i);
            }
        });


        switch101 = findViewById(R.id.switch101);
        switch101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Oboeta"+audioExtension));
                startActivity(i);
            }
        });


        switch102 = findViewById(R.id.switch102);
        switch102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(mainDirectory+audioDirectory+"Poggars"+audioExtension));
                startActivity(i);
            }
        });

    }

    private void retrievedata() {
        //For explicit content

        userPreferences =getSharedPreferences("DevMode",MODE_PRIVATE);
        DevCount= userPreferences.getInt("DevCount",0);
        if(DevCount==7){
            explicitContainer.setVisibility(View.VISIBLE);
        }else{
            explicitContainer.setVisibility(View.GONE);
        }

    }
}