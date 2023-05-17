package sg.edu.rp.c346.id22016845.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleActivity1 extends AppCompatActivity {
    TextView moduleCheck;
    TextView moduleInfo;
    Button returnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1);
        moduleCheck=findViewById(R.id.textModuleCheck);
        moduleInfo=findViewById(R.id.textModules);
        returnButton=findViewById(R.id.buttonReturn);

        Intent intentReceived= getIntent();
        String modular= intentReceived.getStringExtra("Module");

        if(modular.equals("C203")){
            moduleCheck.setText("C203");
            moduleInfo.setText("Module Name: Web AppIn Development in php\n Module Code: C203\n Academic Year: 2023\n " +
                    "Semester Year: 2\n Module Credit: 4\n Venue: W65C");
        }
        else if(modular.equals("C206")){
            moduleCheck.setText("C206");
            moduleInfo.setText("Module Name: Software Development Process\n Module Code: C206\n Academic Year: 2023\n " +
                    "Semester Year: 2\n Module Credit: 4\n Venue: W65C");
        }
        else if(modular.equals("C218")){
            moduleCheck.setText("C218");
            moduleInfo.setText("Module Name: UI/UX Design for Apps\n Module Code: C218\n Academic Year: 2023\n" +
                    "Semester Year: 2\n Module Credit: 4\n Venue: W65C");
        }
        else if(modular.equals("C235")){
            moduleCheck.setText("C235");
            moduleInfo.setText("Module Name: IT Security and Management\n Module Code: C235\n Academic Year: 2023\n" +
                    "Semester Year: 2\n Module Credit: 4\n Venue: W65C");
        }
        else if(modular.equals("C346")){
            moduleCheck.setText("C346");
            moduleInfo.setText("Module Name: Mobile App Development\n Module Code: C346\n Academic Year: 2023\n" +
                    "Semester Year: 2\n Module Credit: 4\n Venue: E63A");
        }

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        }
}