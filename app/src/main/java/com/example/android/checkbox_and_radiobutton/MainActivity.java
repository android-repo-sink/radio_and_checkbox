
package com.example.android.checkbox_and_radiobutton;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswer(View view) {
        Intent it = new Intent();
        it.addCategory("Dial");
        it.setAction(Intent.CATEGORY_APP_MESSAGING);
        if (it.resolveActivity(getPackageManager()) != null)
            startActivity(it);
        /*
        TextView resultBox = (TextView) findViewById(R.id.selected_answer);
        RadioGroup radiogroup = (RadioGroup) findViewById(R.id.radioGroup);
        if(radiogroup.getCheckedRadioButtonId()==-1)
            return;
        RadioButton selectedAnswerView = (RadioButton) findViewById(radiogroup.getCheckedRadioButtonId());
        resultBox.setText(selectedAnswerView.getText());
        radiogroup.clearCheck();
        selectedAnswerView.setChecked(false);
//        radiogroup.check(R.id.C);
        CheckBox checkbox = (CheckBox)findViewById(R.id.checbox);

        checkbox.setChecked(true);
        checkbox.setChecked(false);
        checkbox.toggle();

         */
    }

    public void editText(View view) {
        EditText textI = (EditText) findViewById(R.id.textI);
        TextView resultBox = (TextView) findViewById(R.id.selected_answer);
//        textI.setInputType(EditorInfo.TYPE_CLASS_PHONE);
        textI.clearFocus();
    }

}