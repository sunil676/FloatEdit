package com.sunil.floatedit;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements TextView.OnEditorActionListener{

    private EditText mUsername;
    private EditText mPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsername = (EditText) findViewById(R.id.edit_login);
        mUsername.setOnEditorActionListener(this);
        mPassword = (EditText) findViewById(R.id.edit_password);
        mPassword.setOnEditorActionListener(this);


    }

    @Override
    public boolean onEditorAction(TextView textView, int actionId, KeyEvent event) {
        if (textView == mPassword) {
            switch (actionId) {
                case EditorInfo.IME_ACTION_DONE:
                   // submit();
                    return true;
            }
        }
        return false;
    }

}
