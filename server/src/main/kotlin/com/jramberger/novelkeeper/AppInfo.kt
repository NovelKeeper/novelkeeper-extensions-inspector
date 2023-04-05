package com.jramberger.novelkeeper

/**
 * Used by extensions.
 *
 * @since extension-lib 1.3
 */
object AppInfo {
    fun getVersionCode() = com.jramberger.novelkeeper.BuildConfig.Companion.VERSION_CODE
    fun getVersionName() = com.jramberger.novelkeeper.BuildConfig.Companion.VERSION_NAME
}
