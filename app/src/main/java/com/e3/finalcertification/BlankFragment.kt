package com.e3.finalcertification

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class BlankFragment : Fragment() {
    private lateinit var literatureButton: Button
    private lateinit var russianLanguageButton: Button
    private lateinit var mathematicsButton: Button
    private lateinit var geographyButton: Button
    private lateinit var englishLanguageButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)

        literatureButton = view.findViewById(R.id.literature_button)
        russianLanguageButton = view.findViewById(R.id.russian_language_button)
        mathematicsButton = view.findViewById(R.id.mathematics_button)
        geographyButton = view.findViewById(R.id.geography_button)
        englishLanguageButton = view.findViewById(R.id.english_language_button)

        literatureButton.setOnClickListener {
            val scrollingFragment = ScrollingFragment()
            val commit = activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_container_view, scrollingFragment)
                ?.addToBackStack(null)
                ?.setReorderingAllowed(true)
                ?.commit()
        }

        englishLanguageButton.setOnClickListener {
            val recyclerViewFragment = RecyclerViewFragment()
            val commit = activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_container_view, recyclerViewFragment)
                ?.addToBackStack(null)
                ?.setReorderingAllowed(true)
                ?.commit()
        }

        return view
    }
}