package mchehab.com.kotlinapp

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import mchehab.com.kotlinapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
        binding.mainActivity = this
    }

    fun onButtonClickListener(view: View) {
        AlertDialog.Builder(this)
                .setNegativeButton("Dismiss") { dialog, _ -> dialog.dismiss() }
                .setCancelable(false)
                .setTitle("Button Clicked!")
                .create()
                .show()
    }
}