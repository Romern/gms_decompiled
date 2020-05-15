package com.google.android.wallet.bender3.framework.view.clickspan;

import android.text.TextPaint;
import com.google.android.wallet.shared.common.ClickSpan;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TextInfoClickSpan extends ClickSpan {

    /* renamed from: a */
    final boolean f151772a;

    public TextInfoClickSpan(String str, bjxu bjxu, boolean z) {
        super(str, bjxu);
        this.f151772a = z;
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.f151772a);
    }
}
