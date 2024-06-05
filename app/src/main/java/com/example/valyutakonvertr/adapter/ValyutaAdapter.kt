package com.example.valyutakonvertr.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.valyutakonvertr.databinding.ItemRvBinding
import com.example.valyutakonvertr.models.Valyuta

class ValyutaAdapter(val list:ArrayList<Valyuta>):RecyclerView.Adapter<ValyutaAdapter.Vh>() {
    inner class Vh(val itemRvBinding: ItemRvBinding):ViewHolder(itemRvBinding.root){
        fun onBind(valyuta: Valyuta){
            itemRvBinding.nomi.text = valyuta.CcyNm_UZ
            itemRvBinding.valyuta.text = valyuta.Ccy
            itemRvBinding.qiymati.text = valyuta.Rate
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }


    override fun getItemCount(): Int = list.size


    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }
}