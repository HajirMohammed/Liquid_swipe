package com.cuberto.liquidswipetest

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class PageFragment : Fragment() {
    var position : Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        position = arguments?.getInt("POSITION")!!
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layoutId = if (position == 1) {
            R.layout.first_page
        } else if (position == 2) {
            R.layout.second_page
        } else if (position == 3) {
            R.layout.third_page
        } else if (position == 4) {
            R.layout.fourth_page
        } else R.layout.fragment_page_number
        return layoutInflater.inflate(layoutId, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        when (position) {
            1 -> return
            2 -> return
            3 -> return
            4 -> return
            5 -> view.setBackgroundColor(
                Color.rgb(
                    (0.1215686277 * 255).toInt(),
                    (0.01176470611 * 255).toInt(),
                    (0.4235294163 * 255).toInt()
                )
            )
            6 -> view.setBackgroundColor(
                Color.rgb(
                    (0.3411764801 * 255).toInt(),
                    (0.6235294342 * 255).toInt(),
                    (0.1686274558 * 255).toInt()
                )
            )
            else -> view.setBackgroundColor(
                Color.rgb(
                    (Math.random() * 255).toInt(),
                    (Math.random() * 255).toInt(),
                    (Math.random() * 255).toInt()
                )
            )
        }

    }
}