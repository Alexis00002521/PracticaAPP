package com.alexis.newapp


import android.app.Application
import com.alexis.newapp.data.books
import com.alexis.newapp.repositories.BookRepository


class BookReviewApplication : Application() {
    val BookRepository: BookRepository by lazy {
        BookRepository(books)
    }
}