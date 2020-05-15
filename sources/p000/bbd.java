package p000;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* renamed from: bbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbd implements bbl {

    /* renamed from: a */
    public final List f2828a;

    public bbd() {
        this.f2828a = Collections.singletonList(new beo(new PointF(0.0f, 0.0f)));
    }

    /* renamed from: a */
    public final azy mo2972a() {
        if (((beo) this.f2828a.get(0)).mo3071d()) {
            return new bah(this.f2828a);
        }
        return new bag(this.f2828a);
    }

    /* renamed from: b */
    public final List mo2974b() {
        return this.f2828a;
    }

    /* renamed from: c */
    public final boolean mo2975c() {
        return this.f2828a.size() == 1 && ((beo) this.f2828a.get(0)).mo3071d();
    }

    public bbd(List list) {
        this.f2828a = list;
    }
}
