package com.example.myapplication

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.TextView

class CustomTextView : TextView {

    constructor(context: Context?) : super(context) {
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
    }

    private var gestureDetector : GestureDetector? = null

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.d("tain", "onTouchEvent $event")
        gestureDetector?.onTouchEvent(event)
        return false
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        gestureDetector = GestureDetector(context, MyGestureDetector())
    }

    class MyGestureDetector : GestureDetector.SimpleOnGestureListener() {
        override fun onSingleTapUp(e: MotionEvent?): Boolean {
            Log.d("tain", "onSingleTapUp")
            return super.onSingleTapUp(e)
        }

        override fun onDown(e: MotionEvent?): Boolean {
            Log.d("tain", "onDown")
            return super.onDown(e)
        }

        override fun onFling(e1: MotionEvent?, e2: MotionEvent?, velocityX: Float, velocityY: Float): Boolean {
            Log.d("tain", "onFling")
            return super.onFling(e1, e2, velocityX, velocityY)
        }

        override fun onDoubleTap(e: MotionEvent?): Boolean {
            Log.d("tain", "onDoubleTap")
            return super.onDoubleTap(e)
        }

        override fun onScroll(e1: MotionEvent?, e2: MotionEvent?, distanceX: Float, distanceY: Float): Boolean {
            Log.d("tain", "onScroll")
            return super.onScroll(e1, e2, distanceX, distanceY)
        }

        override fun onContextClick(e: MotionEvent?): Boolean {
            Log.d("tain", "onContextClick")
            return super.onContextClick(e)
        }

        override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
            Log.d("tain", "onSingleTapConfirmed")
            return super.onSingleTapConfirmed(e)
        }

        override fun onShowPress(e: MotionEvent?) {
            Log.d("tain", "onShowPress")
            super.onShowPress(e)
        }

        override fun onDoubleTapEvent(e: MotionEvent?): Boolean {
            Log.d("tain", "onDoubleTapEvent")
            return super.onDoubleTapEvent(e)
        }

        override fun onLongPress(e: MotionEvent?) {
            Log.d("tain", "onLongPress")
            super.onLongPress(e)
        }
    }
}