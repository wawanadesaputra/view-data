package id.ac.polbeng.wawansaputra.viewdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import id.ac.polbeng.wawansaputra.viewdata.BuahAdapter
import id.ac.polbeng.wawansaputra.viewdata.databinding.ActivityRecylerBinding

class RecylerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecylerBinding

    var dataBuah = arrayOf(
        "Alpukat",
        "Durian",
        "Jambu Air",
        "Manggis",
        "Strawberry"
    )

    var dataGambar = arrayOf(
        R.drawable.alpukat,
        R.drawable.durian,
        R.drawable.jambuair,
        R.drawable.manggis,
        R.drawable.strawberry
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecylerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = BuahAdapter(this, dataBuah, dataGambar)
        val layoutManager = LinearLayoutManager(applicationContext)

        binding.recylerView.adapter = adapter
        binding.recylerView.layoutManager = layoutManager
    }
}
