package com.example.testrecyclerview

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("APP_LOG", "MainActivity onCreate")
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button1 -> {
                ItemListDialogFragment.newInstance(4).show(supportFragmentManager, ItemListDialogFragment.TAG)
//                val manager: FragmentManager = supportFragmentManager
//                val transaction: FragmentTransaction = manager.beginTransaction()
//                transaction.replace(R.id.bottom_part, ItemListDialogFragment())
//                transaction.addToBackStack(null)
//                transaction.commit()
            }
        }
    }


}