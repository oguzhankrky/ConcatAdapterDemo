package com.example.concatadapterdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.concatadapterdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val datalist: List<data> = listOf(data("oguzhan"), data("oguzhan"),data("oguzhan"),data("oguzhan"),data("oguzhan"),data("oguzhan"),data("oguzhan"),data("oguzhan"),data("oguzhan"),data("oguzhan"),data("oguzhan"),data("oguzhan"),data("oguzhan"),data("oguzhan"),data("oguzhan"),data("oguzhan") )
    val datalist2: List<data> = listOf(data("k"), data("k"),data("k"),data("k"),data("k"),data("k"),data("k"),data("k"),data("k"),data("k"),data("k"),data("k"),data("k"),data("k"))
    private val RowAdapter by lazy { RowAdapter(datalist) }
    private val RowAdapter2 by lazy { RowAdapter(datalist2) }
    private val HeaderAdapter by lazy { HeaderAdapter("          --> Header <---") }
    private val HeaderAdapter2 by lazy { HeaderAdapter("         --> Header2 <---") }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var concatAdapter=ConcatAdapter()
        concatAdapter=ConcatAdapter(
            HeaderAdapter,
            RowAdapter,
            HeaderAdapter2,
            RowAdapter2

        )

        binding.recyclerView.layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)
        binding.recyclerView.adapter=concatAdapter
    }


        /*val layoutManager :RecyclerView.LayoutManager= LinearLayoutManager(this)
        binding.recyclerView.layoutManager=layoutManager
        binding.recyclerView.adapter= RowAdapter(datalist)*/


}



