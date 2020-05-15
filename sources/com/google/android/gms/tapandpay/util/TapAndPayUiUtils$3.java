package com.google.android.gms.tapandpay.util;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TapAndPayUiUtils$3 extends URLSpan {

    /* renamed from: a */
    final /* synthetic */ View.OnClickListener f108970a;

    /* renamed from: b */
    final /* synthetic */ boolean f108971b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TapAndPayUiUtils$3(String str, View.OnClickListener onClickListener, boolean z) {
        super(str);
        this.f108970a = onClickListener;
        this.f108971b = z;
    }

    public void onClick(View view) {
        this.f108970a.onClick(view);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        if (this.f108971b) {
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }
}
