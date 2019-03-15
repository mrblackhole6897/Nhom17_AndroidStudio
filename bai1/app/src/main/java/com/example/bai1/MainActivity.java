package com.example.bai1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView ten, cmnd, bang, sothich, thongtinbosung;
    EditText hoten, cm, thongtinbosungg;
    RadioButton bangcap1, bangcap2, bangcap3;
    CheckBox sothichh1, sothich2, sothichh3;
    Button nut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        xuli();
    }

    public void anhxa() {
        ten = findViewById(R.id.textView2);
        cmnd = findViewById(R.id.textView3);
        bang = findViewById(R.id.textView4);
        sothich = findViewById(R.id.TextView01);
        thongtinbosung = findViewById(R.id.TextView02);
        hoten = findViewById(R.id.editHoten);
        cm = findViewById(R.id.editCMND);
        thongtinbosungg = findViewById(R.id.editBosung);
        bangcap1 = findViewById(R.id.radtc);
        bangcap2 = findViewById(R.id.radcd);
        bangcap3 = findViewById(R.id.raddh);
        sothichh1 = findViewById(R.id.chkdocbao);
        sothich2 = findViewById(R.id.chkdocsach);
        sothichh3 = findViewById(R.id.chkdoccoding);
        nut = findViewById(R.id.btnguitt);


    }

    public void xuli() {
        nut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lala = hoten.getText().toString();
                lala = lala.trim();
                String lolo = cm.getText().toString();
                lolo = lolo.trim();
                if (lala.length() < 3) {


                    Toast.makeText(MainActivity.this, "Tên phải >= 3 ký tự", Toast.LENGTH_LONG).show();
                } else if ((lolo.length() < 9) || (lolo.length()>9)) {
                    Toast.makeText(MainActivity.this, "chứng minh nd == 9 số", Toast.LENGTH_LONG).show();
                } else {
                    String thongtin = "";
                    String thich = "";
                    if (bangcap1.isChecked()) {
                        thongtin = bangcap1.getText().toString();
                    } else if (bangcap2.isChecked()) {
                        thongtin = bangcap2.getText().toString();
                    } else if (bangcap3.isChecked()) {
                        thongtin = bangcap3.getText().toString();
                    }
                    if (sothichh1.isChecked()) {
                        thich += sothichh1.getText().toString()+"\n";
                    }
                    if (sothich2.isChecked()) {
                        thich += sothich2.getText().toString()+"\n";
                    }
                    if (sothichh3.isChecked()) {
                        thich += sothichh3.getText().toString();
                    }
                    String ketqua = "Thông Tin Cá Nhân" + "\n" +"Họ tên:" + lala + "\n"
                            +  "CMND:" + lolo + "\n"
                            +  "Bằng cấp:" + thongtin + "\n"
                            + sothich.getText().toString() + ":" + thich + "\n"
                            +  "Thông tin bổ sung:" + thongtinbosungg.getText().toString();


                    Toast.makeText(MainActivity.this, ketqua, Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
