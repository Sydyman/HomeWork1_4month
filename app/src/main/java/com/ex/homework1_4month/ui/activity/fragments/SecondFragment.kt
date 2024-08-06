package com.ex.homework1_4month.ui.activity.fragments

import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.ex.homework1_4month.R
import com.ex.homework1_4month.UserData
import com.ex.homework1_4month.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private val args by navArgs<SecondFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()

    }

    private fun getData() {
        val data = args.Data
        binding.tvGetName.text = data.name
        binding.tvGetEmail.text = data.email
        binding.tvGetPassword.text = data.password.toString()
    }


}