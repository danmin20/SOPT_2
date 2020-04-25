package com.danmin.sopt_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.danmin.sopt_2.Recycler.FeedAdapter
import com.danmin.sopt_2.Recycler.FeedData
import com.danmin.sopt_2.Recycler.VerticalItemDecorator
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    lateinit var feedAdapter: FeedAdapter
    val datas = mutableListOf<FeedData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        feedAdapter = FeedAdapter(view.context)
        rv_home.run {
            adapter = feedAdapter
            layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)
            addItemDecoration(
                VerticalItemDecorator(24)
            )
        }
        loadDatas()
    }

    private fun loadDatas() {
        datas.apply {
            add(
                FeedData(
                    userName = "이정민",
                    img_profile = "https://avatars1.githubusercontent.com/u/50590192?s=460&u=e6a104455a4e61cb4b4693e1be8debc48bb955f6&v=4",
                    img_contents = "https://img.insight.co.kr/static/2018/09/15/700/747cl3tq51cz06846r5u.jpg"
                )
            )
        }
        feedAdapter.datas = datas
        feedAdapter.notifyDataSetChanged()
    }
}
