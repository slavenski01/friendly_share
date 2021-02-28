package com.example.friendlyshare.common.initializer

import android.content.Context
import androidx.startup.Initializer
import com.example.friendlyshare.di.components.AppComponent
import com.example.friendlyshare.di.components.DaggerAppComponent
import com.example.friendlyshare.di.components.PartiesSubcomponent
import com.example.friendlyshare.di.modules.PartiesModule

class FriendlyShareInitializer : Initializer<Unit> {

    companion object {
        lateinit var appComponent: AppComponent

        private var partiesSubcomponent: PartiesSubcomponent? = null

        fun removePartiesSubcomponent() {
            partiesSubcomponent = null
        }

        fun addPartiesSubcomponent(): PartiesSubcomponent {
            if (partiesSubcomponent == null) {
                partiesSubcomponent =
                    appComponent.addPartiesSubcomponent(partiesModule = PartiesModule())
            }
            return partiesSubcomponent!!
        }
    }

    override fun create(context: Context) {
        appComponent = DaggerAppComponent.builder()
            .context(context = context)
            .build()
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf()
}