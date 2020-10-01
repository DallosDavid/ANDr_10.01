package com.example.andr_1001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private ImageView imageh1,imageh2,imageh3,imageh4;
    private Button buttonNovel,buttonCsokkent,buttonTipperl;
    private TextView textTipperltSzam;
    private Random r;
    private  int tippltSzam,random,elet;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        random=6;


        buttonNovel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tippltSzam<10)
                {
                    tippltSzam++;
                    textTipperltSzam.setText(tippltSzam+"");
                }else {
                    //Hiba uzenet.
                }
            }
        });

        buttonCsokkent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tippltSzam > 1){
                    tippltSzam--;
                    textTipperltSzam.setText(tippltSzam+"");
                }else{
                    //Hiba
                }
            }
        });

        buttonTipperl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tippltSzam<random)
                {
                 //TODO:nagyob
                    eletCsokkent();
                }else if(tippltSzam>random){
                    eletCsokkent();
                    //TODO:kiseb
                }else{
                    //TODO:Játékos nyert/Játék vége.
                }
            }
        });


    }

    private void eletCsokkent() {
        switch (elet)
        {
            case 4:imageh4.setImageResource(R.drawable.heart1);//Kép modositás
                elet--;
                break;
            case 3:imageh3.setImageResource(R.drawable.heart1);//Kép modositás
                elet--;
                break;
            case 2:imageh2.setImageResource(R.drawable.heart1);//Kép modositás
                elet--;
                break;
            case 1:imageh1.setImageResource(R.drawable.heart1);//Kép modositás
                elet--;
                //TODO:Ablak meg haltal;
                break;
            default:
                break;
        }
    }

    private void init() {
        imageh1=findViewById(R.id.iv_hp1);
        imageh2=findViewById(R.id.iv_hp2);
        imageh3=findViewById(R.id.iv_hp3);
        imageh4=findViewById(R.id.iv_hp4);
        buttonNovel=findViewById(R.id.btn_novel);
        buttonTipperl=findViewById(R.id.btn_tippel);
        buttonCsokkent=findViewById(R.id.btn_csoken);
        textTipperltSzam=findViewById(R.id.text_tippelt_szam);
        r=new Random();
        tippltSzam=1;
        random=r.nextInt(10)+1;
        elet=4;
    }



}
