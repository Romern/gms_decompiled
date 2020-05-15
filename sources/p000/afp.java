package p000;

import android.graphics.Rect;
import android.support.wearable.complications.ComplicationData;
import android.text.Layout;

/* renamed from: afp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afp extends afm {

    /* renamed from: b */
    private static final float f450b = ((float) (1.0d / Math.sqrt(2.0d)));

    /* renamed from: c */
    private final afq f451c = new afq();

    /* renamed from: d */
    private final Rect f452d = new Rect();

    /* renamed from: e */
    private final Rect f453e = new Rect();

    /* renamed from: i */
    private final void m697i() {
        if (this.f447a != null) {
            mo600e(this.f452d);
            Rect rect = this.f452d;
            afn.m681a(rect, rect, f450b * 0.7f);
            this.f451c.mo591a(this.f452d.width(), this.f452d.height(), this.f447a);
        }
    }

    /* renamed from: a */
    public final Layout.Alignment mo589a() {
        mo596c(this.f453e);
        if (afn.m682a(this.f453e)) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return this.f451c.mo589a();
    }

    /* renamed from: b */
    public final int mo593b() {
        ComplicationData complicationData = this.f447a;
        mo596c(this.f453e);
        if (afn.m682a(this.f453e)) {
            return complicationData.mo1723a() == null ? 16 : 80;
        }
        return this.f451c.mo593b();
    }

    /* renamed from: c */
    public final Layout.Alignment mo595c() {
        return mo589a();
    }

    /* renamed from: d */
    public final int mo597d() {
        return 48;
    }

    /* renamed from: e */
    public final void mo600e(Rect rect) {
        mo596c(rect);
        if (this.f447a.mo1724b() == null || !afn.m682a(rect)) {
            afn.m686e(rect, rect);
            afn.m681a(rect, rect, 0.95f);
            return;
        }
        afn.m680a(rect, rect);
        afn.m681a(rect, rect, 0.95f);
    }

    /* renamed from: f */
    public final void mo602f(Rect rect) {
        ComplicationData complicationData = this.f447a;
        if (complicationData.mo1724b() == null) {
            rect.setEmpty();
            return;
        }
        mo596c(rect);
        if (!afn.m682a(rect)) {
            this.f451c.mo602f(rect);
            rect.offset(this.f452d.left, this.f452d.top);
        } else if (complicationData.mo1723a() == null || complicationData.mo1728e() != null) {
            afn.m683b(rect, rect);
        } else {
            afn.m683b(rect, rect);
            afn.m684c(rect, rect);
        }
    }

    /* renamed from: g */
    public final void mo604g(Rect rect) {
        ComplicationData complicationData = this.f447a;
        if (complicationData.mo1723a() == null || complicationData.mo1724b() == null) {
            rect.setEmpty();
            return;
        }
        mo596c(rect);
        if (afn.m682a(rect)) {
            afn.m683b(rect, rect);
            afn.m685d(rect, rect);
            return;
        }
        this.f451c.mo604g(rect);
        rect.offset(this.f452d.left, this.f452d.top);
    }

    /* renamed from: a */
    public final void mo590a(int i) {
        super.mo590a(i);
        m697i();
    }

    /* renamed from: b */
    public final void mo594b(int i) {
        super.mo594b(i);
        m697i();
    }

    /* renamed from: a */
    public final void mo587a(Rect rect) {
        ComplicationData complicationData = this.f447a;
        if (complicationData.mo1728e() == null) {
            rect.setEmpty();
            return;
        }
        mo596c(rect);
        if (complicationData.mo1724b() == null || afn.m682a(rect)) {
            afn.m681a(rect, this.f452d, 0.7f);
            return;
        }
        this.f451c.mo587a(rect);
        rect.offset(this.f452d.left, this.f452d.top);
    }

    /* renamed from: a */
    public final void mo592a(ComplicationData complicationData) {
        this.f447a = complicationData;
        m697i();
    }
}
