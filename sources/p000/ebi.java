package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import com.google.android.contextmanager.producer.module.WifiScanProducer$WifiReceiver;

/* renamed from: ebi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ebi extends dye {

    /* renamed from: b */
    public static final dxr f14592b = new dxr(new ebg(), "WifiScanProducer", new int[]{17}, null);

    /* renamed from: k */
    protected final WifiManager f14593k = ((WifiManager) this.f14388d.getSystemService("wifi"));

    /* renamed from: l */
    protected final WifiScanProducer$WifiReceiver f14594l = new WifiScanProducer$WifiReceiver(this);

    /* renamed from: m */
    public long f14595m = 0;

    public ebi(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14592b, str, dqb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9845a() {
        this.f14388d.registerReceiver(this.f14594l, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
        this.f14593k.startScan();
        this.f14595m = dwq.m9665i().mo20506b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9848b() {
        this.f14388d.unregisterReceiver(this.f14594l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo9864j() {
        if (mo9865k() <= 0) {
            this.f14593k.startScan();
            this.f14595m = dwq.m9665i().mo20506b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final long mo9865k() {
        long j = this.f14595m;
        if (j != 0) {
            return (j + 300000) - dwq.m9665i().mo20506b();
        }
        return 0;
    }
}
