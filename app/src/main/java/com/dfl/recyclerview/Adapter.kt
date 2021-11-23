package com.dfl.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

    class Adapter (private val context: Context, val ipatItem: MutableList<ListItem>): RecyclerView.Adapter<Adapter.ViewHolder>(){
    
override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
    val inflater = this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    val vista = inflater.inflate(R.layout.item,parent, false)
    return ViewHolder(vista)
}

    override fun getItemCount(): Int = ipatItem.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(ipatItem[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val hourView : TextView = view.findViewById(R.id.hourTextView)
        val dateView : TextView = view.findViewById(R.id.dateTextView)

        fun bind(item: ListItem) {
            hourView.text = item.hour
            dateView.text = item.date
        }
    }


}