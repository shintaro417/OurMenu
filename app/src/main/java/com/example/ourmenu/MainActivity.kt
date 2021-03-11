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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean{
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
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
                return true
            }
            R.id.ramen2 -> {
                binding.menuImage.setImageResource(R.drawable.ramen2)
                binding.menuText.text = getString(R.string.ramen2_text)
                return true
            }
            R.id.nabeyaki -> {
                binding.menuImage.setImageResource(R.drawable.nabeyaki)
                binding.menuText.text = getString(R.string.nabeyaki_text)
                return true
            }
            R.id.udon -> {
                binding.menuImage.setImageResource(R.drawable.udon)
                binding.menuText.text = getString(R.string.udon_text)
                return true
            }
            R.id.hiyashi -> {
                binding.menuImage.setImageResource(R.drawable.hiyashi)
                binding.menuText.text = getString(R.string.hiyashi_text)
                return true
            }
            R.id.oden -> {
                binding.menuImage.setImageResource(R.drawable.oden)
                binding.menuText.text = getString(R.string.oden_text)
                return true
            }
            R.id.osyarenabe -> {
                binding.menuImage.setImageResource(R.drawable.osyarenabe)
                binding.menuText.text = getString(R.string.osyarenabe_text)
                return true
            }
            R.id.beefbowl -> {
                binding.menuImage.setImageResource(R.drawable.beefbowl)
                binding.menuText.text = getString(R.string.beefobowl_text)
                return true
            }
            R.id.peperoncino -> {
                binding.menuImage.setImageResource(R.drawable.peperoncino)
                binding.menuText.text = getString(R.string.peperoncino_text)
                return true
            }
            R.id.hiroshima -> {
                binding.menuImage.setImageResource(R.drawable.hiroshima)
                binding.menuText.text = getString(R.string.hiroshima_text)
                return true
            }
            R.id.hayashi -> {
                binding.menuImage.setImageResource(R.drawable.hayashi)
                binding.menuText.text = getString(R.string.hayashi_text)
                return true
            }
            R.id.ankake -> {
                binding.menuImage.setImageResource(R.drawable.ankake)
                binding.menuText.text = getString(R.string.ankake_text)
                return true
            }
            R.id.baigai -> {
                binding.menuImage.setImageResource(R.drawable.baigai)
                binding.menuText.text = getString(R.string.baigai_text)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}