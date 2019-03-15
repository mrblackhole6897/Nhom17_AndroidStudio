package com.example.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.myapp.R.*;
import static java.lang.Math.ceil;

public class MainActivity extends AppCompatActivity {



    ArrayList<card> list= new ArrayList<>();
    ImageView a,b,c,d,e,f;
    Button begin,all,xetdiem;
    player player1, player2;
    TextView diem1, diem2;
    int ss1 =0;
    int ss2 =0;
    int ss3 = 0;
    int ss4 =0;
    int ss5=0;
    int ss6 =0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        anhXa();

        begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                begin.setEnabled(false);
                a.setImageResource(drawable.b1fv);
                b.setImageResource(drawable.b1fv);
                c.setImageResource(drawable.b1fv);
                d.setImageResource(drawable.b1fv);
                e.setImageResource(drawable.b1fv);
                f.setImageResource(drawable.b1fv);

                list.removeAll(list);
                khoiTao();

                 ss1 = (int)ceil(Math.random()*(list.size()));
//                a.setImageResource((int)list.get(a1).getTen());
//                double ss =Math.random()*(list.size());
//                int sss = (int) ceil(ss);
//                Toast.makeText(MainActivity.this, "ss---"+sss +"list "+list.size(), Toast.LENGTH_SHORT).show();
                list.remove(ss1);



                 ss2 = (int)ceil(Math.random()*(list.size()));
//                b.setImageResource(list.get(b1).getTen());
                list.remove(ss2);

                 ss3 = (int)ceil(Math.random()*(list.size()));
//                c.setImageResource(list.get(c1).getTen());
                list.remove(ss3);

                 ss4 = (int)ceil(Math.random()*(list.size()));
//                d.setImageResource(list.get(a2).getTen());
                list.remove(ss4);

                 ss5 = (int)ceil(Math.random()*(list.size()));
//                e.setImageResource(list.get(b2).getTen());
                list.remove(ss5);

                 ss6 = (int)ceil(Math.random()*(list.size()));
//                f.setImageResource(list.get(c2).getTen());
                list.remove(ss6);


            }
        });
        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.removeAll(list);
                khoiTao();
//                Toast.makeText(MainActivity.this, "ss1"+ss1+"ss2"+ss2+"ss3"+ss3, Toast.LENGTH_SHORT).show();

                d.setImageResource(list.get(ss1).getTen());

                e.setImageResource(list.get(ss2).getTen());
                f.setImageResource(list.get(ss3).getTen());

            }
        });
        xetdiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int computer = tongDiem(list.get(ss4).getDiem(), list.get(ss5).getDiem(), list.get(ss6).getDiem());
                int nguoi = tongDiem(list.get(ss1).getDiem(), list.get(ss2).getDiem(), list.get(ss3).getDiem());

                a.setImageResource(list.get(ss4).getTen());
                b.setImageResource(list.get(ss5).getTen());
                c.setImageResource(list.get(ss6).getTen());


                if (nguoi > computer) {
                    Toast.makeText(MainActivity.this, "Bạn chiến thắng", Toast.LENGTH_SHORT).show();
                } else {
                    if (nguoi == computer) {
                        Toast.makeText(MainActivity.this, "Hòa nhau", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Computer chiến thắng", Toast.LENGTH_SHORT).show();
                    }
                }

                begin.setEnabled(true);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d.setImageResource(list.get(ss1).getTen());
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setImageResource(list.get(ss2).getTen());
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f.setImageResource(list.get(ss3).getTen());
            }
        });
    }

    public void  anhXa(){
        a = (ImageView)findViewById(id.anha);
        b = (ImageView)findViewById(id.anhb);
        c = (ImageView)findViewById(id.anhc);
        d = (ImageView)findViewById(id.anhd);
        e = (ImageView)findViewById(id.anhe);
        f = (ImageView)findViewById(id.anhf);
        begin = (Button)findViewById(id.begin);
        all = (Button)findViewById(id.all);
        xetdiem = (Button)findViewById(id.xetdiem);
        diem1 = (TextView)findViewById(id.diem1);
        diem2 = (TextView)findViewById(id.diem2);

    }
    public void khoiTao(){
        list.add(new card(1, drawable.h1));
        list.add(new card(1, drawable.d1));
        list.add(new card(1, drawable.c1));
        list.add(new card(1, drawable.s1));

        list.add(new card(2, drawable.h2));
        list.add(new card(2, drawable.d2));
        list.add(new card(2, drawable.c2));
        list.add(new card(2, drawable.s2));

        list.add(new card(3, drawable.h3));
        list.add(new card(3, drawable.d3));
        list.add(new card(3, drawable.c3));
        list.add(new card(3, drawable.s3));

        list.add(new card(4, drawable.h4));
        list.add(new card(4, drawable.d4));
        list.add(new card(4, drawable.c4));
        list.add(new card(4, drawable.s4));

        list.add(new card(5, drawable.h5));
        list.add(new card(5, drawable.d5));
        list.add(new card(5, drawable.c5));
        list.add(new card(5, drawable.s5));

        list.add(new card(6, drawable.h6));
        list.add(new card(6, drawable.d6));
        list.add(new card(6, drawable.c6));
        list.add(new card(6, drawable.s6));

        list.add(new card(7, drawable.h7));
        list.add(new card(7, drawable.d7));
        list.add(new card(7, drawable.c7));
        list.add(new card(7, drawable.s7));

        list.add(new card(8, drawable.h8));
        list.add(new card(8, drawable.d8));
        list.add(new card(8, drawable.c8));
        list.add(new card(8, drawable.s8));

        list.add(new card(9, drawable.h9));
        list.add(new card(9, drawable.d9));
        list.add(new card(9, drawable.c9));
        list.add(new card(9, drawable.s9));

        list.add(new card(10, drawable.h10));
        list.add(new card(10, drawable.d10));
        list.add(new card(10, drawable.c10));
        list.add(new card(10, drawable.s10));

        list.add(new card(10, drawable.hj));
        list.add(new card(10, drawable.dj));
        list.add(new card(10, drawable.cj));
        list.add(new card(10, drawable.sj));

        list.add(new card(10, drawable.hq));
        list.add(new card(10, drawable.dq));
        list.add(new card(10, drawable.cq));
        list.add(new card(10, drawable.sq));

        list.add(new card(10, drawable.hk));
        list.add(new card(10, drawable.dk));
        list.add(new card(10, drawable.ck));
        list.add(new card(10, drawable.sk));
    }
    public int tongDiem(int a1, int b1, int c1){
        int diem = (a1 + b1 + c1)%10;
        return diem;
    }
}
