package id.ac.polbeng.wawansaputra.viewdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.polbeng.wawansaputra.viewdata.databinding.ActivityDetailBuahBinding

class DetailBuahActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBuahBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBuahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val namaBuah = intent.getStringExtra("nama")
        val image = intent.getIntExtra("gambar", 0)

        binding.tvNamaBuah.text = namaBuah
        binding.imgBuah.setImageResource(image)
    }
}
