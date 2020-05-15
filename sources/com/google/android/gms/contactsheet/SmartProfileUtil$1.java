package com.google.android.gms.contactsheet;

import android.text.TextPaint;
import android.text.style.URLSpan;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SmartProfileUtil$1 extends URLSpan {

    /* renamed from: a */
    final /* synthetic */ int f30614a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmartProfileUtil$1(String str, int i) {
        super(str);
        this.f30614a = i;
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        int i = this.f30614a;
        if (i != -1) {
            textPaint.setColor(i);
        }
    }
}
