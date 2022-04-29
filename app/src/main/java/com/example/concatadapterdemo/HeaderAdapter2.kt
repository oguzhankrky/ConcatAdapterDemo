package com.example.concatadapterdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.header.view.*

class HeaderAdapter2(private var headertext:String): RecyclerView.Adapter<HeaderAdapter2.HeaderHolder2>() {


    inner class HeaderHolder2(view: View) : RecyclerView.ViewHolder(view) {

        fun bind() {
            itemView.header_title.text = headertext
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaderHolder2 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.header, parent, false)
        return HeaderHolder2(view)
    }

    override fun onBindViewHolder(holder: HeaderHolder2, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        return 1
    }
}
