package p000;

import android.graphics.PointF;

/* renamed from: bdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdp implements bea {

    /* renamed from: a */
    public static final bdp f3050a = new bdp();

    private bdp() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2999a(bef bef, float f) {
        int n = bef.mo3035n();
        if (n == 1) {
            return bdi.m2730b(bef, f);
        }
        if (n == 3) {
            return bdi.m2730b(bef, f);
        }
        if (n == 7) {
            PointF pointF = new PointF(((float) bef.mo3031j()) * f, ((float) bef.mo3031j()) * f);
            while (bef.mo3026e()) {
                bef.mo3033l();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + ((Object) bee.m2755a(n)));
    }
}
