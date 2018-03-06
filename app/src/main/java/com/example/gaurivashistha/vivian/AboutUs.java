package com.example.gaurivashistha.vivian;

import android.graphics.Typeface;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.KITKAT){
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/abc.ttf");
        tv1=(TextView)findViewById(R.id.abt);
        tv2=(TextView)findViewById(R.id.abtnec);
        tv4=(TextView)findViewById(R.id.nam1);
        tv5=(TextView)findViewById(R.id.nam2);
        tv6=(TextView)findViewById(R.id.nec);
        tv7=(TextView)findViewById(R.id.cont);
        tv8=(TextView)findViewById(R.id.mail);
        tv9=(TextView)findViewById(R.id.ver);
        tv1.setTypeface(custom_font);
        tv2.setTypeface(custom_font);
        tv4.setTypeface(custom_font);
        tv5.setTypeface(custom_font);
        tv6.setTypeface(custom_font);
        tv7.setTypeface(custom_font);
        tv8.setTypeface(custom_font);
        tv9.setTypeface(custom_font);

    }
    public void onBackPressed() {
        finish();
    }
}
