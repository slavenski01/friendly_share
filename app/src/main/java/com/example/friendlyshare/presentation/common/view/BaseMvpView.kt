package com.example.friendlyshare.presentation.common.view

import androidx.annotation.StringRes
import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

@StateStrategyType(OneExecutionStateStrategy::class)
interface BaseMvpView : MvpView {
    fun showMessage(@StringRes resId: Int)

    fun showMessage(message: String?)
}