package app.nickname.myoji.bughouse

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_count.*
import kotlinx.android.synthetic.main.activity_count.textView
import kotlinx.android.synthetic.main.activity_load.*

class LoadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load)


        val dataStore: SharedPreferences = getSharedPreferences("Second", Context.MODE_PRIVATE)

        val str    = dataStore.getString("SAVE","NoData" +
                "")
        textView.text =str

    }
}
