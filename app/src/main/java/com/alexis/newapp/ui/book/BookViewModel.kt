package com.alexis.newapp.ui.book

import android.text.Spannable.Factory
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.alexis.newapp.BookReviewApplication
import com.alexis.newapp.data.model.BookModel
import com.alexis.newapp.repositories.BookRepository

class BookViewModel(private val repository: BookRepository) : ViewModel() {

    val name = MutableLiveData("")
    val year = MutableLiveData("")
    var status = MutableLiveData("")

    fun getBooks()= repository.getBook()

    fun addBooks(book: BookModel) = repository.addBooks(book)

    fun createBook(){
        if (!validateData()){
            status.value = WRONG_INFORMATION
            return
        }
        val book = BookModel(
            name.value!!,
            year.value!!
        )
        addBooks(book)
        clearData()

        status.value = BOOK_CREATED
    }

    private fun validateData(): Boolean {
        when{
            name.value.isNullOrEmpty() -> return false
            year.value.isNullOrEmpty() -> return false
        }
        return true
    }
    private fun clearData() {
        name.value = ""
        year.value = ""

    }
    fun clearStatus() {
        status.value = INACTIVE
    }


    companion object{
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as BookReviewApplication
                BookViewModel(app.BookRepository)
            }
        }
        const val BOOK_CREATED = "Movie created"
        const val WRONG_INFORMATION = "Wrong information"
        const val INACTIVE = ""
    }
}