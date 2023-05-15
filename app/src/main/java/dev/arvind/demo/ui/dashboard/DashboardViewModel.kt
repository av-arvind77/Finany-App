package dev.arvind.demo.ui.dashboard

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.arvind.demo.data.local.datastore.UiModuleDataStore
import dev.arvind.demo.repo.DashboardRepo
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(
    application: Application,
    private val dashboardRepo: DashboardRepo
) : AndroidViewModel(application) {

    private val uiModeDataStore = UiModuleDataStore(application)

    val getUIMode = uiModeDataStore.uiMode

}