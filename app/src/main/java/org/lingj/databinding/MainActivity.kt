package org.lingj.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**Set Name to a variable and then show it in textview*/
        /*--------------------Start--------------------------*/
        val name = "Niloy Biswas"
        findViewById<TextView>(R.id.txt_name).text = name

        /*--------------------End--------------------------*/

    }
}
