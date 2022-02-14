package com.guo.databindingdemo.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import com.guo.databindingdemo.R
import com.guo.databindingdemo.base.BaseVmFragment
import com.guo.databindingdemo.databinding.FragmentOnSellBinding
import com.guo.databindingdemo.viewmodel.OnSellViewModel

class OnSellFragment<T:ViewDataBinding,VM:ViewModel> : BaseVmFragment<FragmentOnSellBinding, OnSellViewModel>() {



    override fun getSubViewModelClass(): Class<OnSellViewModel> {
        return OnSellViewModel::class.java
    }

    override fun getSubLayoutId(): Int {
        return R.layout.fragment_on_sell
    }
}