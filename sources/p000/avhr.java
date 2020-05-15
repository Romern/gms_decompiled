package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;

/* renamed from: avhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avhr implements LineHeightSpan, LeadingMarginSpan {
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (i2 == ((Spanned) charSequence).getSpanEnd(this) && i2 != charSequence.length()) {
            double d = (double) fontMetricsInt.descent;
            Double.isNaN(d);
            int round = (int) Math.round(d * 1.25d);
            fontMetricsInt.descent = Math.max(fontMetricsInt.descent, round);
            fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, round);
        }
    }

    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (i6 == ((Spanned) charSequence).getSpanStart(this)) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            canvas.drawText("•", (float) (i + i2), (float) i4, paint);
            paint.setStyle(style);
        }
    }

    public final int getLeadingMargin(boolean z) {
        return 22;
    }
}
