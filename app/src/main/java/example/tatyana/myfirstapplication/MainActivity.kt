package example.tatyana.myfirstapplication

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "Мороз и солнце; день чудесный!")

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Еще ты дремлешь, друг прелестный —")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Пора, красавица, проснись:")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Открой сомкнуты негой взоры")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Навстречу северной Авроры,")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Звездою севера явись!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Звездою севера явись!")
    }
}