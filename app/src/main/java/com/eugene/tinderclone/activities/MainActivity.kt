package com.eugene.tinderclone.activities

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity

import com.lorentzos.flingswipe.SwipeFlingAdapterView;

import java.util.ArrayList;

import com.eugene.tinderclone.R
import com.eugene.tinderclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var al = ArrayList<String>()
    private var arrayAdapter: ArrayAdapter<String>? = null
    private var i = 0

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        al.add("php");
        al.add("c");
        al.add("python");
        al.add("java");
        al.add("html");
        al.add("c++");
        al.add("css");
        al.add("javascript");

        arrayAdapter = ArrayAdapter(this, R.layout.item, R.id.helloText, al)

//        var frame = findViewById<View>(R.id.frame)
        binding.frame.adapter = arrayAdapter
        binding.frame.setFlingListener(object : SwipeFlingAdapterView.onFlingListener {
            override fun removeFirstObjectInAdapter() {
                Log.d("LIST", "removed object!");
                al.removeAt(0);
                arrayAdapter?.notifyDataSetChanged()
            }

            override fun onLeftCardExit(p0: Any?) {
                Toast.makeText(this@MainActivity, "Left!", Toast.LENGTH_SHORT).show()
            }

            override fun onRightCardExit(p0: Any?) {
                Toast.makeText(this@MainActivity, "Right!", Toast.LENGTH_SHORT).show()
            }

            override fun onAdapterAboutToEmpty(p0: Int) {
                al.add("XML $i");
                arrayAdapter?.notifyDataSetChanged()
                Log.d("LIST", "notified");
                i++
            }

            override fun onScroll(p0: Float) {

            }


        })
    }
}









