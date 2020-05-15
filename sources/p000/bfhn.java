package p000;

import android.hardware.Sensor;

/* renamed from: bfhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfhn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bfgw f113926a;

    /* renamed from: b */
    final /* synthetic */ Sensor f113927b;

    /* renamed from: c */
    final /* synthetic */ long f113928c;

    /* renamed from: d */
    final /* synthetic */ long f113929d;

    /* renamed from: e */
    final /* synthetic */ float f113930e;

    /* renamed from: f */
    final /* synthetic */ float f113931f;

    /* renamed from: g */
    final /* synthetic */ float f113932g;

    /* renamed from: h */
    final /* synthetic */ float f113933h;

    /* renamed from: i */
    final /* synthetic */ float f113934i;

    /* renamed from: j */
    final /* synthetic */ float f113935j;

    public bfhn(bfgw bfgw, Sensor sensor, long j, long j2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.f113926a = bfgw;
        this.f113927b = sensor;
        this.f113928c = j;
        this.f113929d = j2;
        this.f113930e = f;
        this.f113931f = f2;
        this.f113932g = f3;
        this.f113933h = f4;
        this.f113934i = f5;
        this.f113935j = f6;
    }

    public final void run() {
        this.f113926a.mo61676a(this.f113927b.getType(), this.f113928c, this.f113929d / 1000000, 0, this.f113930e, this.f113931f, this.f113932g, this.f113933h, this.f113934i, this.f113935j, null);
    }
}
