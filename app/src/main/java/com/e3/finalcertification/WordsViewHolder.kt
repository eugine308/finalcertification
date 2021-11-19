package com.e3.finalcertification

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WordsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(wordString: String){
        val wordsTextView: TextView=itemView.findViewById(R.id.words_text_view)
        wordsTextView.text = wordString
    }
}