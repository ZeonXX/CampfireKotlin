package com.dzen.campfire.screens.feed

import com.dzen.campfire.R
import com.dzen.campfire.api.API
import com.dzen.campfire.api.API_TRANSLATE
import com.sayzen.campfiresdk.controllers.t
import com.sup.dev.android.tools.ToolsResources

class PageAllWithSubscribes(screen: SFeed) : APage(screen) {

    override fun getTitle() = t(API_TRANSLATE.app_all) +" (+" + t(API_TRANSLATE.app_subscriptions)+")"

    override fun getKarmaCategory() = API.KARMA_CATEGORY_ABYSS

    override fun getNoKarmaCategory() = true

    override fun getNoSubscribes() = false
}
