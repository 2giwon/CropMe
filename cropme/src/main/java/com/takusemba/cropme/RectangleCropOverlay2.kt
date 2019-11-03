package com.takusemba.cropme

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet

class RectangleCropOverlay2 @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    cropOverlayAttrs: AttributeSet? = attrs
) : CropOverlay2(context, attrs, defStyleAttr, cropOverlayAttrs) {

  override fun drawCrop(canvas: Canvas) {
    val frameWidth = measuredWidth * percentWidth
    val frameHeight = measuredHeight * percentHeight

    val left = (width - frameWidth) / 2f
    val top = (height - frameHeight) / 2f
    val right = (width + frameWidth) / 2f
    val bottom = (height + frameHeight) / 2f

    canvas.drawRect(left, top, right, bottom, cropPaint)
  }
}