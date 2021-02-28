package com.example.friendlyshare.common.screens

import com.example.friendlyshare.ui.parties.PartiesFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

object Screens {
    fun Parties() = FragmentScreen { PartiesFragment() }
}