package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: bunk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bunk {

    /* renamed from: a */
    public final buni f154365a;

    /* renamed from: b */
    public final bunl f154366b;

    /* renamed from: c */
    public final bunj f154367c;

    /* renamed from: d */
    public boolean f154368d = false;

    /* renamed from: e */
    public float f154369e;

    /* renamed from: f */
    public float f154370f;

    /* renamed from: g */
    public float f154371g;

    /* renamed from: h */
    public double f154372h = Double.NaN;

    /* renamed from: i */
    public long f154373i = Long.MIN_VALUE;

    /* renamed from: j */
    public final bunm f154374j;

    /* renamed from: k */
    public final bunr f154375k;

    public bunk() {
        bunl bunl = new bunl();
        buni buni = new buni(null);
        bunj bunj = new bunj();
        bunm bunm = new bunm();
        this.f154366b = bunl;
        this.f154367c = bunj;
        this.f154365a = buni;
        this.f154375k = bunr.m120087a();
        this.f154374j = bunm;
    }

    /* renamed from: a */
    public final boolean mo72898a(long j) {
        return this.f154373i != Long.MIN_VALUE && TimeUnit.NANOSECONDS.toSeconds(j - this.f154373i) < 1 && !Double.isNaN(this.f154372h) && this.f154365a.f154325c;
    }

    /* renamed from: b */
    public final float[] mo72899b(long j) {
        if (!mo72898a(j)) {
            return null;
        }
        buni buni = this.f154365a;
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                buni.f154323a[(i * 3) + i2] = (float) buni.f154324b.f154393a[(i2 * 3) + i];
            }
        }
        return buni.f154323a;
    }
}
