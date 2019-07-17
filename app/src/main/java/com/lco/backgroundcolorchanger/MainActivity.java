package com.lco.backgroundcolorchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    RelativeLayout my_layout;
    SeekBar seekbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        my_layout =(RelativeLayout)findViewById(R.id.mylayout);
        seekbar = (SeekBar)findViewById(R.id.sb);

        seekbar.setOnSeekBarChangeListener(seekBarChangeListner);
    }
    private SeekBar.OnSeekBarChangeListener seekBarChangeListner=new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {

            my_layout.setBackgroundColor( progress);
            if(progress < 10 )
                my_layout.setBackgroundColor(Color.BLACK);
            else if(progress >10 && progress <= 20)
                my_layout.setBackgroundColor(Color.DKGRAY);
            else if(progress > 20 && progress <= 30)
                my_layout.setBackgroundColor(Color.GRAY);
            else if(progress > 30 && progress <= 40)
                my_layout.setBackgroundColor(Color.LTGRAY);
            else if(progress > 40 && progress <= 50)
                my_layout.setBackgroundColor(Color.BLUE);
            else if(progress > 50 && progress <= 60)
                my_layout.setBackgroundColor(Color.GREEN);
            else if(progress > 60 && progress <= 70)
                my_layout.setBackgroundColor(Color.YELLOW);
            else if(progress > 70 && progress <= 80)
                my_layout.setBackgroundColor(Color.MAGENTA);
            else if(progress > 80 && progress <= 90)
                my_layout.setBackgroundColor(Color.RED);

            else
                my_layout.setBackgroundColor(Color.WHITE);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
}