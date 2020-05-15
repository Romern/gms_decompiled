package p000;

import android.opengl.Matrix;
import android.os.SystemClock;

/* renamed from: ooz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ooz implements ooy {

    /* renamed from: g */
    protected static final float[] f38157g;

    /* renamed from: h */
    protected final long f38158h;

    /* renamed from: i */
    protected volatile long f38159i = SystemClock.elapsedRealtime();

    /* renamed from: j */
    protected final float f38160j;

    /* renamed from: k */
    protected final opa f38161k;

    static {
        float[] fArr = new float[16];
        f38157g = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public ooz(long j, float f) {
        this.f38158h = (long) Math.round(((float) j) * f);
        this.f38160j = f;
        this.f38161k = new opa();
    }

    /* renamed from: a */
    protected static int m29477a(int i, int i2) {
        return (i2 * i) / 160;
    }

    /* renamed from: a */
    public int mo22471a() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract opa mo22472a(boolean z, long j);

    /* renamed from: a */
    public boolean mo22474a(long j) {
        return j >= this.f38158h + this.f38159i;
    }

    /* renamed from: b */
    public final void mo22475b() {
        this.f38159i = SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final long mo22476c() {
        return this.f38158h;
    }

    /* renamed from: a */
    public final opa mo22473a(boolean z) {
        return mo22472a(z, SystemClock.elapsedRealtime() - this.f38159i);
    }
}
