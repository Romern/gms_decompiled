package p000;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: sop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sop extends Animation {

    /* renamed from: a */
    final /* synthetic */ sov f44870a;

    public sop(sov sov) {
        this.f44870a = sov;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        double floor = Math.floor((double) (this.f44870a.f44889l / 0.8f));
        sov sov = this.f44870a;
        float f2 = sov.f44887j;
        sov.mo25900a(f2 + ((sov.f44888k - f2) * f));
        sov sov2 = this.f44870a;
        float f3 = sov2.f44889l;
        sov2.mo25905c(f3 + ((((float) (floor + 1.0d)) - f3) * f));
        sov sov3 = this.f44870a;
        float f4 = 1.0f - f;
        if (f4 != sov3.f44890m) {
            sov3.f44890m = f4;
            sov3.mo25906d();
        }
    }
}
