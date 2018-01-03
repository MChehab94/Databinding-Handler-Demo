package mchehab.com.databindinghandlerdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mchehab.com.databindinghandlerdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setMainActivity(this);
    }

    public void onButtonClickListener(View view){
        new AlertDialog.Builder(this)
                .setNegativeButton("Dismiss", (dialog, which) -> {
                    dialog.dismiss();
                })
                .setCancelable(false)
                .setTitle("Button Clicked!")
                .create()
                .show();
    }
}