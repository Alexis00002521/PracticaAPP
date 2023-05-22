package com.alexis.newapp.ui.book

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import com.alexis.newapp.R
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ListBooksFragment : Fragment() {
    private lateinit var AddBookButton: FloatingActionButton
    private lateinit var CardPet: CardView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_books, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        CardPet=view?.findViewById(R.id.CV_PET)!!
        AddBookButton=view?.findViewById(R.id.floating_action_button)!!

        AddBookButton.setOnClickListener(){
            it.findNavController().navigate(R.id.action_listBooksFragment_to_newBookFragment)
        }
        CardPet.setOnClickListener(){
            it.findNavController().navigate(R.id.action_listBooksFragment_to_bookInformationFragment)
        }
    }



}