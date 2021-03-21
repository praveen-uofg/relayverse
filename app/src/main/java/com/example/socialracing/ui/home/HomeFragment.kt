package com.example.socialracing.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.socialracing.R
import com.example.socialracing.Runconfig
import com.example.socialracing.WaitingActivity

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var button: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.textView)

        button = root.findViewById(R.id.button3)

        return root
    }

    override fun onStart() {
        super.onStart()
        button.setOnClickListener{
            val intent = Intent(activity, WaitingActivity::class.java)
            startActivity(intent)
        }

    }

}