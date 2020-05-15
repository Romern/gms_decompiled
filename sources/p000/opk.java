package p000;

import android.opengl.Matrix;

/* renamed from: opk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class opk extends opn {

    /* renamed from: a */
    private final opb f38171a;

    /* renamed from: l */
    private final long f38172l;

    /* renamed from: m */
    private final int f38173m;

    public opk(opb opb, long j, long j2, int i, float f) {
        super(j2 + j, f);
        this.f38171a = opb;
        this.f38172l = j;
        this.f38173m = i;
        if (i != 0) {
            Matrix.translateM(this.f38161k.f38162a, 0, ooz.f38157g, 0, 0.0f, (float) this.f38173m, 0.0f);
        } else {
            Matrix.setIdentityM(this.f38161k.f38162a, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final opa mo22478b(long j) {
        long j2 = this.f38172l;
        if (j > j2) {
            float a = this.f38171a.mo22477a((float) j, (float) j2, (float) this.f38158h);
            int i = this.f38173m;
            Matrix.translateM(this.f38161k.f38162a, 0, ooz.f38157g, 0, (a * 0.0f) + 0.0f, ((float) i) + (((float) (-i)) * a), 0.0f);
        }
        return this.f38161k;
    }
}
