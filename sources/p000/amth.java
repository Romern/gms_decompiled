package p000;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: amth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amth extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ amti f75896a;

    public amth(amti amti) {
        this.f75896a = amti;
    }

    public void onClick(View view) {
        this.f75896a.mo41330a(cfus.m143106d());
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.f75896a.f75902f);
    }
}
