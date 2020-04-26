package com.danmin.sopt_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.danmin.sopt_2.Book.BookAdapter
import com.danmin.sopt_2.Book.BookData
import com.danmin.sopt_2.Book.Books
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.item_book.*
import okhttp3.*
import java.io.IOException
import java.net.URL
import java.net.URLEncoder

class LibraryFragment : Fragment() {
    lateinit var bookAdapter: BookAdapter
    val datas = mutableListOf<BookData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_library, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bookAdapter = BookAdapter(view.context)
        loadDatas()
    }

    private fun loadDatas() {
        datas.apply {
            add(
                BookData(
                    bookTitle = "이정민",
                    img_book = "https://img.insight.co.kr/static/2018/09/15/700/747cl3tq51cz06846r5u.jpg"
                )
            )
        }
        bookAdapter.datas = datas
        bookAdapter.notifyDataSetChanged()
    }
}


