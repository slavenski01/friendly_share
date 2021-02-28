package com.example.friendlyshare

import android.app.Application
import com.example.friendlyshare.di.components.AppComponent
import com.example.friendlyshare.di.components.DaggerAppComponent
import com.example.friendlyshare.di.components.PartiesSubcomponent
import com.example.friendlyshare.di.modules.PartiesModule

class App : Application() {
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

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .context(context = applicationContext)
            .build()
    }
}