package p000;

import android.bluetooth.le.ScanResult;
import com.google.android.gms.nearby.discovery.fastpair.scanner.FastPairScanner$FastPairFoundScanCallback;

/* renamed from: ahzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahzg extends buqn {

    /* renamed from: a */
    final /* synthetic */ ScanResult f68455a;

    /* renamed from: b */
    final /* synthetic */ int f68456b;

    /* renamed from: c */
    final /* synthetic */ FastPairScanner$FastPairFoundScanCallback f68457c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahzg(FastPairScanner$FastPairFoundScanCallback fastPairScanner$FastPairFoundScanCallback, String str, ScanResult scanResult, int i) {
        super(str);
        this.f68457c = fastPairScanner$FastPairFoundScanCallback;
        this.f68455a = scanResult;
        this.f68456b = i;
    }

    public final void run() {
        this.f68457c.f80525a.mo37253b(this.f68455a, this.f68456b);
    }
}
