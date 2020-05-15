package p000;

import android.opengl.Matrix;

/* renamed from: opc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class opc extends ooz {

    /* renamed from: a */
    private final int f38164a;

    /* renamed from: l */
    private final int f38165l;

    /* renamed from: m */
    private final int f38166m;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    public opc(oow oow, int i, float f) {
        super(Math.max(Math.max(250L, 250L), 250L), f);
        this.f38164a = ooz.m29477a(i, 16);
        this.f38165l = (oow.f38138a + oow.f38142e) / 2;
        this.f38166m = (oow.f38139b + oow.f38143f) / 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final opa mo22472a(boolean z, long j) {
        float f = (float) j;
        float a = f38152b.mo22477a(f, 0.0f, 250.0f);
        float a2 = f38155e.mo22477a(f, 0.0f, 250.0f);
        float a3 = f38154d.mo22477a(f, 100.0f, 250.0f);
        float f2 = ((1.0f - a) * 0.07999998f) + 0.92f;
        Matrix.scaleM(this.f38161k.f38162a, 0, ooz.f38157g, 0, f2, f2, 1.0f);
        float f3 = 1.0f - f2;
        Matrix.translateM(this.f38161k.f38162a, 0, ((float) this.f38165l) * f3, f3 * ((float) this.f38166m), 0.0f);
        Matrix.translateM(this.f38161k.f38162a, 0, 0.0f, (-a2) * ((float) this.f38164a), 0.0f);
        opa opa = this.f38161k;
        opa.f38163b = 1.0f - a3;
        return opa;
    }
}
