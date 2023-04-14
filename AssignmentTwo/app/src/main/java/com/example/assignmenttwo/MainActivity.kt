package com.example.assignmenttwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val sTask:Button = findViewById(R.id.btnTasks)
        sTask.setOnClickListener{
            var dialog_var = CustomDialogFragment()
            dialog_var.show(supportFragmentManager,"Custom Dialog")
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean { //onCreateOptionsMenu() function creates option menu.
        //inflate the menu to use in the action bar
        var inflater = menuInflater
        inflater.inflate(R.menu.app_menu, menu) //inflate() method of MenuInflater class inflates the displayed menu my_first_menu.
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.home -> MainActivity()
            R.id.work -> CustomDialogFragment()
        }
        return super.onOptionsItemSelected(item)
    }

    fun recieveFeedback(feedback: String) {
        val workOn : TextView = findViewById(R.id.tvWorkOn)
        val work = "Start working on: "
        workOn.text =  work + feedback;
    }


}