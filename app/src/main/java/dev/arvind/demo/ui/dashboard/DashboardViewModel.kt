package dev.arvind.demo.ui.dashboard

import android.app.Application
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.arvind.demo.repo.DashboardRepo
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(
    application: Application,
    private val dashboardRepo: DashboardRepo
) {
}