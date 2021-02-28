package com.example.friendlyshare.presentation.parties.presenter

import com.arellomobile.mvp.InjectViewState
import com.example.friendlyshare.App
import com.example.friendlyshare.presentation.common.presenter.BasePresenter
import com.example.friendlyshare.presentation.parties.view.PartiesView
import com.github.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class PartiesPresenter: BasePresenter<PartiesView>() {

    @Inject
    lateinit var router: Router

    init {
        App.addPartiesSubcomponent().injectPresenter(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        App.removePartiesSubcomponent()
    }
}