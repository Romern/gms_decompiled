package com.google.android.gms.locationsharing.util;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TextViewUtils$3 extends UnderlineSpan {
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
