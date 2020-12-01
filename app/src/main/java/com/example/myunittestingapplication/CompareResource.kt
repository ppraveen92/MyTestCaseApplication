package com.example.myunittestingapplication

import android.content.Context

class CompareResource{
    fun isEqual(context: Context,resId:Int,string: String):Boolean{
        return context.getString(resId)==string
    }
}