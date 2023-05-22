package sg.edu.rp.c346.id21023028.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EnhancedAnswer extends AppCompatActivity {

    TextView tvAnswer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enhanced_answer);

        tvAnswer3 = findViewById(R.id.textView3);
        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");
        String ans = intentReceived.getStringExtra("Ans");
        tvAnswer3.setText(questionsSelected + " answer is: "+ans+" (Enhanced)");
    }
}