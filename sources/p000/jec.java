package p000;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: jec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class jec extends ClickableSpan {
    public void onClick(View view) {
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
