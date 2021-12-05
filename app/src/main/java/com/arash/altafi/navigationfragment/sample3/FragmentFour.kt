package com.arash.altafi.navigationfragment.sample3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import com.arash.altafi.navigationfragment.R
import com.google.android.material.button.MaterialButton

class FragmentFour : Fragment() {

    private lateinit var txtName : TextView
    private lateinit var btnBack : MaterialButton
    private var names : String = ""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_four, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        txtName = view.findViewById(R.id.txt_name)
        btnBack = view.findViewById(R.id.btn_back)

        btnBack.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_fragmentFour_to_fragmentThree)
//            OR
//            Navigation.findNavController(requireView()).navigateUp()
        }


        // bundle
//        names = requireArguments().getString("name").toString()
//        txtName.text = names

        //argumunt navigation
        names = FragmentFourArgs.fromBundle(requireArguments()).name
        txtName.text = names

    }

}