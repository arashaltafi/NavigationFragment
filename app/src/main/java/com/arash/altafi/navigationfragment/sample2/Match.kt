package com.arash.altafi.navigationfragment.sample2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.arash.altafi.navigationfragment.R

class Match : Fragment() {

    var sharedUsserInfo: SharedUsserInfo?= null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_match, container, false)


        view.findViewById<View>(R.id.play_btn3).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_match_to_inGame)
        }
        return view
    }

    override fun onStart() {
        super.onStart()
        sharedUsserInfo = SharedUsserInfo(requireContext())
        if (sharedUsserInfo?.getUser()?.length == 0)
        {
            Navigation.findNavController(requireView()).navigate(R.id.action_match_to_navigation)
        }
    }

}
