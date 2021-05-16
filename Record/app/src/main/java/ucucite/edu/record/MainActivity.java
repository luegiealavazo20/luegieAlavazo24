package ucucite.edu.record;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);

    }

    public void verifydata(View view) {
        String strusername = username.getText().toString();
        String strpassword = password.getText().toString();


        if (strusername.equals("luegie@gmail.com") && strpassword.equals("luegie1234")){

            Intent intent = new Intent(this, LuegieData.class);
            startActivity(intent);

        }else if (strusername.equals("allyson@gmail.com") && strpassword.equals("allyson1234")){

            Intent intent = new Intent(this, AllysonData.class);
            startActivity(intent);

        }else if (strusername.equals("kamlom@gmail.com") && strpassword.equals("kamlom1234")){

            Intent intent = new Intent(this, kamlomSesor.class);
            startActivity(intent);

        }else if (strusername.equals("nicole@gmail.com") && strpassword.equals("nicole1234")){

            Intent intent = new Intent(this, NicoleData.class);
            startActivity(intent);

        }else{

            Toast.makeText(this, "Username or Password is Incorrect!", Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}