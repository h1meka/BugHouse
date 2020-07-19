package app.nickname.myoji.bughouse

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_load.*
import kotlinx.android.synthetic.main.activity_save.*

class SaveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save)

        val dataStore: SharedPreferences = getSharedPreferences("Second", Context.MODE_PRIVATE)
        //val editor = sharedPreferences.edit()
        saveButton.setOnClickListener {

                val text = input.text.toString()
                val editor = dataStore.edit()

                editor.putString("SAVE", text)
                editor.apply()

                val intent = Intent(this,LoadActivity::class.java)
                intent.putExtra("SAVE",text)
        }
    }
}
