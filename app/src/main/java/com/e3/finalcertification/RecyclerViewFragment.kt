package com.e3.finalcertification

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewFragment : Fragment() {

    private  lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recycler_view, container, false)

        recyclerView = view.findViewById(R.id.wordsRecyclerView)

//        recyclerView.layoutManager =
//            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
// LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
// В этом месте время вышло, разбирался с контекстом во фрагменте

/*        val wordsList: List<String> = listOf("Aaaaaaaa", "Bbbbbbbbb",
            "Cccccccccc", "Ddddddddd", "Eeeeeeeeeee", "Ffffffffff",
            "Ggggggggggg", "Aaaaaaaa", "Bbbbbbbbb", "Cccccccccc",
            "Ddddddddd", "Eeeeeeeeeee", "Ffffffffff")
 */
//        recyclerView.adapter = WordsAdapter(wordsList)

        recyclerView.setOnClickListener {
            val blankFragment = BlankFragment()
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_container_view, blankFragment)
                ?.addToBackStack(null)
                ?.setReorderingAllowed(true)
                ?.commit()
        }
        return view
    }
}