package com.danmin.sopt_2.Book

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.recyclerview.widget.RecyclerView
import com.danmin.sopt_2.R
import kotlinx.android.synthetic.main.item_book.view.*

class BookAdapter(
    private val context: Context,
    private val img_list: Array<Int>,
    private val text_list: Array<String>
) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_book, null)
        view.book_text.text = text_list[position]
        view.book_img.setImageResource(img_list[position])

        return view
    }

    override fun getItem(position: Int): Any {
        return 0
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return img_list.size
    }


}