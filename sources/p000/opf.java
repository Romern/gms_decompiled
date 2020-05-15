package p000;

import android.opengl.Matrix;

/* renamed from: opf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class opf extends ooz {
    public opf(float f) {
        super(75, f);
        Matrix.setIdentityM(this.f38161k.f38162a, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final opa mo22472a(boolean z, long j) {
        float a = f38154d.mo22477a((float) j, 0.0f, 75.0f);
        opa opa = this.f38161k;
        opa.f38163b = 1.0f - a;
        return opa;
    }
}
