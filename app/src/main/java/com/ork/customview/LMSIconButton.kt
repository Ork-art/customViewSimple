package com.ork.customview

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintAttribute
import androidx.constraintlayout.widget.ConstraintLayout

class LMSIconButton @JvmOverloads constructor(
    context: Context,
    attr: AttributeSet? = null,
    defStyleAttr: Int = 0
):ConstraintLayout(context, attr,defStyleAttr){


    private var layout: View = inflate(context, R.layout.lms_image_button,this)


    init {
        context.obtainStyledAttributes(attr, R.styleable.LMSIconButton, 0,0).apply {
            val imageButton = getResourceId(R.styleable.LMSIconButton_LMSButtonIcon, R.drawable.ic_launcher_foreground)
            val imageTitle = getString(R.styleable.LMSIconButton_buttonTitle)
            recycle()
            layout.findViewById<ImageView>(R.id.button_image).setImageResource(imageButton)
            layout.findViewById<TextView>(R.id.button_text).text = imageTitle

        }
    }
}