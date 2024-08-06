package com.ex.homework1_4month.ui.activity.fragments

import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.ex.homework1_4month.R
import com.ex.homework1_4month.UserData
import com.ex.homework1_4month.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpListeners()
    }

    private fun setUpListeners() {
        binding.apply {
          btnNext.setOnClickListener {
              val userName = etName.text.toString()
              val userEmail = editTextEmailAddress.text.toString()
              val userPassword = editTextTextPassword.text.toString().toIntOrNull()?:0

              if (userName.isNotEmpty() && userEmail.contains("@") && userPassword > 0){
                  findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(
                      UserData(userName,userEmail,userPassword)
                  ))
              }
              else{
                  Toast.makeText(requireContext(), "Заполните поля", Toast.LENGTH_SHORT).show()
              }
          }

        }

    }


}