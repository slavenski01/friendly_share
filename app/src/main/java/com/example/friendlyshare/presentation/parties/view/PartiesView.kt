package com.example.friendlyshare.presentation.parties.view

import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.example.friendlyshare.presentation.common.view.BaseMvpView

@StateStrategyType(OneExecutionStateStrategy::class)
interface PartiesView: BaseMvpView {
}