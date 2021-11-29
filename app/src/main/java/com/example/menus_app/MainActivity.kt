package com.example.menus_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var clMain: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clMain = findViewById(R.id.clMain)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.create_msg -> {
                Snackbar.make(clMain, "New Chat", Snackbar.LENGTH_SHORT).show()
                return true
            }
            R.id.close_msg -> {
                Snackbar.make(clMain, "Chat closed successfully", Snackbar.LENGTH_SHORT).show()
                return true
            }
            R.id.del_msg -> {

                Snackbar.make(clMain, "Deleted Successfully", Snackbar.LENGTH_SHORT).show()
                return true
            }


        }
        return super.onOptionsItemSelected(item)
    }


}