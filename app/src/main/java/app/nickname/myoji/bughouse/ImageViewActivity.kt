package app.nickname.myoji.bughouse

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import coil.api.load
import kotlinx.android.synthetic.main.activity_image_view.*

class ImageViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?
                         // , persistentState: PersistableBundle?
    ) {
        super.onCreate(savedInstanceState
           // , persistentState
        )
        setContentView(R.layout.activity_image_view)

        val url = "https://life-is-tech.com/materials/images/summer2019_desktop_3.jpg"
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.load(url)

        getImageButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_OPEN_DOCUMENT)
            intent.addCategory(Intent.CATEGORY_OPENABLE)
                intent.type = "image/*"

            startActivityForResult(intent, 100)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 100 && resultCode == Activity.RESULT_OK) {
            imageView.load(data?.data)
        }
    }
}
