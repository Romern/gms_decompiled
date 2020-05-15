package p000;

import android.opengl.Matrix;

/* renamed from: opj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class opj extends ooz {

    /* renamed from: a */
    private final opb f38169a;

    /* renamed from: l */
    private final int f38170l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public opj(int i, float f) {
        super(225, f);
        oph oph = f38155e;
        this.f38169a = oph;
        this.f38170l = -ooz.m29477a(i, 240);
        Matrix.setIdentityM(this.f38161k.f38162a, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final opa mo22472a(boolean z, long j) {
        if (j > 75) {
            float a = this.f38169a.mo22477a((float) j, 75.0f, (float) this.f38158h);
            Matrix.translateM(this.f38161k.f38162a, 0, ooz.f38157g, 0, (a * 0.0f) + 0.0f, (((float) this.f38170l) * a) + 0.0f, 0.0f);
        }
        return this.f38161k;
    }
}
