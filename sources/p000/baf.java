package p000;

import android.graphics.Path;
import android.graphics.PointF;

/* renamed from: baf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baf extends beo {

    /* renamed from: a */
    public Path f2756a;

    /* renamed from: m */
    private final beo f2757m;

    public baf(axw axw, beo beo) {
        super(axw, beo.f3103b, beo.f3104c, beo.f3105d, beo.f3106e, beo.f3107f);
        this.f2757m = beo;
        mo2952a();
    }

    /* renamed from: a */
    public final void mo2952a() {
        Object obj;
        Object obj2 = this.f3104c;
        boolean z = false;
        if (!(obj2 == null || (obj = this.f3103b) == null || !((PointF) obj).equals(((PointF) obj2).x, ((PointF) this.f3104c).y))) {
            z = true;
        }
        Object obj3 = this.f3104c;
        if (obj3 != null && !z) {
            beo beo = this.f2757m;
            this.f2756a = ben.m2833a((PointF) this.f3103b, (PointF) obj3, beo.f3112k, beo.f3113l);
        }
    }
}
