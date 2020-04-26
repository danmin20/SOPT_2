package com.danmin.sopt_2.Book

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.danmin.sopt_2.R

class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val book_img = itemView.findViewById<ImageView>(R.id.book_img)
    val book_text = itemView.findViewById<TextView>(R.id.book_text)

    fun bind(bookData: BookData) {
        book_text.text = bookData.bookTitle
        Glide.with(itemView).load(bookData.img_book).into(book_img)
    }
}