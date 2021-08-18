package com.businessincity.commons.interfaces

import com.businessincity.commons.views.MyScrollView

interface SecurityTab {
    fun initTab(requiredHash: String, listener: HashListener, scrollView: MyScrollView)

    fun visibilityChanged(isVisible: Boolean)
}
