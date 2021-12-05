package com.arash.altafi.navigationfragment.sample3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment.findNavController
import com.arash.altafi.navigationfragment.R
import com.google.android.material.button.MaterialButton

class FragmentThree : Fragment() {

    private lateinit var edtName : EditText
    private lateinit var btnIntent1: MaterialButton
    private lateinit var btnIntent2: MaterialButton

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_three, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        edtName = view.findViewById(R.id.edt_name)
        btnIntent1 = view.findViewById(R.id.btn_submit1)
        btnIntent2 = view.findViewById(R.id.btn_submit2)

        btnIntent1.setOnClickListener {
            val bundle : Bundle = Bundle()
            bundle.putString("name" , edtName.text.toString())
            Navigation.findNavController(requireView()).navigate(R.id.action_fragmentThree_to_fragmentFour , bundle)
        }

        btnIntent2.setOnClickListener {
            Navigation.findNavController(it).navigate(FragmentThreeDirections.actionFragmentThreeToFragmentFour(edtName.text.toString()))
        }

    }

}