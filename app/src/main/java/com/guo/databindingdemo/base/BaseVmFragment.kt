package com.guo.databindingdemo.base

import android.os.Bundle
import android.view.View
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

abstract class BaseVmFragment<T:ViewDataBinding,VM:ViewModel>:BaseViewFragment<T>() {
    protected lateinit var viewModel: VM
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //创建viewmodel
        initViewModel()
        //观察数据变化-->更新UI
        observerData()
        //设置相关事件等
    }

    open fun observerData() {

    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(getSubViewModelClass())
    }

    abstract fun getSubViewModelClass(): Class<VM>
}