package p000;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: sor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sor extends Animation {

    /* renamed from: a */
    final /* synthetic */ sov f44873a;

    /* renamed from: b */
    final /* synthetic */ sox f44874b;

    public sor(sox sox, sov sov) {
        this.f44874b = sox;
        this.f44873a = sov;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        sov sov = this.f44873a;
        double d = (double) sov.f44883f;
        Double.isNaN(d);
        double radians = Math.toRadians(d / (sov.f44891n * 6.283185307179586d));
        sov sov2 = this.f44873a;
        float f2 = sov2.f44888k;
        float f3 = sov2.f44887j;
        float f4 = sov2.f44889l;
        this.f44873a.mo25903b(f2 + ((0.8f - ((float) radians)) * sox.f44897b.getInterpolation(f)));
        this.f44873a.mo25900a(f3 + (sox.f44896a.getInterpolation(f) * 0.8f));
        this.f44873a.mo25905c(f4 + (0.25f * f));
        sox sox = this.f44874b;
        sox.mo25909a((f * 144.0f) + ((sox.f44902e / 5.0f) * 720.0f));
    }
}
