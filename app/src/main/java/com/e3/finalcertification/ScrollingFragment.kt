package com.e3.finalcertification

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ScrollingFragment : Fragment() {

    private  lateinit var scrollingTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_scrolling, container, false)

        scrollingTextView = view.findViewById(R.id.fragment_scrolling_text_view)

        val blankFragment = BlankFragment()
        scrollingTextView.setOnClickListener {
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