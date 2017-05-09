package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity implements View.OnClickListener {

    EditText input;
    TextView helloText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input=(EditText)findViewById(R.id.editText);
        helloText=(TextView)findViewById(R.id.helloText);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==button.getId()){
            helloText.setText("");
            String content=input.getText().toString();
            helloText.setText(content);
        }
    }

}
