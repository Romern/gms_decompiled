package p000;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: wxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wxr extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ String f51549a;

    /* renamed from: b */
    final /* synthetic */ wxu f51550b;

    public wxr(wxu wxu, String str) {
        this.f51550b = wxu;
        this.f51549a = str;
    }

    public void onClick(View view) {
        this.f51550b.mo29555b(this.f51549a);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
