package com.example.ourmenu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.example.ourmenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //menuImageを長押ししたら、onCreateContextMenu()メソッドが呼び出されるようにする
        registerForContextMenu(binding.menuImage)
    }

    /**
     * メニュー表示
     * @param menu ContextMenu
     * @param v 長押しされたビュー
     * @param menuInfo コンテキスメニューの作成に関する追加情報
     */
    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        //menuTextのtextプロパティにメニュー名がセットされている時だけinflate()メソッどぉ実行する
        if(binding.menuText.text.isNotEmpty()){
            //作成したコンテキストメニューのIDと追加先のmenuを指定
            menuInflater.inflate(R.menu.context,menu)
        }
    }

    /**
     * メニューを表示するためのメソッド
     */
    override fun onCreateOptionsMenu(menu: Menu?): Boolean{
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    /**
     * メニューが選択されたときの処理
     */
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

    /**
     * コンテキストメニューが選択されたときの処理を書く
     * メールする、SMSするの処理
     */
    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            //メールを選択するときの処理
            R.id.mail -> {
                //件名
                val subject = getString(R.string.app_name)
                //テキスト
                val text = "${binding.menuText.text}が食べたい"
                //uriの取得 scheme,ssp
                val uri = Uri.fromParts("mailto","kanehiro@gmail.com",null)
                //ACTION_SENDTO:メールを送信する。
                val intent = Intent(Intent.ACTION_SENDTO,uri)
                //subject:メール件名としてメールアプリに渡す。
                intent.putExtra(Intent.EXTRA_SUBJECT,subject)
                intent.putExtra(Intent.EXTRA_TEXT,text)
                //resolveActivityメソッド：インテントを処理できるアプリが存在するか否かを確認する。
                if(intent.resolveActivity(packageManager) != null){
                    //intentのアクションを実行する。
                    startActivity(intent)
                }
                return true
            }
            //SMSを選択
            R.id.sms -> {
                val text = "${binding.menuText.text}が食べたい"
                val uri = Uri.fromParts("smsto","999999999",null)
                val intent = Intent(Intent.ACTION_SENDTO,uri)
                intent.putExtra("sms_body",text)
                if(intent.resolveActivity(packageManager) != null){
                    startActivity(intent)
                }
                return true
            }


        }
        return super.onContextItemSelected(item)
    }
}