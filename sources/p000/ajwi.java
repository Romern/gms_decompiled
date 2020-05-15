package p000;

import android.bluetooth.le.ScanResult;
import com.google.android.gms.nearby.sharing.discovery.FastInitiation$2;

/* renamed from: ajwi */
public final /* synthetic */ class ajwi implements Runnable {

    /* renamed from: a */
    private final FastInitiation$2 f71414a;

    /* renamed from: b */
    private final ScanResult f71415b;

    /* renamed from: c */
    private final ajjf f71416c;

    public ajwi(FastInitiation$2 fastInitiation$2, ajjf ajjf, ScanResult scanResult) {
        this.f71414a = fastInitiation$2;
        this.f71416c = ajjf;
        this.f71415b = scanResult;
    }

    public final void run() {
        FastInitiation$2 fastInitiation$2 = this.f71414a;
        fastInitiation$2.f81068a.mo38996a(this.f71416c, this.f71415b);
    }
}
