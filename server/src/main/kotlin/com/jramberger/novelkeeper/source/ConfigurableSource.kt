package com.jramberger.novelkeeper.source

import androidx.preference.PreferenceScreen

interface ConfigurableSource : Source {

    fun setupPreferenceScreen(screen: PreferenceScreen)
}
