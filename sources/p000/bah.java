package p000;

import android.graphics.PointF;
import java.util.List;

/* renamed from: bah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bah extends bad {

    /* renamed from: e */
    private final PointF f2762e = new PointF();

    public bah(List list) {
        super(list);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2936a(beo beo, float f) {
        Object obj;
        Object obj2 = beo.f3103b;
        if (obj2 == null || (obj = beo.f3104c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        beq beq = this.f2743d;
        if (beq != null) {
            float f2 = beo.f3106e;
            beo.f3107f.floatValue();
            mo2941c();
            return (PointF) beq.f3116a;
        }
        this.f2762e.set(pointF.x + ((pointF2.x - pointF.x) * f), pointF.y + (f * (pointF2.y - pointF.y)));
        return this.f2762e;
    }
}
