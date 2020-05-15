package com.google.android.gms.mobiledataplan.p055ui;

import android.text.TextPaint;
import android.text.style.URLSpan;

/* renamed from: com.google.android.gms.mobiledataplan.ui.PurchaseDialogFragment$URLSpanMediumNoUnderline */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PurchaseDialogFragment$URLSpanMediumNoUnderline extends URLSpan {
    public PurchaseDialogFragment$URLSpanMediumNoUnderline(String str) {
        super(str);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setTypeface(agup.f66587i);
    }
}
