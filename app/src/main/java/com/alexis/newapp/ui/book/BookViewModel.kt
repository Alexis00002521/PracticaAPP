package com.alexis.newapp.ui.book

import android.text.Spannable.Factory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.alexis.newapp.BookReviewApplication
import com.alexis.newapp.data.model.BookModel
import com.alexis.newapp.repositories.BookRepository

class BookViewModel(private val repository: BookRepository) : ViewModel() {
    fun getBooks()= repository.getBook()

    fun addBooks(book: BookModel) = repository.addBooks(book)

    companion object{
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as BookReviewApplication
                BookViewModel(app.BookRepository)
            }
        }
    }
}