package p000;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: akit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akit extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ View.OnClickListener f72062a;

    public akit(View.OnClickListener onClickListener) {
        this.f72062a = onClickListener;
    }

    public void onClick(View view) {
        this.f72062a.onClick(view);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
