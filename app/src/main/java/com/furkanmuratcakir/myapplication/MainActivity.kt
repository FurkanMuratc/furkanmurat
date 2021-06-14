package com.furkanmuratcakir.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.furkanmuratcakir.myapplication.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {






    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        

        binding = ActivityMainBinding.inflate(layoutInflater)


        setContentView(binding.root)

        binding.fragment1Btn.setOnClickListener{
        replaceFragment(ListelemeFragment())


        }

        

        binding.fragment2Btn.setOnClickListener{
            replaceFragment(DetayFragment())
        }
        buttonhk.setOnClickListener { view ->
            val aktivite = Intent(this,HakkimdaActivity::class.java)
            startActivity(aktivite)
        }
    }

    private fun replaceFragment(fragment : Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentConteiner,fragment)
        fragmentTransaction.commit()
    }


}