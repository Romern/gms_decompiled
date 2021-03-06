package p000;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import com.google.android.wallet.shared.common.ClickSpan;
import java.util.List;

/* renamed from: bkgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkgg extends C1326rk {

    /* renamed from: f */
    private final TextView f124197f;

    /* renamed from: g */
    private final Rect f124198g = new Rect();

    public bkgg(TextView textView) {
        super(textView);
        this.f124197f = textView;
    }

    /* renamed from: a */
    private final CharSequence m105680a(ClickSpan clickSpan) {
        CharSequence text = this.f124197f.getText();
        if (!(text instanceof Spanned)) {
            return text;
        }
        Spanned spanned = (Spanned) text;
        return spanned.subSequence(spanned.getSpanStart(clickSpan), spanned.getSpanEnd(clickSpan));
    }

    /* renamed from: e */
    private final ClickSpan m105682e(int i) {
        CharSequence text = this.f124197f.getText();
        if (!(text instanceof Spanned)) {
            return null;
        }
        ClickSpan[] clickSpanArr = (ClickSpan[]) ((Spanned) text).getSpans(i, i, ClickSpan.class);
        if (clickSpanArr.length == 1) {
            return clickSpanArr[0];
        }
        return null;
    }

    /* renamed from: a */
    private final void m105681a(ClickSpan clickSpan, Rect rect) {
        CharSequence text = this.f124197f.getText();
        rect.setEmpty();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(clickSpan);
            int spanEnd = spanned.getSpanEnd(clickSpan);
            Layout layout = this.f124197f.getLayout();
            if (layout == null) {
                Log.e("LinkAccessibilityHelper", "Unable to getBoundsForSpan because view layout is null");
                return;
            }
            float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            layout.getLineBounds(lineForOffset, rect);
            rect.left = (int) primaryHorizontal;
            if (lineForOffset2 == lineForOffset) {
                rect.right = (int) primaryHorizontal2;
            }
            rect.offset(this.f124197f.getTotalPaddingLeft(), this.f124197f.getTotalPaddingTop());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo15805a(float f, float f2) {
        CharSequence text = this.f124197f.getText();
        if (!(text instanceof Spanned)) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) text;
        TextView textView = this.f124197f;
        int i = -1;
        if (textView.getLayout() != null) {
            i = textView.getLayout().getOffsetForHorizontal(textView.getLayout().getLineForVertical((int) (Math.min((float) ((textView.getHeight() - textView.getTotalPaddingBottom()) - 1), Math.max(0.0f, f2 - ((float) textView.getTotalPaddingTop()))) + ((float) textView.getScrollY()))), Math.min((float) ((textView.getWidth() - textView.getTotalPaddingRight()) - 1), Math.max(0.0f, f - ((float) textView.getTotalPaddingLeft()))) + ((float) textView.getScrollX()));
        }
        ClickSpan[] clickSpanArr = (ClickSpan[]) spanned.getSpans(i, i, ClickSpan.class);
        if (clickSpanArr.length == 1) {
            return spanned.getSpanStart(clickSpanArr[0]);
        }
        return Integer.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15807a(int i, AccessibilityEvent accessibilityEvent) {
        ClickSpan e = m105682e(i);
        if (e != null) {
            accessibilityEvent.setContentDescription(m105680a(e));
            return;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("LinkSpan is null for offset: ");
        sb.append(i);
        Log.e("LinkAccessibilityHelper", sb.toString());
        accessibilityEvent.setContentDescription(this.f124197f.getText());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15808a(int i, C1301qm qmVar) {
        ClickSpan e = m105682e(i);
        if (e != null) {
            qmVar.mo15766c(m105680a(e));
        } else {
            StringBuilder sb = new StringBuilder(40);
            sb.append("LinkSpan is null for offset: ");
            sb.append(i);
            Log.e("LinkAccessibilityHelper", sb.toString());
            qmVar.mo15766c(this.f124197f.getText());
        }
        qmVar.mo15767c(true);
        qmVar.mo15777f(true);
        m105681a(e, this.f124198g);
        if (!this.f124198g.isEmpty()) {
            Rect rect = this.f124198g;
            m105681a(e, rect);
            qmVar.mo15759b(rect);
        } else {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("LinkSpan bounds is empty for: ");
            sb2.append(i);
            Log.e("LinkAccessibilityHelper", sb2.toString());
            this.f124198g.set(0, 0, 1, 1);
            qmVar.mo15759b(this.f124198g);
        }
        qmVar.mo15752a(16);
        qmVar.mo15786j();
        qmVar.mo15762b(C1298qj.f26863d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15810a(List list) {
        CharSequence text = this.f124197f.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            for (ClickSpan clickSpan : (ClickSpan[]) spanned.getSpans(0, spanned.length(), ClickSpan.class)) {
                list.add(Integer.valueOf(spanned.getSpanStart(clickSpan)));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15811a(C1301qm qmVar) {
        qmVar.mo15777f(false);
        qmVar.mo15786j();
        qmVar.mo15762b(C1298qj.f26862c);
        qmVar.mo15762b(C1298qj.f26863d);
    }

    /* renamed from: a */
    public final boolean mo15812a(int i, int i2) {
        if (i2 != 16) {
            return false;
        }
        ClickSpan e = m105682e(i);
        if (e != null) {
            e.onClick(this.f124197f);
            return true;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("LinkSpan is null for offset: ");
        sb.append(i);
        Log.e("LinkAccessibilityHelper", sb.toString());
        return false;
    }
}
