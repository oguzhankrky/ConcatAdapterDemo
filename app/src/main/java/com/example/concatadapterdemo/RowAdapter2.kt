package com.example.concatadapterdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_layout.view.*


class RowAdapter2(private val dataList:List<data>): RecyclerView.Adapter<RowAdapter2.RowHolder2>() {

        inner class RowHolder2(view: View): RecyclerView.ViewHolder(view) {

            fun bind(position: Int) {
                itemView.textname.text = dataList[position].name

            }
        }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder2 {
            val view= LayoutInflater.from(parent.context).inflate(R.layout.row_layout,parent,false)
            return RowHolder2(view)
        }

        override fun onBindViewHolder(holder: RowHolder2, position: Int) {
        holder.bind(position)
        }
        override fun getItemCount(): Int {
            return dataList.size
        }



}
