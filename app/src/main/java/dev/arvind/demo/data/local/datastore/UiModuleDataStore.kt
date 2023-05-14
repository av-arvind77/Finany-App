package dev.arvind.demo.data.local.datastore

import android.content.Context
import androidx.datastore.dataStore
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Singleton

val Context.themePrefDataStore by preferencesDataStore("ui_mode_pref")

class UiModuleDataStore(context: Context) : UIModeImpl {

    private val dataStore = context.themePrefDataStore

    override val uiMode: Flow<Boolean>
        get() = dataStore.data.map { preferences ->
            val uiMode = preferences[UI_MODE_KEY] ?: false
            uiMode
        }

    override suspend fun saveToDataStore(isNightMode: Boolean) {

    }

    companion object {
        private val UI_MODE_KEY = booleanPreferencesKey("ui_mode")
    }
}

@Singleton
interface UIModeImpl {
    val uiMode : Flow<Boolean>

    suspend fun saveToDataStore(isNightMode: Boolean)
}