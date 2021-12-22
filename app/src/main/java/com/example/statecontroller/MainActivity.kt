package com.example.statecontroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val NCREATE  = "Activity CREATED"
    val NSTART  = "Activity STARTED"
    val NRESUME  = "Activity RESUME"
    val NPAUSE  = "Activity PAUSED"
    val NSTOP  = "Activity STOPPED"
    val NRESTART  = "Activity RESTARTED"
    val NDESTROY = "Activity DESTROYED"

    private fun showMessage(s:String,gravity:Int?=null){
        val toast = Toast.makeText(this,s,Toast.LENGTH_SHORT)
        if (gravity!=null) toast.setGravity(gravity,0,0)
        toast.show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showMessage(NCREATE)
    }

    override fun onStart() {
        super.onStart()
        showMessage(NSTART,Gravity.LEFT)
    }

    override fun onResume() {
        super.onResume()
        showMessage(NRESUME,Gravity.TOP)
    }

    override fun onPause() {
        super.onPause()
        showMessage(NPAUSE,Gravity.RIGHT)
    }

    override fun onStop() {
        super.onStop()
        showMessage(NSTOP,Gravity.CENTER)
    }

    override fun onRestart() {
        super.onRestart()
        showMessage(NRESTART,Gravity.FILL_HORIZONTAL)
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage(NDESTROY,Gravity.FILL)
    }
}