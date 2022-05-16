package xyz.lunaticharmony.telestop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun checkButton(view: View) {
//        R.id.extendedFloatingActionButton.extend()
        val efab: ExtendedFloatingActionButton = findViewById(R.id.extendedFloatingActionButton)
        efab.extend()
//        Toast.makeText(view.context, R.string.msg_float, Toast.LENGTH_SHORT).show();
    }
}