package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button ba,bb,bc,bd,be,bf,bg,bh,bi,btn;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int total=0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2); ba = findViewById(R.id.btn1);
        bb = findViewById(R.id.btn2);
        bc = findViewById(R.id.btn3);
        bd = findViewById(R.id.btn4);
        be = findViewById(R.id.btn5);
        bf = findViewById(R.id.btn6);
        bg = findViewById(R.id.btn7);
        bh = findViewById(R.id.btn8);
        bi = findViewById(R.id.btn9);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restartgame();
            }
        });
    }
    public void Check(View view) {
        Button currentbtn = (Button) view;
        if(currentbtn.getText().toString().equals("")) {
            total++;
            if (count == 0) {
                currentbtn.setText("X");
                count = 1;
            } else {
                currentbtn.setText("O");
                count = 0;
            }

            if (total > 4) {
                b1 = ba.getText().toString();
                b2 = bb.getText().toString();
                b3 = bc.getText().toString();
                b4 = bd.getText().toString();
                b5 = be.getText().toString();
                b6 = bf.getText().toString();
                b7 = bg.getText().toString();
                b8 = bh.getText().toString();
                b9 = bi.getText().toString();

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    Toast.makeText(this, "The Winner Is : " + b1, Toast.LENGTH_LONG).show();
                    restartgame();
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    Toast.makeText(this, "The Winner Is : " + b4, Toast.LENGTH_LONG).show();
                    restartgame();
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    Toast.makeText(this, "The Winner Is : " + b7, Toast.LENGTH_LONG).show();
                    restartgame();
                } else if (b1.equals(b4) && b4.equals(b7)  && !b1.equals("")) {
                    Toast.makeText(this, "The Winner Is : " + b1, Toast.LENGTH_LONG).show();
                    restartgame();
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    Toast.makeText(this, "The Winner Is : " + b2, Toast.LENGTH_LONG).show();
                    restartgame();
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    Toast.makeText(this, "The Winner Is : " + b3, Toast.LENGTH_LONG).show();
                    restartgame();
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    Toast.makeText(this, "The Winner Is : " + b1, Toast.LENGTH_LONG).show();
                    restartgame();
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    Toast.makeText(this, "The Winner Is : " + b3, Toast.LENGTH_LONG).show();
                    restartgame();
                }
                else if( !b1.equals("") && !b2.equals("") && !b3.equals("") && !b4.equals("") && !b5.equals("") && !b6.equals("") && !b7.equals("") && !b8.equals("") && !b9.equals("")){
                    Toast.makeText(this, "The Match Is Drawn : ", Toast.LENGTH_LONG).show();
                    restartgame();
                }
            }
        }
    }

    public void restartgame(){
        ba.setText("");
        bb.setText("");
        bc.setText("");
        bd.setText("");
        be.setText("");
        bf.setText("");
        bg.setText("");
        bh.setText("");
        bi.setText("");
        count=0;
        total=0;
    }
}