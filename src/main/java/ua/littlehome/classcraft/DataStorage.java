package ua.littlehome.classcraft;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DataStorage extends Activity {
    private TextView tv1,tv2,tv3;
    private String userName;
    private String userSurname;
    private String userAge;

    private TextView tvO;

    private String s;
    private int count, i;

//--------------------------------------------------------------------------------------------------
    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        tv1 = findViewById(R.id.label1);
        tv2 = findViewById(R.id.label2);
        tv3 = findViewById(R.id.label3);

        tvO = findViewById(R.id.labelFirst);

        userName = getIntent().getExtras().getString("userName");
        userSurname = getIntent().getExtras().getString("userSurname");
        userAge = getIntent().getExtras().getString("userAge");

        tv1.setText(userName);
        tv2.setText(userSurname);
        tv3.setText(userAge);


        count = Pocket.getSize();
        s = tvO.getText().toString()+" "+String.valueOf(count)+" values";

        for(i = 0; i<=count-3; i+=3 ){
            tvO.setText("\n" + Pocket.getStringList().get(i) + " ; " + Pocket.getStringList().get(i+1) + " ; " + Pocket.getStringList().get(i+2) + " ;");
            s += tvO.getText().toString();
        }

            tvO.setText(s);

    }
//--------------------------------------------------------------------------------------------------

    public void onBtnBackClick(View view){
        finish();
    }

}
