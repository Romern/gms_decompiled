package p000;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: pzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pzj extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ pzm f40743a;

    public pzj(pzm pzm) {
        this.f40743a = pzm;
    }

    public void onClick(View view) {
        this.f40743a.f40746a.onClick(view);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
