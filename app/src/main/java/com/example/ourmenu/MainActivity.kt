package com.example.ourmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.ourmenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.home -> {
                binding.menuImage.setImageResource(R.drawable.okasan)
                binding.menuText.text = ""
                return true
            }
            R.id.greencurry -> {
                binding.menuImage.setImageResource(R.drawable.greencurry)
                binding.menuText.text = getString(R.string.greencurry_text)
                return true
            }
            R.id.beefcurry -> {
                binding.menuImage.setImageResource(R.drawable.beefcurry)
                binding.menuText.text = getString(R.string.beefcurry_text)
                return true
            }
            R.id.tamoricurry -> {
                binding.menuImage.setImageResource(R.drawable.tamoricurry)
                binding.menuText.text = getString(R.string.tamoricurry_text)
                return true
            }
            R.id.katsucurry -> {
                binding.menuImage.setImageResource(R.drawable.katsucurry)
                binding.menuText.text = getString(R.string.katsucurry_text)
                return true
            }
            R.id.soba1 -> {
                binding.menuImage.setImageResource(R.drawable.soba1)
                binding.menuText.text = getString(R.string.soba1_text)
                return true
            }
            R.id.soba2 -> {
                binding.menuImage.setImageResource(R.drawable.soba2)
                binding.menuText.text = getString(R.string.soba2_text)
            }
            R.id.ramen1 -> {
                binding.menuImage.setImageResource(R.drawable.ramen1)
                binding.menuText.text = getString(R.string.ramen1_text)
            }
        }
    }
}