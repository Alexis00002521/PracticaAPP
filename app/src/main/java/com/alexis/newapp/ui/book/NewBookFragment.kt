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
import com.alexis.newapp.databinding.FragmentNewBookBinding


class NewBookFragment : Fragment() {

    private val bookViewModel: BookViewModel by activityViewModels {
        BookViewModel.Factory
    }
    private lateinit var binding: FragmentNewBookBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         binding = FragmentNewBookBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setViewModel()
        observeStatus()
    }

    private fun setViewModel() {
        binding.viewmodel = bookViewModel
    }
    private fun observeStatus() {
        bookViewModel.status.observe(viewLifecycleOwner) { status ->
            when {
                status.equals(BookViewModel.WRONG_INFORMATION) -> {
                    Log.d(APP_TAG, status)
                    bookViewModel.clearStatus()
                }
                status.equals(BookViewModel.BOOK_CREATED) -> {
                    Log.d(APP_TAG, status)
                    Log.d(APP_TAG, bookViewModel.getBooks().toString())

                    bookViewModel.clearStatus()
                    findNavController().popBackStack()
                }
            }
        }
    }
    companion object {
        const val APP_TAG = "APP TAG"
    }
}


