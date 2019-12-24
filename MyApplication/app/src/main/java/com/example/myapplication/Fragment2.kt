package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.widget.NestedScrollView
import androidx.fragment.app.Fragment

class Fragment2 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_model, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tv = view.findViewById<TextView>(R.id.tv)
        val nsv = view.findViewById<NestedScrollView>(R.id.nsv)

//        nsv.setOnTouchListener(object : View.OnTouchListener{
//            override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
//                Log.d("tain", "fragment 2 ontouch focus ${tv.hasFocus()} focusable ${tv.hasFocusable()} windowFocus ${tv.hasWindowFocus()}")
//                if (tv.hasFocus()) {
//                    tv.clearFocus()
//                }
//                return false
//            }
//        })

//        tv.setOnTouchListener(object: View.OnTouchListener {
//            override fun onTouch(p0: View?, p1: MotionEvent): Boolean {
//                Log.d("tain",  "fragment 2 motion event " + p1 + "didTouchFocusSelect " + tv.didTouchFocusSelect())
//                if (p1.action == MotionEvent.ACTION_UP || p1.action == MotionEvent.ACTION_CANCEL) {
//                    tv.setTextIsSelectable(true)
//                }
//                tv.requestFocusFromTouch()
//                Log.d("tain",  "isSelected = " + tv.hasSelection())
//                return false
//            }
//        })

//        tv.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(p0: View?) {
//                Log.d("tain", "fragment 2 onclick tv")
//                tv.setTextIsSelectable(false)
//            }
//        })
//        tv.requestFocus()

//        tv.setOnClickListener(null)
//        tv.setOnTouchListener(null)
    }


}