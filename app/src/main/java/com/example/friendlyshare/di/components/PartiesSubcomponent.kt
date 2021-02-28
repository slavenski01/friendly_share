package com.example.friendlyshare.di.components

import com.example.friendlyshare.di.modules.PartiesModule
import com.example.friendlyshare.di.scopes.PartiesScope
import com.example.friendlyshare.presentation.parties.presenter.PartiesPresenter
import dagger.Subcomponent

@PartiesScope
@Subcomponent(modules = [PartiesModule::class])
interface PartiesSubcomponent {
    fun injectPresenter(partiesPresenter: PartiesPresenter)
}