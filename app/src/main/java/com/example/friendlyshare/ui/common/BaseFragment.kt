package com.example.friendlyshare.ui.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import com.arellomobile.mvp.MvpAppCompatFragment
import com.example.friendlyshare.presentation.common.view.BaseMvpView
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar

abstract class BaseFragment : MvpAppCompatFragment(), BaseMvpView {

    @Composable
    abstract fun ComposeFun()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                ComposeFun()
            }
        }
    }

    override fun showMessage(resId: Int) {
        showMessage(getString(resId))
    }

    override fun showMessage(message: String?) {
        message?.let { msg ->
            activity?.let { activity ->
                Snackbar.make(
                    activity.findViewById(android.R.id.content),
                    msg,
                    BaseTransientBottomBar.LENGTH_LONG
                )
            }
        }
    }

    open fun onBackPressed() {}
}