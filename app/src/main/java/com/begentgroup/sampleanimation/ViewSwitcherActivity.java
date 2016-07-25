package com.begentgroup.sampleanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;

public class ViewSwitcherActivity extends AppCompatActivity {

    String[] items = {"abcd", "efgh" , "test1", "가나다라", "xyz!"};

    int index = 0;

    TextSwitcher switcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_switcher);
        switcher = (TextSwitcher)findViewById(R.id.textSwitcher);
        Button btn = (Button)findViewById(R.id.btn_change);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = (TextView)switcher.getNextView();
                tv.setText(items[index]);
                index = (index + 1) < items.length ? index+1 : 0;
                switcher.showNext();
            }
        });
    }


}
