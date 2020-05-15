package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

/* renamed from: myf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class myf extends ClickableSpan {

    /* renamed from: a */
    private final CharSequence f34928a;

    /* renamed from: b */
    private final CharSequence f34929b;

    /* renamed from: c */
    private final Context f34930c;

    /* renamed from: d */
    private final bxvd f34931d;

    public myf(Context context, CharSequence charSequence, CharSequence charSequence2, bxvd bxvd) {
        this.f34928a = charSequence;
        this.f34929b = charSequence2;
        this.f34931d = bxvd;
        this.f34930c = context;
    }

    public void onClick(View view) {
        bxvd bxvd = this.f34931d;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bsqh bsqh = (bsqh) bxvd.f164949b;
        bsqh bsqh2 = bsqh.f146634g;
        bsqh.f146636a |= 1;
        bsqh.f146637b = true;
        ((TextView) mba.m24785a(this.f34930c).setMessage(this.f34928a).setNegativeButton(this.f34929b, (DialogInterface.OnClickListener) null).show().findViewById(16908299)).setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
