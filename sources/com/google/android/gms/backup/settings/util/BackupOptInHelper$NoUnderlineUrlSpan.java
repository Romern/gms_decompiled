package com.google.android.gms.backup.settings.util;

import android.text.TextPaint;
import android.text.style.URLSpan;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackupOptInHelper$NoUnderlineUrlSpan extends URLSpan {
    public BackupOptInHelper$NoUnderlineUrlSpan(String str) {
        super(str);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
