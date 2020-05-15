package p000;

import android.graphics.Rect;
import android.support.wearable.complications.ComplicationData;
import android.text.Layout;

/* renamed from: afo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afo extends afm {

    /* renamed from: b */
    private final Rect f449b = new Rect();

    /* renamed from: j */
    private final boolean m688j(Rect rect) {
        ComplicationData complicationData = this.f447a;
        return (complicationData.mo1728e() == null && complicationData.mo1729f() == null) || !afn.m682a(rect);
    }

    /* renamed from: a */
    public final void mo587a(Rect rect) {
        ComplicationData complicationData = this.f447a;
        mo596c(rect);
        if (complicationData.mo1728e() == null || complicationData.mo1729f() != null || m688j(rect)) {
            rect.setEmpty();
        } else {
            afn.m680a(rect, rect);
        }
    }

    /* renamed from: d */
    public final void mo598d(Rect rect) {
        ComplicationData complicationData = this.f447a;
        mo596c(rect);
        if (complicationData.mo1729f() == null || m688j(rect)) {
            rect.setEmpty();
        } else {
            afn.m680a(rect, rect);
        }
    }

    /* renamed from: e */
    public final Layout.Alignment mo599e() {
        mo596c(this.f449b);
        if (m688j(this.f449b)) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    /* renamed from: f */
    public final int mo601f() {
        return this.f447a.mo1725c() != null ? 80 : 16;
    }

    /* renamed from: g */
    public final Layout.Alignment mo603g() {
        return mo599e();
    }

    /* renamed from: h */
    public final int mo605h() {
        return 48;
    }

    /* renamed from: i */
    public final void mo607i(Rect rect) {
        ComplicationData complicationData = this.f447a;
        mo596c(rect);
        if (complicationData.mo1725c() == null) {
            rect.setEmpty();
        } else if (m688j(rect)) {
            afn.m685d(rect, rect);
        } else {
            afn.m683b(rect, rect);
            afn.m685d(rect, rect);
        }
    }

    /* renamed from: h */
    public final void mo606h(Rect rect) {
        ComplicationData complicationData = this.f447a;
        mo596c(rect);
        if (m688j(rect)) {
            if (complicationData.mo1725c() != null) {
                afn.m684c(rect, rect);
            }
        } else if (complicationData.mo1725c() == null) {
            afn.m683b(rect, rect);
        } else {
            afn.m683b(rect, rect);
            afn.m684c(rect, rect);
        }
    }
}
