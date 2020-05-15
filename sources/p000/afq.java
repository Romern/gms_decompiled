package p000;

import android.graphics.Rect;
import android.support.wearable.complications.ComplicationData;
import android.text.Layout;

/* renamed from: afq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afq extends afm {

    /* renamed from: b */
    private final Rect f454b = new Rect();

    /* renamed from: a */
    public final Layout.Alignment mo589a() {
        ComplicationData complicationData = this.f447a;
        mo596c(this.f454b);
        if (!afn.m682a(this.f454b) || complicationData.mo1728e() == null) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    /* renamed from: b */
    public final int mo593b() {
        ComplicationData complicationData = this.f447a;
        return (complicationData.mo1723a() == null || complicationData.mo1728e() != null) ? 16 : 80;
    }

    /* renamed from: c */
    public final Layout.Alignment mo595c() {
        return mo589a();
    }

    /* renamed from: d */
    public final int mo597d() {
        return 48;
    }

    /* renamed from: f */
    public final void mo602f(Rect rect) {
        ComplicationData complicationData = this.f447a;
        mo596c(rect);
        if (complicationData.mo1728e() != null) {
            if (afn.m682a(rect)) {
                afn.m683b(rect, rect);
                return;
            }
            afn.m686e(rect, rect);
            afn.m685d(rect, rect);
        } else if (complicationData.mo1723a() != null) {
            afn.m684c(rect, rect);
        }
    }

    /* renamed from: g */
    public final void mo604g(Rect rect) {
        ComplicationData complicationData = this.f447a;
        if (complicationData.mo1728e() != null || complicationData.mo1723a() == null) {
            rect.setEmpty();
            return;
        }
        mo596c(rect);
        afn.m685d(rect, rect);
    }

    /* renamed from: a */
    public final void mo587a(Rect rect) {
        if (this.f447a.mo1728e() == null) {
            rect.setEmpty();
            return;
        }
        mo596c(rect);
        if (afn.m682a(rect)) {
            afn.m680a(rect, rect);
            return;
        }
        afn.m686e(rect, rect);
        afn.m684c(rect, rect);
        afn.m686e(rect, rect);
    }
}
