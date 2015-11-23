package com.example.bourymbodj.rainbowtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
       private TextView redc, orangec, yellowc,greenc,bluec,indigoc,violetc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redc= (TextView)(findViewById(R.id.red));
        orangec= (TextView)(findViewById(R.id.orange));
        yellowc= (TextView)(findViewById(R.id.yellow));
        greenc= (TextView)(findViewById(R.id.green));
        bluec= (TextView)(findViewById(R.id.blue));
        indigoc= (TextView)(findViewById(R.id.indigo));
        violetc= (TextView)(findViewById(R.id.violet));
        redc.setOnClickListener(this);
        orangec.setOnClickListener(this);
        yellowc.setOnClickListener(this);
        greenc.setOnClickListener(this);
        indigoc.setOnClickListener(this);
        violetc.setOnClickListener(this);
        bluec.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.red)
        { Toast.makeText(getApplicationContext(),"Red", Toast.LENGTH_LONG).show();
        }
        else if (v.getId()==R.id.yellow)
        {Toast.makeText(getApplicationContext(),"Yellow", Toast.LENGTH_LONG).show();
        }
        else if (v.getId()==R.id.blue)
        {Toast.makeText(getApplicationContext(),"Blue", Toast.LENGTH_LONG).show();
        }
        else if (v.getId()==R.id.indigo)
        {Toast.makeText(getApplicationContext(),"Indigo", Toast.LENGTH_LONG).show();
        }
        else if (v.getId()==R.id.violet)
        {Toast.makeText(getApplicationContext(),"Violet", Toast.LENGTH_LONG).show();
        }
        else if (v.getId()==R.id.orange)
        {Toast.makeText(getApplicationContext(),"Orange", Toast.LENGTH_LONG).show();
        }
        else if (v.getId()==R.id.green)
        {Toast.makeText(getApplicationContext(),"Green", Toast.LENGTH_LONG).show();
        }

    }
}
