package com.businessincity.commons.dialogs

import android.app.Activity
import android.text.Html
import android.text.method.LinkMovementMethod
import androidx.appcompat.app.AlertDialog
import com.businessincity.commons.R
import com.businessincity.commons.extensions.launchViewIntent
import com.businessincity.commons.extensions.setupDialogStuff
import kotlinx.android.synthetic.main.dialog_textview.view.*

class DonateDialog(val activity: Activity) {
    init {
        val view = activity.layoutInflater.inflate(R.layout.dialog_textview, null).apply {
            text_view.text = Html.fromHtml(activity.getString(R.string.donate_please))
            text_view.movementMethod = LinkMovementMethod.getInstance()
        }

        AlertDialog.Builder(activity)
            .setPositiveButton(R.string.purchase) { dialog, which -> activity.launchViewIntent(R.string.thank_you_url) }
            .setNegativeButton(R.string.cancel, null)
            .create().apply {
                activity.setupDialogStuff(view, this, cancelOnTouchOutside = false)
            }
    }
}
