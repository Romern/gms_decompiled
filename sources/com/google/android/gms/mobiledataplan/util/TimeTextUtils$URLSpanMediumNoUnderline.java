package com.google.android.gms.mobiledataplan.util;

import android.text.TextPaint;
import android.text.style.URLSpan;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TimeTextUtils$URLSpanMediumNoUnderline extends URLSpan {
    public TimeTextUtils$URLSpanMediumNoUnderline(String str) {
        super(str);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setTypeface(agze.f66901a);
    }
}
