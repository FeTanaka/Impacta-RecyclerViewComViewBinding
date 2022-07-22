package br.com.impacta.recyclerviewcomviewbinding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.impacta.recyclerviewcomviewbinding.databinding.RecyclerViewItemBinding

class AndroidVersionAdapter(var conjuntoDados: MutableList<String>) :
    RecyclerView.Adapter<AndroidVersionAdapter.AndroidVersionViewHolder>() {

    inner class AndroidVersionViewHolder(var binding: RecyclerViewItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndroidVersionViewHolder {
        val binding =
            RecyclerViewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AndroidVersionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AndroidVersionViewHolder, position: Int) {
        holder.binding.textView.text = conjuntoDados[position]
    }

    override fun getItemCount(): Int {
        return conjuntoDados.size
    }

}