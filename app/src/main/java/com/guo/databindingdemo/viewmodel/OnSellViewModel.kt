package com.guo.databindingdemo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.guo.databindingdemo.domain.LoadState

class OnSellViewModel:ViewModel() {
    val loadState by lazy{
        MutableLiveData<LoadState>()
    }
//    val contentList:MutableLiveData<MutableList<>>
}