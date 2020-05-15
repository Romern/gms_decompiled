package com.google.android.gms.plus.sharebox;

import android.text.TextPaint;
import android.text.style.URLSpan;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MentionSpan extends URLSpan {
    public MentionSpan(URLSpan uRLSpan) {
        super(uRLSpan.getURL());
        if (!m69359a(uRLSpan)) {
            throw new IllegalArgumentException(uRLSpan.getURL());
        }
    }

    /* renamed from: a */
    public static boolean m69359a(URLSpan uRLSpan) {
        String url = uRLSpan.getURL();
        return url != null && url.startsWith("+");
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(-13408564);
        textPaint.bgColor = 0;
        textPaint.setUnderlineText(false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public MentionSpan(String str) {
        super(r3.length() == 0 ? new String("+") : "+".concat(r3));
        String valueOf = String.valueOf(str);
    }
}
