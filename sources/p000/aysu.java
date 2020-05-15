package p000;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;

/* renamed from: aysu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aysu extends ScanCallback {

    /* renamed from: a */
    final /* synthetic */ aysv f98428a;

    public aysu(aysv aysv) {
        this.f98428a = aysv;
    }

    public final void onScanFailed(int i) {
        this.f98428a.mo54333a(i);
    }

    public final void onScanResult(int i, ScanResult scanResult) {
        this.f98428a.mo54334a(new aysw(scanResult));
    }
}
