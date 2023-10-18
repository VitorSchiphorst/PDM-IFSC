package com.example.apptts;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {

    private TextToSpeech tts;
    private boolean ttsLoad = false;
    private EditText txtFala;
    String f;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tts = new TextToSpeech(this, this);
        txtFala = findViewById(R.id.txtFala);
    }

    @Override
    public void onInit(int status) {
        if(status == TextToSpeech.SUCCESS) {
            tts.setLanguage(Locale.getDefault());
            ttsLoad = true;
        }
    }

    public void falar(View view) {
        f = txtFala.getText().toString();
        if(ttsLoad) {
            tts.speak(f, TextToSpeech.QUEUE_FLUSH, null, null);
        }
    }
}