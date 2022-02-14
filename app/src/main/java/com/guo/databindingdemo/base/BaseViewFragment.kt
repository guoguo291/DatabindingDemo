package com.guo.databindingdemo.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseViewFragment<T : ViewDataBinding> : Fragment() {
    protected lateinit var viewbinding: T
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        val view = inflater.inflate(getSubLayoutId(), container, false)
//        viewbinding = DataBindingUtil.bind<T>(view)
        viewbinding=DataBindingUtil.inflate(inflater,getSubLayoutId(),container,false)
        return viewbinding.root
    }

    abstract fun getSubLayoutId(): Int
}