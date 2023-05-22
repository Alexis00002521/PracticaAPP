package com.alexis.newapp.repositories

import com.alexis.newapp.data.model.BookModel

class BookRepository(private val books: MutableList<BookModel>) {
    fun getBook()= books
    fun addBooks(book: BookModel) = books.add(book)
}