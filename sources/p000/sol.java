package p000;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import com.google.android.gms.common.p037ui.LinkSpan;
import java.util.List;

/* renamed from: sol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sol extends C1326rk {

    /* renamed from: f */
    private final TextView f44865f;

    /* renamed from: g */
    private final Rect f44866g = new Rect();

    public sol(TextView textView) {
        super(textView);
        this.f44865f = textView;
    }

    /* renamed from: a */
    private final CharSequence m35756a(LinkSpan linkSpan) {
        CharSequence text = this.f44865f.getText();
        if (!(text instanceof Spanned)) {
            return text;
        }
        Spanned spanned = (Spanned) text;
        return spanned.subSequence(spanned.getSpanStart(linkSpan), spanned.getSpanEnd(linkSpan));
    }

    /* renamed from: e */
    private final LinkSpan m35758e(int i) {
        CharSequence text = this.f44865f.getText();
        if (!(text instanceof Spanned)) {
            return null;
        }
        LinkSpan[] linkSpanArr = (LinkSpan[]) ((Spanned) text).getSpans(i, i, LinkSpan.class);
        if (linkSpanArr.length == 1) {
            return linkSpanArr[0];
        }
        return null;
    }

    /* renamed from: a */
    private final void m35757a(LinkSpan linkSpan, Rect rect) {
        CharSequence text = this.f44865f.getText();
        rect.setEmpty();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(linkSpan);
            int spanEnd = spanned.getSpanEnd(linkSpan);
            Layout layout = this.f44865f.getLayout();
            float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            layout.getLineBounds(lineForOffset, rect);
            rect.left = (int) primaryHorizontal;
            if (lineForOffset2 == lineForOffset) {
                rect.right = (int) primaryHorizontal2;
            }
            rect.offset(this.f44865f.getTotalPaddingLeft(), this.f44865f.getTotalPaddingTop());
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
        CharSequence text = this.f44865f.getText();
        if (!(text instanceof Spanned)) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) text;
        TextView textView = this.f44865f;
        int i = -1;
        if (textView.getLayout() != null) {
            i = textView.getLayout().getOffsetForHorizontal(textView.getLayout().getLineForVertical((int) (Math.min((float) ((textView.getHeight() - textView.getTotalPaddingBottom()) - 1), Math.max(0.0f, f2 - ((float) textView.getTotalPaddingTop()))) + ((float) textView.getScrollY()))), Math.min((float) ((textView.getWidth() - textView.getTotalPaddingRight()) - 1), Math.max(0.0f, f - ((float) textView.getTotalPaddingLeft()))) + ((float) textView.getScrollX()));
        }
        LinkSpan[] linkSpanArr = (LinkSpan[]) spanned.getSpans(i, i, LinkSpan.class);
        if (linkSpanArr.length == 1) {
            return spanned.getSpanStart(linkSpanArr[0]);
        }
        return Integer.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15807a(int i, AccessibilityEvent accessibilityEvent) {
        LinkSpan e = m35758e(i);
        if (e != null) {
            accessibilityEvent.setContentDescription(m35756a(e));
            return;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("LinkSpan is null for offset: ");
        sb.append(i);
        Log.e("LinkAccessibilityHelper", sb.toString());
        accessibilityEvent.setContentDescription(this.f44865f.getText());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15808a(int i, C1301qm qmVar) {
        LinkSpan e = m35758e(i);
        if (e != null) {
            qmVar.mo15766c(m35756a(e));
        } else {
            StringBuilder sb = new StringBuilder(40);
            sb.append("LinkSpan is null for offset: ");
            sb.append(i);
            Log.e("LinkAccessibilityHelper", sb.toString());
            qmVar.mo15766c(this.f44865f.getText());
        }
        qmVar.mo15767c(true);
        qmVar.mo15777f(true);
        m35757a(e, this.f44866g);
        if (!this.f44866g.isEmpty()) {
            Rect rect = this.f44866g;
            m35757a(e, rect);
            qmVar.mo15759b(rect);
        } else {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("LinkSpan bounds is empty for: ");
            sb2.append(i);
            Log.e("LinkAccessibilityHelper", sb2.toString());
            this.f44866g.set(0, 0, 1, 1);
            qmVar.mo15759b(this.f44866g);
        }
        qmVar.mo15752a(16);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15810a(List list) {
        CharSequence text = this.f44865f.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            for (LinkSpan linkSpan : (LinkSpan[]) spanned.getSpans(0, spanned.length(), LinkSpan.class)) {
                list.add(Integer.valueOf(spanned.getSpanStart(linkSpan)));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo15812a(int i, int i2) {
        if (i2 != 16) {
            return false;
        }
        LinkSpan e = m35758e(i);
        if (e != null) {
            e.onClick(this.f44865f);
            return true;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("LinkSpan is null for offset: ");
        sb.append(i);
        Log.e("LinkAccessibilityHelper", sb.toString());
        return false;
    }
}
