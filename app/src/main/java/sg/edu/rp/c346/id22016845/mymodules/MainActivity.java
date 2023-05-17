package sg.edu.rp.c346.id22016845.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView module1;
    TextView module2;
    TextView module3;
    TextView module4;
    TextView module5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        module1=findViewById(R.id.textC203Module);
        module2=findViewById(R.id.textC206Module);
        module3=findViewById(R.id.textC218Module);
        module4=findViewById(R.id.textC235Module);
        module5=findViewById(R.id.textC346Module);

        module1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity1.class);
                intent.putExtra("Module","C203");
                startActivity(intent);
            }
        });

        module2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity1.class);
                intent.putExtra("Module","C206");
                startActivity(intent);
            }
        });

        module3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity1.class);
                intent.putExtra("Module", "C218");
                startActivity(intent);
            }
        });

        module4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity1.class);
                intent.putExtra("Module","C235");
                startActivity(intent);
            }
        });

        module5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity1.class);
                intent.putExtra("Module","C346");
                startActivity(intent);
            }
        });
    }
}