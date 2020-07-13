package com.capriquota.mapolite.util

import android.content.Context
import android.content.SharedPreferences

class PrefManager(private val context: Context) {

    private val INTRO = "intro2"
    private val appprefs: SharedPreferences

    init {
        appprefs = context.getSharedPreferences(
            "shared",
            Context.MODE_PRIVATE
        )
    }

    fun putIntro(loginorout: String) {
        val edit = appprefs.edit()
        edit.putString(INTRO, loginorout)
     //   edit.commit()// todo uncomment when error arise
          edit.apply()
    }

    fun getIntro(): String? {
        return appprefs.getString(INTRO, "")
    }
}