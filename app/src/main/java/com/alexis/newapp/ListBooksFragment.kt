package com.alexis.newapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ListBooksFragment : Fragment() {
    private lateinit var AddBookButton: FloatingActionButton


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_books, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        AddBookButton.setOnClickListener(){
            it.findNavController().navigate(R.id.action_listBooksFragment_to_newBookFragment)
        }
    }

    private fun bind() {
        AddBookButton=view?.findViewById(R.id.floating_action_button)!!
    }

}