package com.example.friendlyshare.ui.parties

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.friendlyshare.presentation.parties.view.PartiesView
import com.example.friendlyshare.ui.common.BaseFragment

class PartiesFragment: BaseFragment(), PartiesView {
    @Composable
    override fun ComposeFun() {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "text")
            TextButton(onClick = {}) {}
        }
    }

    @Preview
    @Composable
    fun PreviewFirstText() {
        ComposeFun()
    }
}