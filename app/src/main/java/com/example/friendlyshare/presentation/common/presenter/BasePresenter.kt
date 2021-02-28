package com.example.friendlyshare.presentation.common.presenter

import androidx.annotation.StringRes
import com.arellomobile.mvp.MvpPresenter
import com.example.friendlyshare.presentation.common.view.BaseMvpView
import kotlinx.coroutines.*

abstract class BasePresenter<View : BaseMvpView> : MvpPresenter<View>() {

    private val coroutineJob = Job()
    private val coroutineContext = Dispatchers.IO + coroutineJob

    val scope = CoroutineScope(coroutineContext)

    suspend fun showMessage(@StringRes resId: Int) {
        withContext(Dispatchers.Main) {
            viewState.showMessage(resId)
        }
    }

    suspend fun showMessage(message: String?) {
        message?.let { msg ->
            withContext(Dispatchers.Main) {
                viewState.showMessage(msg)
            }
        }
    }

    override fun onDestroy() {
        coroutineContext.cancel()
        super.onDestroy()
    }
}