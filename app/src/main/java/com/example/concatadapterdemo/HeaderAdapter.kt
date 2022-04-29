package com.example.concatadapterdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.header.view.*
import kotlinx.android.synthetic.main.row_layout.view.*

class HeaderAdapter(private var headertext:String): RecyclerView.Adapter<HeaderAdapter.HeaderHolder>() {


        inner class HeaderHolder(view: View): RecyclerView.ViewHolder(view) {

            fun bind() {
                itemView.header_title.text = headertext
            }

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaderHolder {
            val view= LayoutInflater.from(parent.context).inflate(R.layout.header,parent,false)
            return HeaderHolder(view)
        }

        override fun onBindViewHolder(holder: HeaderHolder, position: Int) {
            holder.bind()
        }

        override fun getItemCount(): Int {
            return 1
        }




}