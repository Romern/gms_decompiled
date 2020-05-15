package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: bfid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfid extends bfij {

    /* renamed from: l */
    private final BroadcastReceiver f114000l = new bfic(this);

    public bfid(Context context, bfev bfev, bflc bflc, bfew bfew, bhdb bhdb, long j, bfig bfig) {
        super(context, bfev, bflc, bfew, bhdb, j, bfig);
    }

    /* renamed from: c */
    public final void mo61712c() {
        try {
            this.f114007b.startScan();
        } catch (NullPointerException e) {
        }
    }

    /* renamed from: d */
    public final void mo61713d() {
        this.f114006a.registerReceiver(this.f114000l, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
    }

    /* renamed from: e */
    public final void mo61714e() {
        this.f114006a.unregisterReceiver(this.f114000l);
    }
}
