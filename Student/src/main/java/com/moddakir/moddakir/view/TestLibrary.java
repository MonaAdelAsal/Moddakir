package com.moddakir.moddakir.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.moddakir.moddakir.R;
import com.moddakir.mylibrary.view.agora.AgoraActivity;

public class TestLibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_library);
        AgoraActivity.CallRandomTeacher(TestLibrary.this, "male", "ahmed", "+201112072662");

    }
}