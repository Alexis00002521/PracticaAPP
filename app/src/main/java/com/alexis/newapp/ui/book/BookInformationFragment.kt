package com.alexis.newapp.ui.book

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.alexis.newapp.R
import com.alexis.newapp.databinding.FragmentBookInformationBinding

class BookInformationFragment : Fragment() {
    private lateinit var binding: FragmentBookInformationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBookInformationBinding.inflate(inflater, container, false)
        return binding.root
    }

}