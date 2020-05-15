package p000;

import android.os.SystemClock;

/* renamed from: vpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vpm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f49717a;

    /* renamed from: b */
    final /* synthetic */ vpn f49718b;

    public vpm(vpn vpn, long j) {
        this.f49718b = vpn;
        this.f49717a = j;
    }

    public final void run() {
        SystemClock.sleep(this.f49718b.f49723d - this.f49717a);
        this.f49718b.f49721b.run();
    }
}
