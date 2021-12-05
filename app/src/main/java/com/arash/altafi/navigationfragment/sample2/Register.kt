package com.arash.altafi.navigationfragment.sample2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation
import com.arash.altafi.navigationfragment.R

class Register : Fragment() {

    var sharedUsserInfo: SharedUsserInfo?= null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_register, container, false)

        sharedUsserInfo = SharedUsserInfo(requireContext())

        var edtName:EditText = view.findViewById(R.id.username_text)
        var btnSignUp:Button = view.findViewById(R.id.signup_btn)

        btnSignUp.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_register_to_match)
            sharedUsserInfo?.saveUser(edtName.text.toString())
        }

        return view
    }
}
