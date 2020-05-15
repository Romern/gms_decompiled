package p000;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* renamed from: bag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bag extends bad {

    /* renamed from: e */
    private final PointF f2758e = new PointF();

    /* renamed from: f */
    private final float[] f2759f = new float[2];

    /* renamed from: g */
    private baf f2760g;

    /* renamed from: h */
    private final PathMeasure f2761h = new PathMeasure();

    public bag(List list) {
        super(list);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2936a(beo beo, float f) {
        baf baf = (baf) beo;
        Path path = baf.f2756a;
        if (path == null) {
            return (PointF) beo.f3103b;
        }
        beq beq = this.f2743d;
        if (beq != null) {
            float f2 = baf.f3106e;
            baf.f3107f.floatValue();
            Object obj = baf.f3103b;
            Object obj2 = baf.f3104c;
            mo2941c();
            return (PointF) beq.f3116a;
        }
        if (this.f2760g != baf) {
            this.f2761h.setPath(path, false);
            this.f2760g = baf;
        }
        PathMeasure pathMeasure = this.f2761h;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f2759f, null);
        PointF pointF = this.f2758e;
        float[] fArr = this.f2759f;
        pointF.set(fArr[0], fArr[1]);
        return this.f2758e;
    }
}
