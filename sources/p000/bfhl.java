package p000;

import android.hardware.Sensor;

/* renamed from: bfhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfhl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bfgw f113914a;

    /* renamed from: b */
    final /* synthetic */ Sensor f113915b;

    /* renamed from: c */
    final /* synthetic */ long f113916c;

    /* renamed from: d */
    final /* synthetic */ long f113917d;

    /* renamed from: e */
    final /* synthetic */ float f113918e;

    public bfhl(bfgw bfgw, Sensor sensor, long j, long j2, float f) {
        this.f113914a = bfgw;
        this.f113915b = sensor;
        this.f113916c = j;
        this.f113917d = j2;
        this.f113918e = f;
    }

    public final void run() {
        this.f113914a.mo61678a(this.f113915b.getType(), this.f113916c, this.f113917d / 1000000, 0, this.f113918e, null);
    }
}
