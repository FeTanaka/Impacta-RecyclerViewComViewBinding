package br.com.impacta.recyclerviewcomviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.impacta.recyclerviewcomviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val AndroidVersionList = mutableListOf<String>(
        "Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread",
        "Honycomb", "Ice cream sandwich", "Jelly Bean",
        "Kitkat", "Lollipop", "Marshmallow", "Nougat",
        "Oreo", "Pie", "11", "12", "13"
    )

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var adaptador = AndroidVersionAdapter(AndroidVersionList)
        binding.recyclerView.adapter = adaptador
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

    }
}