package com.alexis.newapp.data

import com.alexis.newapp.data.model.BookModel

val name = "Batman: The Dark Knight"
val year = "11"


// books two data
val name2 = "Blade Runner 2049"
val year2 = "12"


var movies = mutableListOf(
    BookModel(name, year),
    BookModel(name2, year2)
)