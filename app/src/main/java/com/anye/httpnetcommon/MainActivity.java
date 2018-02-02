package com.anye.httpnetcommon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.anye.lhttpnetlib.HttpClient;
import com.anye.lhttpnetlib.OnResultListener;

public class MainActivity extends AppCompatActivity {

    private TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mText = findViewById(R.id.id_text);
        HttpClient client = new HttpClient.Builder()
                .baseUrl("http://gank.io/api/data/")
                .url("福利/10/1")
                .build();
        client.get(new OnResultListener<String>() {

            @Override
            public void onSuccess(String result) {
                Log.e("lwz" , "onSuccess" + result);
                mText.setText(result);
            }

            @Override
            public void onError(int code, String message) {
                Log.e("lwz" , "onError" + message);
            }

            @Override
            public void onFailure(String message) {
                Log.e("lwz" , "onFailure=> " +  message);
            }
        });
    }
}
