package com.e3.finalcertification

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class WordsAdapter(private val worldsList: List<String>): RecyclerView.Adapter<WordsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordsViewHolder {
        val wordsItemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.words_list_item, parent)
        return WordsViewHolder(wordsItemView)
    }

    override fun onBindViewHolder(holder: WordsViewHolder, position: Int) {
        val wordString = worldsList[position]
        holder.bind(wordString)
    }

    override fun getItemCount(): Int {
        return  worldsList.size
    }
}