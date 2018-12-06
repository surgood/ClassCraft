package ua.littlehome.classcraft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String name, surname;
    private int age;
    private int i = 0;
    private EditText et1,et2,et3;

    private TextView tvMI;

    private ArrayList<String> aboutPeople = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.ed1);
        et2 = findViewById(R.id.ed2);
        et3 = findViewById(R.id.ed3);

        tvMI = findViewById(R.id.myInfo);
    }
//--------------------------------------------------------------------------------------
    public void onBtnAddClick(View view){

        name = et1.getText().toString();
        surname = et2.getText().toString();
        try {
            age = Integer.parseInt(et3.getText().toString());
        }catch (Exception e){ }

        new Person(name,surname,age);
        new Pocket();

        aboutPeople.add( name ) ;
        aboutPeople.add( surname );
        aboutPeople.add( ""+age );

        String s;
        s = tvMI.getText().toString();

        if (aboutPeople.size()==3) {
            tvMI.setText(s + "\n" + aboutPeople.get(0) + " ; " + aboutPeople.get(1) + " ; " + aboutPeople.get(2) + " ;");
        }
        if (aboutPeople.size()>3) {
            tvMI.setText(s + "\n" + aboutPeople.get(aboutPeople.size()-3) + " ; " + aboutPeople.get(aboutPeople.size()-2) + " ; " + aboutPeople.get(aboutPeople.size()-1) + " ;");
        }


    }
//--------------------------------------------------------------------------------------------------
    public void onBtnSeeClick(View view) {

        try {
            i = Integer.parseInt(et3.getText().toString());
        }catch (Exception e){ }

        name = et1.getText().toString();
        surname = et2.getText().toString();
        age = i;

        Intent intent = new Intent(MainActivity.this, DataStorage.class);

        intent.putExtra("userName", et1.getText().toString());
        intent.putExtra("userSurname", et2.getText().toString());
        intent.putExtra("userAge", et3.getText().toString());

        startActivity(intent);
    }
//--------------------------------------------------------------------------------------------------
}
