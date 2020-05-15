package p000;

import android.view.View;

/* renamed from: adg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class adg extends abp {
    /* renamed from: a */
    public abstract boolean mo425a(acm acm);

    /* renamed from: a */
    public abstract boolean mo426a(acm acm, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public final boolean mo199a(acm acm, abo abo, abo abo2) {
        int i = abo.f105a;
        int i2 = abo.f106b;
        View view = acm.f201a;
        int left = abo2 != null ? abo2.f105a : view.getLeft();
        int top = abo2 != null ? abo2.f106b : view.getTop();
        if (acm.mo333n() || (i == left && i2 == top)) {
            return mo425a(acm);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo426a(acm, i, i2, left, top);
    }

    /* renamed from: a */
    public abstract boolean mo427a(acm acm, acm acm2, int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract boolean mo428b(acm acm);

    /* renamed from: b */
    public final boolean mo203b(acm acm, abo abo, abo abo2) {
        int i;
        int i2;
        if (abo == null || ((i = abo.f105a) == (i2 = abo2.f105a) && abo.f106b == abo2.f106b)) {
            return mo428b(acm);
        }
        return mo426a(acm, i, abo.f106b, i2, abo2.f106b);
    }

    /* renamed from: c */
    public final boolean mo204c(acm acm, abo abo, abo abo2) {
        int i = abo.f105a;
        int i2 = abo2.f105a;
        if (i != i2 || abo.f106b != abo2.f106b) {
            return mo426a(acm, i, abo.f106b, i2, abo2.f106b);
        }
        mo208e(acm);
        return false;
    }

    /* renamed from: f */
    public final boolean mo209f(acm acm) {
        return acm.mo330k();
    }

    /* renamed from: a */
    public final boolean mo200a(acm acm, acm acm2, abo abo, abo abo2) {
        int i;
        int i2;
        int i3 = abo.f105a;
        int i4 = abo.f106b;
        if (acm2.mo320aO()) {
            int i5 = abo.f105a;
            i = abo.f106b;
            i2 = i5;
        } else {
            i2 = abo2.f105a;
            i = abo2.f106b;
        }
        return mo427a(acm, acm2, i3, i4, i2, i);
    }
}
