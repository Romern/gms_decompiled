package p000;

import android.bluetooth.le.ScanResult;
import android.os.SystemClock;
import com.google.location.nearby.direct.bluetooth.state.FastPairScanner$1;

/* renamed from: buxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buxw extends buqn {

    /* renamed from: a */
    final /* synthetic */ int f155276a;

    /* renamed from: b */
    final /* synthetic */ ScanResult f155277b;

    /* renamed from: c */
    final /* synthetic */ FastPairScanner$1 f155278c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buxw(FastPairScanner$1 fastPairScanner$1, String str, int i, ScanResult scanResult) {
        super(str);
        this.f155278c = fastPairScanner$1;
        this.f155276a = i;
        this.f155277b = scanResult;
    }

    public final void run() {
        buyc buyc = this.f155278c.f191765a;
        int i = buyc.f155286l;
        buyc.f155290c.mo13774a(this.f155276a, buyc.m120738a(this.f155277b));
        this.f155278c.f191765a.f155289b.put(this.f155277b.getDevice().getAddress(), Long.valueOf(SystemClock.elapsedRealtime()));
        this.f155278c.f191765a.mo73248b();
    }
}
