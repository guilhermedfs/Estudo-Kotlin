package com.testing.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        var toast_true = Toast.makeText(
            this,
            R.string.correct_toast,
            Toast.LENGTH_SHORT)
        toast_true.setGravity(Gravity.CENTER, 0, 0)

        var toast_false = Toast.makeText(
            this,
            R.string.incorrect_toast,
            Toast.LENGTH_SHORT)
        toast_false.setGravity(Gravity.TOP, 0, 0)

        trueButton.setOnClickListener{ view: View ->
            toast_false.show()
        }

        falseButton.setOnClickListener{ view: View ->
            toast_true.show()
        }
    }

}