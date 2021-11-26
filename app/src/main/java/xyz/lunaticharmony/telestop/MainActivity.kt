package xyz.lunaticharmony.telestop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun checkButton(view: View) {
        Toast.makeText(view.context, R.string.msg_float, Toast.LENGTH_SHORT).show();
    }
}