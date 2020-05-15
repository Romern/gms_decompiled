package p000;

import android.hardware.Sensor;

/* renamed from: bfhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfhm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bfgw f113919a;

    /* renamed from: b */
    final /* synthetic */ Sensor f113920b;

    /* renamed from: c */
    final /* synthetic */ long f113921c;

    /* renamed from: d */
    final /* synthetic */ long f113922d;

    /* renamed from: e */
    final /* synthetic */ float f113923e;

    /* renamed from: f */
    final /* synthetic */ float f113924f;

    /* renamed from: g */
    final /* synthetic */ float f113925g;

    public bfhm(bfgw bfgw, Sensor sensor, long j, long j2, float f, float f2, float f3) {
        this.f113919a = bfgw;
        this.f113920b = sensor;
        this.f113921c = j;
        this.f113922d = j2;
        this.f113923e = f;
        this.f113924f = f2;
        this.f113925g = f3;
    }

    public final void run() {
        this.f113919a.mo61677a(this.f113920b.getType(), this.f113921c, this.f113922d / 1000000, 0, this.f113923e, this.f113924f, this.f113925g, null);
    }
}
