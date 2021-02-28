package com.example.friendlyshare.di.components

import android.content.Context
import com.example.friendlyshare.ui.activity.MainActivity
import com.example.friendlyshare.di.modules.NavigationModule
import com.example.friendlyshare.di.modules.PartiesModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NavigationModule::class])
interface AppComponent {

    val context: Context

    fun inject(mainActivity: MainActivity)

    fun addPartiesSubcomponent(partiesModule: PartiesModule): PartiesSubcomponent

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }
}