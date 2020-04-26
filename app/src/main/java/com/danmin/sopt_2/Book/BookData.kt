package com.danmin.sopt_2.Book

data class BookData(
    val bookTitle: String,
    val img_book: String
)

data class Books(val items: List<BookData>)