package com.alexis.newapp.ui.book

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.alexis.newapp.R
import com.alexis.newapp.data.model.BookModel


class NewBookFragment : Fragment() {

    private val bookViewModel: BookViewModel by activityViewModels {
        BookViewModel.Factory
    }


    private lateinit var sendInfo: Button
    private lateinit var PetName: EditText
    private lateinit var PetYear: EditText
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_book, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind()
        sendInfo.setOnClickListener(){
            addBook()
        }
    }

    private fun addBook() {
        val name = PetName.text.toString()
        val year = PetYear.text.toString()

        val Book = BookModel(name,year)

         bookViewModel.addBooks(Book)

        Log.d("NewBookFragment", bookViewModel.getBooks().toString())

        findNavController().popBackStack()
    }
    private fun bind() {
        sendInfo = view?.findViewById(R.id.BTN_send_Pet) !!
        PetName = view?.findViewById(R.id.ET_name) !!
        PetYear = view?.findViewById(R.id.ET_year) !!
    }
}


