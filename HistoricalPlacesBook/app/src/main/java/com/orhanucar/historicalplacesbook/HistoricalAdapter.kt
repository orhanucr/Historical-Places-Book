package com.orhanucar.historicalplacesbook

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.orhanucar.historicalplacesbook.databinding.RecyclerRowBinding

class HistoricalAdapter(val historicialList: ArrayList<HistoricalPlaces>) : RecyclerView.Adapter<HistoricalAdapter.HistoricalHolder>() {

    class HistoricalHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoricalHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return HistoricalHolder(binding)
    }

    override fun onBindViewHolder(holder: HistoricalHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = historicialList.get(position).name
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,DetailsActivity :: class.java)
            intent.putExtra("historicalPlaces",historicialList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return historicialList.size
    }
}