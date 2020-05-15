package com.google.android.gms.common.p037ui;

import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;

/* renamed from: com.google.android.gms.common.ui.URLSpanNoUnderline */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class URLSpanNoUnderline extends URLSpan {
    public URLSpanNoUnderline(String str) {
        super(str);
    }

    /* renamed from: a */
    public static Spannable m22736a(Spanned spanned) {
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(spanned);
        URLSpan[] uRLSpanArr = (URLSpan[]) newSpannable.getSpans(0, newSpannable.length(), URLSpan.class);
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = newSpannable.getSpanStart(uRLSpan);
            int spanEnd = newSpannable.getSpanEnd(uRLSpan);
            newSpannable.removeSpan(uRLSpan);
            newSpannable.setSpan(new URLSpanNoUnderline(uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        return newSpannable;
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
