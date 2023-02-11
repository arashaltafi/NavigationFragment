package com.arash.altafi.navigationfragment.sample1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.arash.altafi.navigationfragment.R
import com.google.android.material.button.MaterialButton

class FragmentOne : Fragment() {

    private lateinit var btnIntent: MaterialButton

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnIntent = view.findViewById(R.id.btn_intent)

        btnIntent.setOnClickListener {
            Navigation.findNavController(requireView())
                .navigate(R.id.action_fragmentOne_to_fragmentTwo)
        }

        if (requireActivity().intent.getStringExtra("deepLink") == "resume") {
            findNavController().navigate(R.id.fragmentTwo)
        }

    }

}