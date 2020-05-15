package p000;

import android.opengl.Matrix;

/* renamed from: opl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class opl extends ooz {

    /* renamed from: a */
    private final int f38174a;

    /* renamed from: l */
    private final int f38175l;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    public opl(oow oow, float f) {
        super(Math.max(150L, 75L), f);
        this.f38174a = oow.f38141d;
        this.f38175l = (oow.f38138a + oow.f38142e) / 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final opa mo22472a(boolean z, long j) {
        float f = (float) j;
        float a = f38152b.mo22477a(f, 0.0f, 75.0f);
        float a2 = f38152b.mo22477a(f, 0.0f, 150.0f);
        float f2 = ((1.0f - a) * 0.100000024f) + 0.9f;
        Matrix.scaleM(this.f38161k.f38162a, 0, ooz.f38157g, 0, f2, 1.0f, 1.0f);
        Matrix.translateM(this.f38161k.f38162a, 0, (1.0f - f2) * ((float) this.f38175l), 0.0f, 0.0f);
        Matrix.translateM(this.f38161k.f38162a, 0, 0.0f, a2 * ((float) this.f38174a), 0.0f);
        return this.f38161k;
    }
}
