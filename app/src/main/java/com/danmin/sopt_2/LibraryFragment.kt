package com.danmin.sopt_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.danmin.sopt_2.Book.BookAdapter
import com.danmin.sopt_2.Book.BookData
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_library.*

class LibraryFragment : Fragment() {
    lateinit var bookAdapter: BookAdapter
    val datas = mutableListOf<BookData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_library, container, false)
    }

    val img = arrayOf(
        R.drawable.ai,
        R.drawable.css,
        R.drawable.html,
        R.drawable.id,
        R.drawable.jpg,
        R.drawable.js,
        R.drawable.mp4,
        R.drawable.pdf,
        R.drawable.png,
        R.drawable.psd,
        R.drawable.tiff,
        R.drawable.php
    )

    val text = arrayOf(
        "ai", "css", "html", "id", "jpg", "js", "mp4", "pdf", "png", "psd", "tiff", "php"
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bookAdapter = BookAdapter(view.context, img, text)
        gridview.adapter = bookAdapter
    }
}


