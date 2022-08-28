package com.sariaydinalparslan.cryptoapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sariaydinalparslan.retrofit2.R
import com.sariaydinalparslan.retrofit2.model.Result
import kotlinx.android.synthetic.main.row_layout.view.*


class RecyclerViewAdapter(private val cryptoList : ArrayList<Result>) : RecyclerView.Adapter<RecyclerViewAdapter.RowHolder>() {
    class RowHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(cryptoModel: Result, position: Int){
            itemView.text1.text =cryptoModel.name
            itemView.text2.text =cryptoModel.gender
            itemView.text3.text =cryptoModel.created
            itemView.text4.text =cryptoModel.status
            itemView.text5.text =cryptoModel.name
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_layout,parent,false)
        return RowHolder(view)
    }
    override fun onBindViewHolder(holder: RowHolder, position: Int) {
        holder.bind(cryptoList[position],position)
    }
    override fun getItemCount(): Int {
        return cryptoList.size
    }
}