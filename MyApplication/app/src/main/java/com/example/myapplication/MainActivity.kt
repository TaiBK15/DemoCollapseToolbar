package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.LinearLayout
import androidx.viewpager.widget.ViewPager
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.tabs.TabLayout
import androidx.annotation.NonNull
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.appbar.CollapsingToolbarLayout
import kotlin.math.abs


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pageAdapter = MyViewPagerAdapter(supportFragmentManager)
        pageAdapter.addFragment(Fragment1(), "fragment1")
        pageAdapter.addFragment(Fragment2(), "fragment2")
        pageAdapter.addFragment(Fragment3(), "fragment3")
        val vp = findViewById<ViewPager>(R.id.demo_vp)
        val tl = findViewById<TabLayout>(R.id.demo_tl)
        vp.adapter = pageAdapter
        tl.setupWithViewPager(vp)

//        vp.addOnPageChangeListener(OnPageChangeListener())

//        val appbar = findViewById<AppBarLayout>(R.id.demo_appbar)
//        appbar?.addOnOffsetChangedListener(object : AppBarLayout.OnOffsetChangedListener {
//            var lastOffset = -1
//
//            override fun onOffsetChanged(appBarLayout: AppBarLayout, verticalOffset: Int) {
//                val offset = abs(verticalOffset)
//                if (offset != lastOffset) {
//                    lastOffset = offset
//                    if (offset > appBarLayout.totalScrollRange / 2) {
//                        setFlagScroll(false)
//                    } else {
//                        setFlagScroll(true)
//                    }
//                }
//            }
//        })
    }

    fun setFlagScroll(isScroll : Boolean) {
        val ctl = findViewById<CollapsingToolbarLayout>(R.id.demo_ctl)
        val params = ctl.layoutParams as AppBarLayout.LayoutParams
        Log.d("tain", "setFlagScroll $isScroll")
        if (isScroll) {
            params.scrollFlags =
                AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL or AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS
        } else {
            params.scrollFlags = AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS
        }

    }

//    override fun onTouchEvent(event: MotionEvent?): Boolean {
//        return true
//    }

//    private inner class OnPageChangeListener : ViewPager.OnPageChangeListener {
//
//        override fun onPageScrollStateChanged(state: Int) {
//        }
//
//        override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
//        }
//
//        override fun onPageSelected(position: Int) {
//            Log.d("tain", "position $position")
//            if (position == 0) {
//                setFlagScroll(true)
//            } else {
//                setFlagScroll(false)
//            }
//
//        }
//    }
}
