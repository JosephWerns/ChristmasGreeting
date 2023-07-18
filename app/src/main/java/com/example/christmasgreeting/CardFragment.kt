package com.example.christmasgreeting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.christmasgreeting.databinding.FragmentCardBinding

/**
 * A simple [Fragment] subclass.
 * Use the [CardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CardFragment : Fragment(R.layout.fragment_card) {
    private val recipient = "Cindy"
    private val sender = "Joe"

    private var _binding: FragmentCardBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCardBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.greeting.text = resources.getString(R.string.greeting, recipient)
        binding.closing.text = resources.getString(R.string.closing, sender)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}