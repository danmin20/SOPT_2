package com.danmin.sopt_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.danmin.sopt_2.Home.FeedAdapter
import com.danmin.sopt_2.Home.FeedData
import com.danmin.sopt_2.Home.VerticalItemDecorator
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
                VerticalItemDecorator(0)
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
            add(
                FeedData(
                    userName = "GitHub",
                    img_profile = "data:image/png;base64,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",
                    img_contents = "data:image/png;base64,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"
                )
            )
        }
        feedAdapter.datas = datas
        feedAdapter.notifyDataSetChanged()
    }
}
