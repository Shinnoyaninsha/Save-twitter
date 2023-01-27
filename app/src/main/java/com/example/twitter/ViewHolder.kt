package com.example.twitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.twitter.databinding.ActivityMainBinding

open class TLListAdapter(values: MutableLiveData<ArrayList<String>>) : ListAdapter<Int,TLListAdapter.TLViewHolder>(RowItemDiffCallback()) {

    class TLViewHolder private constructor(val binding: ActivityMainBinding) :
        RecyclerView.ViewHolder(binding.root) {
        companion object {
            fun from(parent: ViewGroup): TLViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ActivityMainBinding.inflate(layoutInflater, parent, false)
                return TLViewHolder(binding)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            TLViewHolder {
        return TLViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: TLListAdapter.TLViewHolder,
                                  position: Int) {
        holder.binding.num = getItem(position)

        holder.binding.executePendingBindings()

    }

}

