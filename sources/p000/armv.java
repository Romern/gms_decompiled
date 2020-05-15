package p000;

import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: armv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class armv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Device f87934a;

    /* renamed from: b */
    final /* synthetic */ byte[] f87935b;

    /* renamed from: c */
    final /* synthetic */ arnb f87936c;

    public armv(arnb arnb, Device device, byte[] bArr) {
        this.f87936c = arnb;
        this.f87934a = device;
        this.f87935b = bArr;
    }

    public final void run() {
        this.f87936c.f87946e.mo36305a(this.f87934a, this.f87935b);
    }
}
